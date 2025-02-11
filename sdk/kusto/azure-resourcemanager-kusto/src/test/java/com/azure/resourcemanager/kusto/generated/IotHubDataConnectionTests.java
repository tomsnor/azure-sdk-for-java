// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.DatabaseRouting;
import com.azure.resourcemanager.kusto.models.IotHubDataConnection;
import com.azure.resourcemanager.kusto.models.IotHubDataFormat;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IotHubDataConnectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IotHubDataConnection model =
            BinaryData
                .fromString(
                    "{\"kind\":\"IotHub\",\"properties\":{\"iotHubResourceId\":\"tx\",\"consumerGroup\":\"gzukxitmm\",\"tableName\":\"gqqqxh\",\"mappingRuleName\":\"xrxc\",\"dataFormat\":\"TXT\",\"eventSystemProperties\":[\"av\",\"k\",\"dzf\"],\"sharedAccessPolicyName\":\"azivjlfrqttbajl\",\"databaseRouting\":\"Single\",\"retrievalStartDate\":\"2021-04-16T08:57:57Z\",\"provisioningState\":\"Succeeded\"},\"location\":\"opidkqqfkuv\",\"id\":\"cxkdmligovi\",\"name\":\"rxkpmloazuruoc\",\"type\":\"goorbteo\"}")
                .toObject(IotHubDataConnection.class);
        Assertions.assertEquals("opidkqqfkuv", model.location());
        Assertions.assertEquals("tx", model.iotHubResourceId());
        Assertions.assertEquals("gzukxitmm", model.consumerGroup());
        Assertions.assertEquals("gqqqxh", model.tableName());
        Assertions.assertEquals("xrxc", model.mappingRuleName());
        Assertions.assertEquals(IotHubDataFormat.TXT, model.dataFormat());
        Assertions.assertEquals("av", model.eventSystemProperties().get(0));
        Assertions.assertEquals("azivjlfrqttbajl", model.sharedAccessPolicyName());
        Assertions.assertEquals(DatabaseRouting.SINGLE, model.databaseRouting());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-16T08:57:57Z"), model.retrievalStartDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IotHubDataConnection model =
            new IotHubDataConnection()
                .withLocation("opidkqqfkuv")
                .withIotHubResourceId("tx")
                .withConsumerGroup("gzukxitmm")
                .withTableName("gqqqxh")
                .withMappingRuleName("xrxc")
                .withDataFormat(IotHubDataFormat.TXT)
                .withEventSystemProperties(Arrays.asList("av", "k", "dzf"))
                .withSharedAccessPolicyName("azivjlfrqttbajl")
                .withDatabaseRouting(DatabaseRouting.SINGLE)
                .withRetrievalStartDate(OffsetDateTime.parse("2021-04-16T08:57:57Z"));
        model = BinaryData.fromObject(model).toObject(IotHubDataConnection.class);
        Assertions.assertEquals("opidkqqfkuv", model.location());
        Assertions.assertEquals("tx", model.iotHubResourceId());
        Assertions.assertEquals("gzukxitmm", model.consumerGroup());
        Assertions.assertEquals("gqqqxh", model.tableName());
        Assertions.assertEquals("xrxc", model.mappingRuleName());
        Assertions.assertEquals(IotHubDataFormat.TXT, model.dataFormat());
        Assertions.assertEquals("av", model.eventSystemProperties().get(0));
        Assertions.assertEquals("azivjlfrqttbajl", model.sharedAccessPolicyName());
        Assertions.assertEquals(DatabaseRouting.SINGLE, model.databaseRouting());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-16T08:57:57Z"), model.retrievalStartDate());
    }
}
