package trainertasks.day30;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.net.URI;

public class Task02_CreateTable {
    public static void main(String[] args) {
        AwsBasicCredentials creds = AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000")) // change to 8001 if needed
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();

        String tableName = "Employees01";

        try {
            CreateTableRequest request = CreateTableRequest.builder()
                    .tableName(tableName)
                    .keySchema(KeySchemaElement.builder()
                            .attributeName("ID")
                            .keyType(KeyType.HASH) // partition key
                            .build())
                    .attributeDefinitions(AttributeDefinition.builder()
                            .attributeName("ID")
                            .attributeType(ScalarAttributeType.N)
                            .build())
                    .provisionedThroughput(ProvisionedThroughput.builder()
                            .readCapacityUnits(5L)
                            .writeCapacityUnits(5L)
                            .build())
                    .build();

            client.createTable(request);
            System.out.println("Table created: " + tableName);
        } catch (ResourceInUseException e) {
            System.out.println("Table already exists: " + tableName);
        } catch (DynamoDbException e) {
            System.out.println("Failed to create table: " + e.getMessage());
        } finally {
            client.close();
        }
    }
}