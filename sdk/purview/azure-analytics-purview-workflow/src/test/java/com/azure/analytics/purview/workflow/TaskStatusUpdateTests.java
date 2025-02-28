// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class TaskStatusUpdateTests extends PurviewWorkflowClientTestBase {
    @Disabled
    @Test
    public void testTaskStatusUpdateTests() {
        BinaryData taskUpdateCommand = BinaryData.fromString("{\"comment\":\"Thanks!\",\"newStatus\":\"NotStarted\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                purviewWorkflowClient.updateTaskStatusWithResponse(
                        "a8f67c0b-36a6-48b0-9cbb-8fc4a02281d8", taskUpdateCommand, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
    }
}
