// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MarketplaceDetails of PAN Firewall resource. */
@Fluent
public final class MarketplaceDetails {
    /*
     * Marketplace Subscription Id
     */
    @JsonProperty(value = "marketplaceSubscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String marketplaceSubscriptionId;

    /*
     * Offer Id
     */
    @JsonProperty(value = "offerId", required = true)
    private String offerId;

    /*
     * Publisher Id
     */
    @JsonProperty(value = "publisherId", required = true)
    private String publisherId;

    /*
     * Marketplace Subscription Status
     */
    @JsonProperty(value = "marketplaceSubscriptionStatus")
    private MarketplaceSubscriptionStatus marketplaceSubscriptionStatus;

    /** Creates an instance of MarketplaceDetails class. */
    public MarketplaceDetails() {
    }

    /**
     * Get the marketplaceSubscriptionId property: Marketplace Subscription Id.
     *
     * @return the marketplaceSubscriptionId value.
     */
    public String marketplaceSubscriptionId() {
        return this.marketplaceSubscriptionId;
    }

    /**
     * Get the offerId property: Offer Id.
     *
     * @return the offerId value.
     */
    public String offerId() {
        return this.offerId;
    }

    /**
     * Set the offerId property: Offer Id.
     *
     * @param offerId the offerId value to set.
     * @return the MarketplaceDetails object itself.
     */
    public MarketplaceDetails withOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    /**
     * Get the publisherId property: Publisher Id.
     *
     * @return the publisherId value.
     */
    public String publisherId() {
        return this.publisherId;
    }

    /**
     * Set the publisherId property: Publisher Id.
     *
     * @param publisherId the publisherId value to set.
     * @return the MarketplaceDetails object itself.
     */
    public MarketplaceDetails withPublisherId(String publisherId) {
        this.publisherId = publisherId;
        return this;
    }

    /**
     * Get the marketplaceSubscriptionStatus property: Marketplace Subscription Status.
     *
     * @return the marketplaceSubscriptionStatus value.
     */
    public MarketplaceSubscriptionStatus marketplaceSubscriptionStatus() {
        return this.marketplaceSubscriptionStatus;
    }

    /**
     * Set the marketplaceSubscriptionStatus property: Marketplace Subscription Status.
     *
     * @param marketplaceSubscriptionStatus the marketplaceSubscriptionStatus value to set.
     * @return the MarketplaceDetails object itself.
     */
    public MarketplaceDetails withMarketplaceSubscriptionStatus(
        MarketplaceSubscriptionStatus marketplaceSubscriptionStatus) {
        this.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (offerId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property offerId in model MarketplaceDetails"));
        }
        if (publisherId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property publisherId in model MarketplaceDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MarketplaceDetails.class);
}
