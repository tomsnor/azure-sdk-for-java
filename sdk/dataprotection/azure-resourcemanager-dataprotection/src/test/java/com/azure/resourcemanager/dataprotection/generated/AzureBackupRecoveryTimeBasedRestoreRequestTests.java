// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRecoveryTimeBasedRestoreRequest;
import com.azure.resourcemanager.dataprotection.models.IdentityDetails;
import com.azure.resourcemanager.dataprotection.models.RecoveryOption;
import com.azure.resourcemanager.dataprotection.models.RestoreTargetInfoBase;
import com.azure.resourcemanager.dataprotection.models.SourceDataStoreType;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupRecoveryTimeBasedRestoreRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupRecoveryTimeBasedRestoreRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureBackupRecoveryTimeBasedRestoreRequest\",\"recoveryPointTime\":\"ronasxift\",\"restoreTargetInfo\":{\"objectType\":\"RestoreTargetInfoBase\",\"recoveryOption\":\"FailIfExists\",\"restoreLocation\":\"yzhftwesgogczh\"},\"sourceDataStoreType\":\"ArchiveStore\",\"sourceResourceId\":\"xkr\",\"identityDetails\":{\"useSystemAssignedIdentity\":true,\"userAssignedIdentityArmUrl\":\"mossxkkgthrrghxj\"}}")
                .toObject(AzureBackupRecoveryTimeBasedRestoreRequest.class);
        Assertions.assertEquals(RecoveryOption.FAIL_IF_EXISTS, model.restoreTargetInfo().recoveryOption());
        Assertions.assertEquals("yzhftwesgogczh", model.restoreTargetInfo().restoreLocation());
        Assertions.assertEquals(SourceDataStoreType.ARCHIVE_STORE, model.sourceDataStoreType());
        Assertions.assertEquals("xkr", model.sourceResourceId());
        Assertions.assertEquals(true, model.identityDetails().useSystemAssignedIdentity());
        Assertions.assertEquals("mossxkkgthrrghxj", model.identityDetails().userAssignedIdentityArmUrl());
        Assertions.assertEquals("ronasxift", model.recoveryPointTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupRecoveryTimeBasedRestoreRequest model =
            new AzureBackupRecoveryTimeBasedRestoreRequest()
                .withRestoreTargetInfo(
                    new RestoreTargetInfoBase()
                        .withRecoveryOption(RecoveryOption.FAIL_IF_EXISTS)
                        .withRestoreLocation("yzhftwesgogczh"))
                .withSourceDataStoreType(SourceDataStoreType.ARCHIVE_STORE)
                .withSourceResourceId("xkr")
                .withIdentityDetails(
                    new IdentityDetails()
                        .withUseSystemAssignedIdentity(true)
                        .withUserAssignedIdentityArmUrl("mossxkkgthrrghxj"))
                .withRecoveryPointTime("ronasxift");
        model = BinaryData.fromObject(model).toObject(AzureBackupRecoveryTimeBasedRestoreRequest.class);
        Assertions.assertEquals(RecoveryOption.FAIL_IF_EXISTS, model.restoreTargetInfo().recoveryOption());
        Assertions.assertEquals("yzhftwesgogczh", model.restoreTargetInfo().restoreLocation());
        Assertions.assertEquals(SourceDataStoreType.ARCHIVE_STORE, model.sourceDataStoreType());
        Assertions.assertEquals("xkr", model.sourceResourceId());
        Assertions.assertEquals(true, model.identityDetails().useSystemAssignedIdentity());
        Assertions.assertEquals("mossxkkgthrrghxj", model.identityDetails().userAssignedIdentityArmUrl());
        Assertions.assertEquals("ronasxift", model.recoveryPointTime());
    }
}
