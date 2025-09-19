package trainertasks.day32;

import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dax.DaxClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class DaxDemo {
    public static void main(String[] args) {
        String daxEndpoint = "daxs://your-dax-cluster.ap-south-1.amazonaws.com";

        DaxClient daxClient = DaxClient.builder()
                .endpointOverride(URI.create(daxEndpoint))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(DefaultCredentialsProvider.create())
                .build();

        Map<String, AttributeValue> item = new HashMap<>();
        item.put("ID", AttributeValue.builder().s("3001").build());
        item.put("Note", AttributeValue.builder().s("DAX test item").build());

        daxClient.putItem(PutItemRequest.builder().tableName("Employees32").item(item).build());
        System.out.println("Inserted item into DAX cluster.");

        daxClient.close();
    }
}