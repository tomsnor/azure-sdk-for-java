// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

/** Samples for Vendors CreateOrUpdate. */
public final class VendorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2021-05-01/examples/VendorCreate.json
     */
    /**
     * Sample code: Create or update Vendor resource.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void createOrUpdateVendorResource(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.vendors().define("TestVendor").create();
    }
}
