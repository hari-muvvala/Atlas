package trainertasks.day33;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.ScanRequest;
import software.amazon.awssdk.services.dynamodb.model.ScanResponse;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Task05_ScanWithFilter {
    public static void main(String[] args) {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        Map<String, String> names = new HashMap<>();
        names.put("#d", "Dept");

        Map<String, AttributeValue> values = new HashMap<>();
        values.put(":dept", AttributeValue.builder().s("IT").build());

        ScanRequest req = ScanRequest.builder()
                .tableName("Employees33")
                .filterExpression("#d = :dept")
                .expressionAttributeNames(names)
                .expressionAttributeValues(values)
                .build();

        ScanResponse resp = client.scan(req);
        System.out.println("Filtered count: " + resp.count());
        resp.items().forEach(System.out::println);

        client.close();
    }
}