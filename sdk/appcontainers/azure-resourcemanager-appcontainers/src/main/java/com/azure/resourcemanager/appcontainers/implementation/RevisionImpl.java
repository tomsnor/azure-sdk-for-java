// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appcontainers.fluent.models.RevisionInner;
import com.azure.resourcemanager.appcontainers.models.Revision;
import com.azure.resourcemanager.appcontainers.models.RevisionHealthState;
import com.azure.resourcemanager.appcontainers.models.RevisionProvisioningState;
import com.azure.resourcemanager.appcontainers.models.Template;
import java.time.OffsetDateTime;

public final class RevisionImpl implements Revision {
    private RevisionInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    RevisionImpl(
        RevisionInner innerObject, com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public OffsetDateTime createdTime() {
        return this.innerModel().createdTime();
    }

    public OffsetDateTime lastActiveTime() {
        return this.innerModel().lastActiveTime();
    }

    public String fqdn() {
        return this.innerModel().fqdn();
    }

    public Template template() {
        return this.innerModel().template();
    }

    public Boolean active() {
        return this.innerModel().active();
    }

    public Integer replicas() {
        return this.innerModel().replicas();
    }

    public Integer trafficWeight() {
        return this.innerModel().trafficWeight();
    }

    public String provisioningError() {
        return this.innerModel().provisioningError();
    }

    public RevisionHealthState healthState() {
        return this.innerModel().healthState();
    }

    public RevisionProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public RevisionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }
}
