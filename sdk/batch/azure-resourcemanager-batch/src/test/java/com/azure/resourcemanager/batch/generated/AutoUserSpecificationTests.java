// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.AutoUserScope;
import com.azure.resourcemanager.batch.models.AutoUserSpecification;
import com.azure.resourcemanager.batch.models.ElevationLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AutoUserSpecificationTests {
    @Test
    public void testDeserialize() {
        AutoUserSpecification model =
            BinaryData
                .fromString("{\"scope\":\"Pool\",\"elevationLevel\":\"Admin\"}")
                .toObject(AutoUserSpecification.class);
        Assertions.assertEquals(AutoUserScope.POOL, model.scope());
        Assertions.assertEquals(ElevationLevel.ADMIN, model.elevationLevel());
    }

    @Test
    public void testSerialize() {
        AutoUserSpecification model =
            new AutoUserSpecification().withScope(AutoUserScope.POOL).withElevationLevel(ElevationLevel.ADMIN);
        model = BinaryData.fromObject(model).toObject(AutoUserSpecification.class);
        Assertions.assertEquals(AutoUserScope.POOL, model.scope());
        Assertions.assertEquals(ElevationLevel.ADMIN, model.elevationLevel());
    }
}
