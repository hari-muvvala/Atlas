package trainertasks.day30;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.ScanRequest;
import software.amazon.awssdk.services.dynamodb.model.ScanResponse;

import java.net.URI;
import java.util.Map;

public class Task04_ScanData {
    public static void main(String[] args) {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000")) // change if 8001
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        String tableName = "Employees01";

        ScanRequest req = ScanRequest.builder()
                .tableName(tableName)
                .build();

        ScanResponse resp = client.scan(req);
        System.out.println("Items in table " + tableName + ":");
        for (Map<String, AttributeValue> item : resp.items()) {
            System.out.println(item);
        }

        client.close();
    }
}