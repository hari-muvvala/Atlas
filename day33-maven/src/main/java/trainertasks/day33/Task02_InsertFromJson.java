package trainertasks.day33;

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

public class Task02_InsertFromJson {
    public static void main(String[] args) throws Exception {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        String tableName = "Employees33";

        InputStream json = Task02_InsertFromJson.class.getClassLoader().getResourceAsStream("Employee33.json");
        if (json == null) {
            System.err.println("Employee33.json not found under src/main/resources");
            client.close();
            return;
        }

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);
        Iterator<JsonNode> it = root.elements();

        int count = 0;
        while (it.hasNext()) {
            JsonNode n = it.next();

            Map<String, AttributeValue> item = new HashMap<>();
            item.put("ID", AttributeValue.builder().n(n.get("ID").asText()).build());
            item.put("Dept", AttributeValue.builder().s(n.get("Dept").asText()).build());
            item.put("Name", AttributeValue.builder().s(n.get("Name").asText()).build());
            item.put("Address", AttributeValue.builder().s(n.get("Address").asText()).build());

            PutItemRequest put = PutItemRequest.builder().tableName(tableName).item(item).build();
            client.putItem(put);
            count++;
        }

        client.close();
        System.out.println("Total inserted: " + count);
    }
}