// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains bandwidths offered in ExpressRouteServiceProvider resources. */
@Fluent
public final class ExpressRouteServiceProviderBandwidthsOffered {
    /*
     * The OfferName.
     */
    @JsonProperty(value = "offerName")
    private String offerName;

    /*
     * The ValueInMbps.
     */
    @JsonProperty(value = "valueInMbps")
    private Integer valueInMbps;

    /** Creates an instance of ExpressRouteServiceProviderBandwidthsOffered class. */
    public ExpressRouteServiceProviderBandwidthsOffered() {
    }

    /**
     * Get the offerName property: The OfferName.
     *
     * @return the offerName value.
     */
    public String offerName() {
        return this.offerName;
    }

    /**
     * Set the offerName property: The OfferName.
     *
     * @param offerName the offerName value to set.
     * @return the ExpressRouteServiceProviderBandwidthsOffered object itself.
     */
    public ExpressRouteServiceProviderBandwidthsOffered withOfferName(String offerName) {
        this.offerName = offerName;
        return this;
    }

    /**
     * Get the valueInMbps property: The ValueInMbps.
     *
     * @return the valueInMbps value.
     */
    public Integer valueInMbps() {
        return this.valueInMbps;
    }

    /**
     * Set the valueInMbps property: The ValueInMbps.
     *
     * @param valueInMbps the valueInMbps value to set.
     * @return the ExpressRouteServiceProviderBandwidthsOffered object itself.
     */
    public ExpressRouteServiceProviderBandwidthsOffered withValueInMbps(Integer valueInMbps) {
        this.valueInMbps = valueInMbps;
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
