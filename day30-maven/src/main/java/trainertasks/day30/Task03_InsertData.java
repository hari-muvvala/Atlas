package trainertasks.day30;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.DynamoDbException;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task03_InsertData {
    public static void main(String[] args) throws Exception {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000")) // change to 8001 if needed
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        String tableName = "Employees01";

        // Load JSON from classpath: src/main/resources/Employee.json
        InputStream jsonStream = Task03_InsertData.class.getClassLoader()
                .getResourceAsStream("Employee.json");

        if (jsonStream == null) {
            System.err.println("Employee.json not found in src/main/resources");
            client.close();
            return;
        }

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(jsonStream);
        Iterator<JsonNode> it = root.elements();

        int count = 0;
        while (it.hasNext()) {
            JsonNode node = it.next();

            Map<String, AttributeValue> item = new HashMap<>();
            item.put("ID", AttributeValue.builder().n(node.get("ID").asText()).build());
            item.put("Name", AttributeValue.builder().s(node.get("Name").asText()).build());
            item.put("Address", AttributeValue.builder().s(node.get("Address").asText()).build());

            PutItemRequest put = PutItemRequest.builder()
                    .tableName(tableName)
                    .item(item)
                    .build();

            try {
                client.putItem(put);
                System.out.printf("Inserted: %s - %s - %s%n",
                        node.get("ID").asText(),
                        node.get("Name").asText(),
                        node.get("Address").asText());
                count++;
            } catch (DynamoDbException e) {
                System.out.println("Insert failed: " + e.getMessage());
            }
        }

        client.close();
        System.out.println("Total inserted: " + count);
    }
}