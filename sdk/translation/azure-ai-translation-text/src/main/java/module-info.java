// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.ai.translation.text {
    requires transitive com.azure.core;

    exports com.azure.ai.translation.text;
    exports com.azure.ai.translation.text.models;

    opens com.azure.ai.translation.text.models to
            com.azure.core,
            com.fasterxml.jackson.databind;
}
