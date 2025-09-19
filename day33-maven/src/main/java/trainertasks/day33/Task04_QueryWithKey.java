package trainertasks.day33;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.QueryRequest;
import software.amazon.awssdk.services.dynamodb.model.QueryResponse;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Task04_QueryWithKey {
    public static void main(String[] args) {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        String tableName = "Employees33";

        // Example: query all items for ID = 1002 and Dept begins_with "I"
        Map<String, String> names = new HashMap<>();
        names.put("#id", "ID");
        names.put("#d", "Dept");

        Map<String, AttributeValue> values = new HashMap<>();
        values.put(":idv", AttributeValue.builder().n("1002").build());
        values.put(":prefix", AttributeValue.builder().s("I").build());

        QueryRequest req = QueryRequest.builder()
                .tableName(tableName)
                .keyConditionExpression("#id = :idv AND begins_with(#d, :prefix)")
                .expressionAttributeNames(names)
                .expressionAttributeValues(values)
                .build();

        QueryResponse resp = client.query(req);
        System.out.println("Query count: " + resp.count());
        resp.items().forEach(System.out::println);

        client.close();
    }
}