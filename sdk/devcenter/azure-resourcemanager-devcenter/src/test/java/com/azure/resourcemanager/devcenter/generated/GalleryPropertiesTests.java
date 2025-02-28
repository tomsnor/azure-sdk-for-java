// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.GalleryProperties;
import org.junit.jupiter.api.Assertions;

public final class GalleryPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GalleryProperties model =
            BinaryData
                .fromString("{\"provisioningState\":\"TransientFailure\",\"galleryResourceId\":\"aajrm\"}")
                .toObject(GalleryProperties.class);
        Assertions.assertEquals("aajrm", model.galleryResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GalleryProperties model = new GalleryProperties().withGalleryResourceId("aajrm");
        model = BinaryData.fromObject(model).toObject(GalleryProperties.class);
        Assertions.assertEquals("aajrm", model.galleryResourceId());
    }
}
