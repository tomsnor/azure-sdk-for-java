// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redisenterprise.fluent.SkusClient;
import com.azure.resourcemanager.redisenterprise.fluent.models.RegionSkuDetailInner;
import com.azure.resourcemanager.redisenterprise.models.RegionSkuDetail;
import com.azure.resourcemanager.redisenterprise.models.Skus;

public final class SkusImpl implements Skus {
    private static final ClientLogger LOGGER = new ClientLogger(SkusImpl.class);

    private final SkusClient innerClient;

    private final com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager serviceManager;

    public SkusImpl(
        SkusClient innerClient, com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RegionSkuDetail> list(String location) {
        PagedIterable<RegionSkuDetailInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new RegionSkuDetailImpl(inner1, this.manager()));
    }

    public PagedIterable<RegionSkuDetail> list(String location, Context context) {
        PagedIterable<RegionSkuDetailInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new RegionSkuDetailImpl(inner1, this.manager()));
    }

    private SkusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager() {
        return this.serviceManager;
    }
}
