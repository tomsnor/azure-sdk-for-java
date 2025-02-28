// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for HybridContainerService class. */
public interface HybridContainerService {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ProvisionedClustersOperationsClient object to access its operations.
     *
     * @return the ProvisionedClustersOperationsClient object.
     */
    ProvisionedClustersOperationsClient getProvisionedClustersOperations();

    /**
     * Gets the HybridIdentityMetadatasClient object to access its operations.
     *
     * @return the HybridIdentityMetadatasClient object.
     */
    HybridIdentityMetadatasClient getHybridIdentityMetadatas();

    /**
     * Gets the AgentPoolsClient object to access its operations.
     *
     * @return the AgentPoolsClient object.
     */
    AgentPoolsClient getAgentPools();

    /**
     * Gets the HybridContainerServicesClient object to access its operations.
     *
     * @return the HybridContainerServicesClient object.
     */
    HybridContainerServicesClient getHybridContainerServices();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the StorageSpacesOperationsClient object to access its operations.
     *
     * @return the StorageSpacesOperationsClient object.
     */
    StorageSpacesOperationsClient getStorageSpacesOperations();

    /**
     * Gets the VirtualNetworksOperationsClient object to access its operations.
     *
     * @return the VirtualNetworksOperationsClient object.
     */
    VirtualNetworksOperationsClient getVirtualNetworksOperations();
}
