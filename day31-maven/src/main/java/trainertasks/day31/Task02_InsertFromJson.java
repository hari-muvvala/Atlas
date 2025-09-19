package trainertasks.day31;

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

public class Task02_InsertFromJson {
    public static void main(String[] args) throws Exception {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        String tableName = "Employees31";

        InputStream jsonStream = Task02_InsertFromJson.class.getClassLoader()
                .getResourceAsStream("Employee31.json");
        if (jsonStream == null) {
            System.err.println("Employee31.json not found under src/main/resources");
            client.close();
            return;
        }

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(jsonStream);
        Iterator<JsonNode> it = root.elements();

        int count = 0;
        while (it.hasNext()) {
            JsonNode n = it.next();

            Map<String, AttributeValue> item = new HashMap<>();
            item.put("ID", AttributeValue.builder().n(n.get("ID").asText()).build());
            item.put("Name", AttributeValue.builder().s(n.get("Name").asText()).build());
            item.put("Address", AttributeValue.builder().s(n.get("Address").asText()).build());
            if (n.has("Department")) {
                item.put("Department", AttributeValue.builder().s(n.get("Department").asText()).build());
            }

            PutItemRequest put = PutItemRequest.builder().tableName(tableName).item(item).build();
            try {
                client.putItem(put);
                count++;
            } catch (DynamoDbException e) {
                System.out.println("Insert failed for ID=" + n.get("ID").asText() + " : " + e.getMessage());
            }
        }

        client.close();
        System.out.println("Total inserted: " + count);
    }
}