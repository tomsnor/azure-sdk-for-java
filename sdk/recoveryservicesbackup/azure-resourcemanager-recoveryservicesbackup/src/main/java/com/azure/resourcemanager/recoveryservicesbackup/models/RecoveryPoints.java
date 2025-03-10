// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of RecoveryPoints. */
public interface RecoveryPoints {
    /**
     * Lists the backup copies for the backed up item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item whose backup copies are to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RecoveryPoint resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RecoveryPointResource> list(
        String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName);

    /**
     * Lists the backup copies for the backed up item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up item.
     * @param containerName Container name associated with the backed up item.
     * @param protectedItemName Backed up item whose backup copies are to be fetched.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RecoveryPoint resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RecoveryPointResource> list(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String filter,
        Context context);

    /**
     * Provides the information of the backed up data identified using RecoveryPointID. This is an asynchronous
     * operation. To know the status of the operation, call the GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with backed up item.
     * @param containerName Container name associated with backed up item.
     * @param protectedItemName Backed up item name whose backup data needs to be fetched.
     * @param recoveryPointId RecoveryPointID represents the backed up data to be fetched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup copies along with {@link Response}.
     */
    Response<RecoveryPointResource> getWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        Context context);

    /**
     * Provides the information of the backed up data identified using RecoveryPointID. This is an asynchronous
     * operation. To know the status of the operation, call the GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with backed up item.
     * @param containerName Container name associated with backed up item.
     * @param protectedItemName Backed up item name whose backup data needs to be fetched.
     * @param recoveryPointId RecoveryPointID represents the backed up data to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup copies.
     */
    RecoveryPointResource get(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId);
}
