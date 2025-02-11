// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.BatchManager;
import com.azure.resourcemanager.batch.models.ComputeNodeFillType;
import com.azure.resourcemanager.batch.models.DynamicVNetAssignmentScope;
import com.azure.resourcemanager.batch.models.InterNodeCommunicationState;
import com.azure.resourcemanager.batch.models.NodeCommunicationMode;
import com.azure.resourcemanager.batch.models.Pool;
import com.azure.resourcemanager.batch.models.PoolIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PoolsStopResizeWithResponseMockTests {
    @Test
    public void testStopResizeWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"displayName\":\"gyavu\",\"lastModified\":\"2021-11-26T06:56:03Z\",\"creationTime\":\"2021-08-30T13:25:29Z\",\"provisioningState\":\"Succeeded\",\"provisioningStateTransitionTime\":\"2021-06-19T05:16:04Z\",\"allocationState\":\"Resizing\",\"allocationStateTransitionTime\":\"2021-09-20T02:33:28Z\",\"vmSize\":\"bpimlqoljxkcgxxl\",\"deploymentConfiguration\":{},\"currentDedicatedNodes\":749906444,\"currentLowPriorityNodes\":1112510482,\"scaleSettings\":{},\"autoScaleRun\":{\"evaluationTime\":\"2021-03-28T18:15:03Z\",\"results\":\"vwlyoup\"},\"interNodeCommunication\":\"Disabled\",\"networkConfiguration\":{\"subnetId\":\"ubdyhgk\",\"dynamicVnetAssignmentScope\":\"none\"},\"taskSlotsPerNode\":610597873,\"taskSchedulingPolicy\":{\"nodeFillType\":\"Pack\"},\"userAccounts\":[],\"metadata\":[],\"startTask\":{\"commandLine\":\"ktlahbqa\",\"resourceFiles\":[],\"environmentSettings\":[],\"maxTaskRetryCount\":1226803488,\"waitForSuccess\":true},\"certificates\":[],\"applicationPackages\":[],\"applicationLicenses\":[\"gqqqxh\"],\"resizeOperationStatus\":{\"targetDedicatedNodes\":734515726,\"targetLowPriorityNodes\":1873190222,\"resizeTimeout\":\"PT22H19M27S\",\"nodeDeallocationOption\":\"Terminate\",\"startTime\":\"2021-04-05T16:50:28Z\",\"errors\":[]},\"mountConfiguration\":[],\"targetNodeCommunicationMode\":\"Simplified\",\"currentNodeCommunicationMode\":\"Simplified\"},\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{}},\"etag\":\"jlfrq\",\"id\":\"tbajlkatn\",\"name\":\"xyiopidkqqfku\",\"type\":\"s\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        BatchManager manager =
            BatchManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Pool response =
            manager.pools().stopResizeWithResponse("wrwfscjfnyns", "qujizdvo", "ytibyow", Context.NONE).getValue();

        Assertions.assertEquals(PoolIdentityType.NONE, response.identity().type());
        Assertions.assertEquals("gyavu", response.displayName());
        Assertions.assertEquals("bpimlqoljxkcgxxl", response.vmSize());
        Assertions.assertEquals(InterNodeCommunicationState.DISABLED, response.interNodeCommunication());
        Assertions.assertEquals("ubdyhgk", response.networkConfiguration().subnetId());
        Assertions
            .assertEquals(
                DynamicVNetAssignmentScope.NONE, response.networkConfiguration().dynamicVnetAssignmentScope());
        Assertions.assertEquals(610597873, response.taskSlotsPerNode());
        Assertions.assertEquals(ComputeNodeFillType.PACK, response.taskSchedulingPolicy().nodeFillType());
        Assertions.assertEquals("ktlahbqa", response.startTask().commandLine());
        Assertions.assertEquals(1226803488, response.startTask().maxTaskRetryCount());
        Assertions.assertEquals(true, response.startTask().waitForSuccess());
        Assertions.assertEquals("gqqqxh", response.applicationLicenses().get(0));
        Assertions.assertEquals(NodeCommunicationMode.SIMPLIFIED, response.targetNodeCommunicationMode());
    }
}
