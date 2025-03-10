// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

/** Samples for Skus List. */
public final class SkusListSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-05-02/examples/KustoSkus.json
     */
    /**
     * Sample code: KustoListRegionSkus.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoListRegionSkus(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager.skus().list("westus", com.azure.core.util.Context.NONE);
    }
}
