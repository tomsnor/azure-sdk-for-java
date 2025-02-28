// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes scaling information of a sku. */
@Immutable
public final class VirtualMachineScaleSetSkuCapacity {
    /*
     * The minimum capacity.
     */
    @JsonProperty(value = "minimum", access = JsonProperty.Access.WRITE_ONLY)
    private Long minimum;

    /*
     * The maximum capacity that can be set.
     */
    @JsonProperty(value = "maximum", access = JsonProperty.Access.WRITE_ONLY)
    private Long maximum;

    /*
     * The default capacity.
     */
    @JsonProperty(value = "defaultCapacity", access = JsonProperty.Access.WRITE_ONLY)
    private Long defaultCapacity;

    /*
     * The scale type applicable to the sku.
     */
    @JsonProperty(value = "scaleType", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineScaleSetSkuScaleType scaleType;

    /** Creates an instance of VirtualMachineScaleSetSkuCapacity class. */
    public VirtualMachineScaleSetSkuCapacity() {
    }

    /**
     * Get the minimum property: The minimum capacity.
     *
     * @return the minimum value.
     */
    public Long minimum() {
        return this.minimum;
    }

    /**
     * Get the maximum property: The maximum capacity that can be set.
     *
     * @return the maximum value.
     */
    public Long maximum() {
        return this.maximum;
    }

    /**
     * Get the defaultCapacity property: The default capacity.
     *
     * @return the defaultCapacity value.
     */
    public Long defaultCapacity() {
        return this.defaultCapacity;
    }

    /**
     * Get the scaleType property: The scale type applicable to the sku.
     *
     * @return the scaleType value.
     */
    public VirtualMachineScaleSetSkuScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
