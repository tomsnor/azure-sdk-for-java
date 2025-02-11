// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.WorkloadProfileStatesInner;
import com.azure.resourcemanager.appcontainers.models.WorkloadProfileStatesCollection;
import com.azure.resourcemanager.appcontainers.models.WorkloadProfileStatesProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WorkloadProfileStatesCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadProfileStatesCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"minimumCount\":2043816183,\"maximumCount\":1103748423,\"currentCount\":1089629771},\"id\":\"amqu\",\"name\":\"iosrsjuivfcdis\",\"type\":\"irnxz\"},{\"properties\":{\"minimumCount\":1330444310,\"maximumCount\":1780974098,\"currentCount\":1436327406},\"id\":\"ujrtrhqvwr\",\"name\":\"vk\",\"type\":\"gnl\"},{\"properties\":{\"minimumCount\":1572707089,\"maximumCount\":118723047,\"currentCount\":1684987702},\"id\":\"qywncvjtsz\",\"name\":\"ofizehtdhgbj\",\"type\":\"vreljea\"}],\"nextLink\":\"rvzmlovuana\"}")
                .toObject(WorkloadProfileStatesCollection.class);
        Assertions.assertEquals(2043816183, model.value().get(0).properties().minimumCount());
        Assertions.assertEquals(1103748423, model.value().get(0).properties().maximumCount());
        Assertions.assertEquals(1089629771, model.value().get(0).properties().currentCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadProfileStatesCollection model =
            new WorkloadProfileStatesCollection()
                .withValue(
                    Arrays
                        .asList(
                            new WorkloadProfileStatesInner()
                                .withProperties(
                                    new WorkloadProfileStatesProperties()
                                        .withMinimumCount(2043816183)
                                        .withMaximumCount(1103748423)
                                        .withCurrentCount(1089629771)),
                            new WorkloadProfileStatesInner()
                                .withProperties(
                                    new WorkloadProfileStatesProperties()
                                        .withMinimumCount(1330444310)
                                        .withMaximumCount(1780974098)
                                        .withCurrentCount(1436327406)),
                            new WorkloadProfileStatesInner()
                                .withProperties(
                                    new WorkloadProfileStatesProperties()
                                        .withMinimumCount(1572707089)
                                        .withMaximumCount(118723047)
                                        .withCurrentCount(1684987702))));
        model = BinaryData.fromObject(model).toObject(WorkloadProfileStatesCollection.class);
        Assertions.assertEquals(2043816183, model.value().get(0).properties().minimumCount());
        Assertions.assertEquals(1103748423, model.value().get(0).properties().maximumCount());
        Assertions.assertEquals(1089629771, model.value().get(0).properties().currentCount());
    }
}
