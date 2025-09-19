package trainertasks.day33;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.net.URI;
import java.util.Arrays;

public class Task01_CreateTable {
    public static void main(String[] args) {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000")) // if local workbench runs on 8001, change to http://localhost:8001
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        String tableName = "Employees33";

        try {
            CreateTableRequest req = CreateTableRequest.builder()
                    .tableName(tableName)
                    .keySchema(Arrays.asList(
                            KeySchemaElement.builder().attributeName("ID").keyType(KeyType.HASH).build(),   // partition key
                            KeySchemaElement.builder().attributeName("Dept").keyType(KeyType.RANGE).build() // sort key
                    ))
                    .attributeDefinitions(Arrays.asList(
                            AttributeDefinition.builder().attributeName("ID").attributeType(ScalarAttributeType.N).build(),
                            AttributeDefinition.builder().attributeName("Dept").attributeType(ScalarAttributeType.S).build()
                    ))
                    .provisionedThroughput(ProvisionedThroughput.builder()
                            .readCapacityUnits(5L).writeCapacityUnits(5L).build())
                    .build();

            client.createTable(req);
            System.out.println("Table created: " + tableName);
        } catch (ResourceInUseException e) {
            System.out.println("Table already exists: " + tableName);
        } finally {
            client.close();
        }
    }
}