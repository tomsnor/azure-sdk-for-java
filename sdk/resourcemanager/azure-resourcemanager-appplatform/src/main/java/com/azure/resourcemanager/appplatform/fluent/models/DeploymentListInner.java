// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of deployments resource ids. */
@Fluent
public final class DeploymentListInner {
    /*
     * A list of deployment resource ids.
     */
    @JsonProperty(value = "deployments")
    private List<String> deployments;

    /**
     * Get the deployments property: A list of deployment resource ids.
     *
     * @return the deployments value.
     */
    public List<String> deployments() {
        return this.deployments;
    }

    /**
     * Set the deployments property: A list of deployment resource ids.
     *
     * @param deployments the deployments value to set.
     * @return the DeploymentListInner object itself.
     */
    public DeploymentListInner withDeployments(List<String> deployments) {
        this.deployments = deployments;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
