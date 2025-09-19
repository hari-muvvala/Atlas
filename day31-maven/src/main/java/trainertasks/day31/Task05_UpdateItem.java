package trainertasks.day31;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.UpdateItemRequest;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Task05_UpdateItem {
    public static void main(String[] args) {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        String tableName = "Employees31";
        String idToUpdate = "1002";

        Map<String, AttributeValue> key = new HashMap<>();
        key.put("ID", AttributeValue.builder().n(idToUpdate).build());

        Map<String, String> names = new HashMap<>();
        names.put("#A", "Address");
        names.put("#D", "Department");

        Map<String, AttributeValue> values = new HashMap<>();
        values.put(":a", AttributeValue.builder().s("Pune").build());
        values.put(":d", AttributeValue.builder().s("Engineering").build());

        UpdateItemRequest req = UpdateItemRequest.builder()
                .tableName(tableName)
                .key(key)
                .updateExpression("SET #A = :a, #D = :d")
                .expressionAttributeNames(names)
                .expressionAttributeValues(values)
                .build();

        client.updateItem(req);
        System.out.println("Item updated for ID=" + idToUpdate);

        client.close();
    }
}