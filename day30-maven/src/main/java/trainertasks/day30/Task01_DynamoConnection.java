package trainertasks.day30;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

import java.net.URI;

public class Task01_DynamoConnection {
    public static void main(String[] args) {
        System.out.println("Testing DynamoDB connection (local)…");

        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                // If local Workbench runs on 8001, change to http://localhost:8001
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        System.out.println("Client created successfully.");
        client.close();
        System.out.println("Client closed.");
    }
}