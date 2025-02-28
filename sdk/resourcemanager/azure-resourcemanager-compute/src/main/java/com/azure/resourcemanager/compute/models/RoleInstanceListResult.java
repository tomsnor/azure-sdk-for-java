// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.RoleInstanceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list operation result. */
@Fluent
public final class RoleInstanceListResult {
    /*
     * The list of resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<RoleInstanceInner> value;

    /*
     * The URI to fetch the next page of resources. Use this to get the next page of resources. Do this till nextLink
     * is null to fetch all the resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of RoleInstanceListResult class. */
    public RoleInstanceListResult() {
    }

    /**
     * Get the value property: The list of resources.
     *
     * @return the value value.
     */
    public List<RoleInstanceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of resources.
     *
     * @param value the value value to set.
     * @return the RoleInstanceListResult object itself.
     */
    public RoleInstanceListResult withValue(List<RoleInstanceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of resources. Use this to get the next page of
     * resources. Do this till nextLink is null to fetch all the resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of resources. Use this to get the next page of
     * resources. Do this till nextLink is null to fetch all the resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the RoleInstanceListResult object itself.
     */
    public RoleInstanceListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model RoleInstanceListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoleInstanceListResult.class);
}
