// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.ApplicableScheduleInner;
import com.azure.resourcemanager.devtestlabs.fluent.models.ScheduleInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ApplicableScheduleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicableScheduleInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"labVmsShutdown\":{\"location\":\"mqspkcdqzhlctdd\",\"tags\":{\"pchrqbn\":\"ndy\"},\"id\":\"jrcg\",\"name\":\"gydcw\",\"type\":\"oxjumvqqo\"},\"labVmsStartup\":{\"location\":\"hrraiouaubrj\",\"tags\":{\"rzpasccbiuimzdly\":\"qxfuojrngif\"},\"id\":\"dfqwmkyoq\",\"name\":\"fdvruz\",\"type\":\"lzo\"}},\"location\":\"hpc\",\"tags\":{\"eyzihgrky\":\"mdxotngfdgu\",\"absnmfpp\":\"i\",\"yhsgz\":\"ojeevy\"},\"id\":\"czbgomfgbeg\",\"name\":\"qgleohibetnluank\",\"type\":\"rfxeeebtij\"}")
                .toObject(ApplicableScheduleInner.class);
        Assertions.assertEquals("hpc", model.location());
        Assertions.assertEquals("mdxotngfdgu", model.tags().get("eyzihgrky"));
        Assertions.assertEquals("mqspkcdqzhlctdd", model.labVmsShutdown().location());
        Assertions.assertEquals("ndy", model.labVmsShutdown().tags().get("pchrqbn"));
        Assertions.assertEquals("hrraiouaubrj", model.labVmsStartup().location());
        Assertions.assertEquals("qxfuojrngif", model.labVmsStartup().tags().get("rzpasccbiuimzdly"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicableScheduleInner model =
            new ApplicableScheduleInner()
                .withLocation("hpc")
                .withTags(mapOf("eyzihgrky", "mdxotngfdgu", "absnmfpp", "i", "yhsgz", "ojeevy"))
                .withLabVmsShutdown(
                    new ScheduleInner().withLocation("mqspkcdqzhlctdd").withTags(mapOf("pchrqbn", "ndy")))
                .withLabVmsStartup(
                    new ScheduleInner()
                        .withLocation("hrraiouaubrj")
                        .withTags(mapOf("rzpasccbiuimzdly", "qxfuojrngif")));
        model = BinaryData.fromObject(model).toObject(ApplicableScheduleInner.class);
        Assertions.assertEquals("hpc", model.location());
        Assertions.assertEquals("mdxotngfdgu", model.tags().get("eyzihgrky"));
        Assertions.assertEquals("mqspkcdqzhlctdd", model.labVmsShutdown().location());
        Assertions.assertEquals("ndy", model.labVmsShutdown().tags().get("pchrqbn"));
        Assertions.assertEquals("hrraiouaubrj", model.labVmsStartup().location());
        Assertions.assertEquals("qxfuojrngif", model.labVmsStartup().tags().get("rzpasccbiuimzdly"));
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
