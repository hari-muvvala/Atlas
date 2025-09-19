package trainertasks.day32;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task04_InsertFromJson {
    public static void main(String[] args) throws Exception {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        InputStream jsonStream = Task04_InsertFromJson.class.getClassLoader().getResourceAsStream("Employee32.json");
        if (jsonStream == null) {
            System.err.println("Employee32.json not found");
            return;
        }

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(jsonStream);
        Iterator<JsonNode> it = root.elements();

        while (it.hasNext()) {
            JsonNode node = it.next();
            Map<String, AttributeValue> item = new HashMap<>();
            item.put("ID", AttributeValue.builder().n(node.get("ID").asText()).build());
            item.put("Name", AttributeValue.builder().s(node.get("Name").asText()).build());
            item.put("Address", AttributeValue.builder().s(node.get("Address").asText()).build());

            client.putItem(PutItemRequest.builder().tableName("Employees32").item(item).build());
            System.out.println("Inserted: " + node);
        }

        client.close();
    }
}