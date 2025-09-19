package trainertasks.day32;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Task06_InsertOne {
    public static void main(String[] args) {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        Map<String, AttributeValue> item = new HashMap<>();
        item.put("ID", AttributeValue.builder().n("2001").build());
        item.put("Name", AttributeValue.builder().s("Test User").build());
        item.put("Address", AttributeValue.builder().s("Delhi").build());

        client.putItem(PutItemRequest.builder().tableName("Employees32").item(item).build());
        System.out.println("One item inserted manually.");

        client.close();
    }
}