package trainertasks.day33;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.UpdateItemRequest;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Task06_UpdateItem {
    public static void main(String[] args) {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        String tableName = "Employees33";

        Map<String, AttributeValue> key = new HashMap<>();
        key.put("ID", AttributeValue.builder().n("1003").build());
        key.put("Dept", AttributeValue.builder().s("Finance").build());

        Map<String, String> names = new HashMap<>();
        names.put("#addr", "Address");
        names.put("#nm", "Name");

        Map<String, AttributeValue> vals = new HashMap<>();
        vals.put(":a", AttributeValue.builder().s("Kochi").build());
        vals.put(":n", AttributeValue.builder().s("Srinivas K").build());

        UpdateItemRequest req = UpdateItemRequest.builder()
                .tableName(tableName)
                .key(key)
                .updateExpression("SET #addr = :a, #nm = :n")
                .expressionAttributeNames(names)
                .expressionAttributeValues(vals)
                .build();

        client.updateItem(req);
        System.out.println("Item updated for ID=1003, Dept=Finance");

        client.close();
    }
}