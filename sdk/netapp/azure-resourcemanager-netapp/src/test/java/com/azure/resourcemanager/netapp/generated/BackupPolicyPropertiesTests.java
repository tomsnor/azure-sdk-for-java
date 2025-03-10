// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupPolicyProperties;
import org.junit.jupiter.api.Assertions;

public final class BackupPolicyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPolicyProperties model =
            BinaryData
                .fromString(
                    "{\"backupPolicyId\":\"axoruzfgsquy\",\"provisioningState\":\"rxxle\",\"dailyBackupsToKeep\":971666711,\"weeklyBackupsToKeep\":1899778245,\"monthlyBackupsToKeep\":1921470091,\"volumesAssigned\":726747953,\"enabled\":true,\"volumeBackups\":[{\"volumeName\":\"xuqlcvydypat\",\"backupsCount\":350928008,\"policyEnabled\":false},{\"volumeName\":\"kniod\",\"backupsCount\":887664704,\"policyEnabled\":false},{\"volumeName\":\"nuj\",\"backupsCount\":1652844269,\"policyEnabled\":true}]}")
                .toObject(BackupPolicyProperties.class);
        Assertions.assertEquals(971666711, model.dailyBackupsToKeep());
        Assertions.assertEquals(1899778245, model.weeklyBackupsToKeep());
        Assertions.assertEquals(1921470091, model.monthlyBackupsToKeep());
        Assertions.assertEquals(true, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPolicyProperties model =
            new BackupPolicyProperties()
                .withDailyBackupsToKeep(971666711)
                .withWeeklyBackupsToKeep(1899778245)
                .withMonthlyBackupsToKeep(1921470091)
                .withEnabled(true);
        model = BinaryData.fromObject(model).toObject(BackupPolicyProperties.class);
        Assertions.assertEquals(971666711, model.dailyBackupsToKeep());
        Assertions.assertEquals(1899778245, model.weeklyBackupsToKeep());
        Assertions.assertEquals(1921470091, model.monthlyBackupsToKeep());
        Assertions.assertEquals(true, model.enabled());
    }
}
