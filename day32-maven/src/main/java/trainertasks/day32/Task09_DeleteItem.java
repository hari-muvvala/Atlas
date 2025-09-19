package trainertasks.day32;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.DeleteItemRequest;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Task09_DeleteItem {
    public static void main(String[] args) {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        Map<String, AttributeValue> key = new HashMap<>();
        key.put("ID", AttributeValue.builder().n("1002").build());

        DeleteItemRequest req = DeleteItemRequest.builder()
                .tableName("Employees32")
                .key(key)
                .build();

        client.deleteItem(req);
        System.out.println("Item deleted.");

        client.close();
    }
}