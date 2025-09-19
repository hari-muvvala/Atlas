package trainertasks.day31;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.DeleteItemRequest;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Task06_DeleteItem {
    public static void main(String[] args) {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        String tableName = "Employees31";
        String idToDelete = "1003";

        Map<String, AttributeValue> key = new HashMap<>();
        key.put("ID", AttributeValue.builder().n(idToDelete).build());

        DeleteItemRequest req = DeleteItemRequest.builder()
                .tableName(tableName)
                .key(key)
                .build();

        client.deleteItem(req);
        System.out.println("Item deleted for ID=" + idToDelete);

        client.close();
    }
}