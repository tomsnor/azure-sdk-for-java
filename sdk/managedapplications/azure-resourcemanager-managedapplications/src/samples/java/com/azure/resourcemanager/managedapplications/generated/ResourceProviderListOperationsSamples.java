// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

/** Samples for ResourceProvider ListOperations. */
public final class ResourceProviderListOperationsSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Solutions/stable/2018-06-01/examples/listSolutionsOperations.json
     */
    /**
     * Sample code: List Solutions operations.
     *
     * @param manager Entry point to ApplicationManager.
     */
    public static void listSolutionsOperations(
        com.azure.resourcemanager.managedapplications.ApplicationManager manager) {
        manager.resourceProviders().listOperations(com.azure.core.util.Context.NONE);
    }
}
