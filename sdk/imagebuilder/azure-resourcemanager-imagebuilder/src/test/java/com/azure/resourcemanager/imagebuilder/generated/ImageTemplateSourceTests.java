// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateSource;

public final class ImageTemplateSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageTemplateSource model =
            BinaryData.fromString("{\"type\":\"ImageTemplateSource\"}").toObject(ImageTemplateSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageTemplateSource model = new ImageTemplateSource();
        model = BinaryData.fromObject(model).toObject(ImageTemplateSource.class);
    }
}
