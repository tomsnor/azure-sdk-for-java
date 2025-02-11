// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.BareMetalMachineKeySetInner;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineKeySetPrivilegeLevel;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.KeySetUser;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BareMetalMachineKeySetInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BareMetalMachineKeySetInner model =
            BinaryData
                .fromString(
                    "{\"extendedLocation\":{\"name\":\"xlpm\",\"type\":\"erbdk\"},\"properties\":{\"azureGroupId\":\"lvidizozs\",\"detailedStatus\":\"SomeInvalid\",\"detailedStatusMessage\":\"xjmonf\",\"expiration\":\"2021-06-26T18:58:09Z\",\"jumpHostsAllowed\":[\"w\",\"cypuuwwlt\",\"uqj\"],\"lastValidation\":\"2021-11-13T15:41:05Z\",\"osGroupName\":\"nkeifz\",\"privilegeLevel\":\"Superuser\",\"provisioningState\":\"Succeeded\",\"userList\":[{\"azureUserName\":\"as\",\"description\":\"lyhb\"},{\"azureUserName\":\"cu\",\"description\":\"hxgsrboldfor\"}],\"userListStatus\":[{\"azureUserName\":\"lvizb\",\"status\":\"Invalid\",\"statusMessage\":\"vvacqpb\"},{\"azureUserName\":\"odxeszabbela\",\"status\":\"Active\",\"statusMessage\":\"aslzkwr\"},{\"azureUserName\":\"oycqucwy\",\"status\":\"Invalid\",\"statusMessage\":\"omd\"}]},\"location\":\"ywuhpsvfuur\",\"tags\":{\"xwlalniexzsrzpg\":\"we\",\"wpgdak\":\"pqtybb\"},\"id\":\"hzyvlixqnrkcx\",\"name\":\"jibnxmysu\",\"type\":\"swqrntvlwijp\"}")
                .toObject(BareMetalMachineKeySetInner.class);
        Assertions.assertEquals("ywuhpsvfuur", model.location());
        Assertions.assertEquals("we", model.tags().get("xwlalniexzsrzpg"));
        Assertions.assertEquals("xlpm", model.extendedLocation().name());
        Assertions.assertEquals("erbdk", model.extendedLocation().type());
        Assertions.assertEquals("lvidizozs", model.azureGroupId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-26T18:58:09Z"), model.expiration());
        Assertions.assertEquals("w", model.jumpHostsAllowed().get(0));
        Assertions.assertEquals("nkeifz", model.osGroupName());
        Assertions.assertEquals(BareMetalMachineKeySetPrivilegeLevel.SUPERUSER, model.privilegeLevel());
        Assertions.assertEquals("as", model.userList().get(0).azureUsername());
        Assertions.assertEquals("lyhb", model.userList().get(0).description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BareMetalMachineKeySetInner model =
            new BareMetalMachineKeySetInner()
                .withLocation("ywuhpsvfuur")
                .withTags(mapOf("xwlalniexzsrzpg", "we", "wpgdak", "pqtybb"))
                .withExtendedLocation(new ExtendedLocation().withName("xlpm").withType("erbdk"))
                .withAzureGroupId("lvidizozs")
                .withExpiration(OffsetDateTime.parse("2021-06-26T18:58:09Z"))
                .withJumpHostsAllowed(Arrays.asList("w", "cypuuwwlt", "uqj"))
                .withOsGroupName("nkeifz")
                .withPrivilegeLevel(BareMetalMachineKeySetPrivilegeLevel.SUPERUSER)
                .withUserList(
                    Arrays
                        .asList(
                            new KeySetUser().withAzureUsername("as").withDescription("lyhb"),
                            new KeySetUser().withAzureUsername("cu").withDescription("hxgsrboldfor")));
        model = BinaryData.fromObject(model).toObject(BareMetalMachineKeySetInner.class);
        Assertions.assertEquals("ywuhpsvfuur", model.location());
        Assertions.assertEquals("we", model.tags().get("xwlalniexzsrzpg"));
        Assertions.assertEquals("xlpm", model.extendedLocation().name());
        Assertions.assertEquals("erbdk", model.extendedLocation().type());
        Assertions.assertEquals("lvidizozs", model.azureGroupId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-26T18:58:09Z"), model.expiration());
        Assertions.assertEquals("w", model.jumpHostsAllowed().get(0));
        Assertions.assertEquals("nkeifz", model.osGroupName());
        Assertions.assertEquals(BareMetalMachineKeySetPrivilegeLevel.SUPERUSER, model.privilegeLevel());
        Assertions.assertEquals("as", model.userList().get(0).azureUsername());
        Assertions.assertEquals("lyhb", model.userList().get(0).description());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
