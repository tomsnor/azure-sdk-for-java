// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** The EntityLinkingLROResult model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("EntityLinkingLROResults")
@Fluent
public final class EntityLinkingLROResult extends AnalyzeTextLROResult {
    /*
     * The results property.
     */
    @JsonProperty(value = "results", required = true)
    private EntityLinkingResult results;

    /** Creates an instance of EntityLinkingLROResult class. */
    public EntityLinkingLROResult() {}

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public EntityLinkingResult getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the EntityLinkingLROResult object itself.
     */
    public EntityLinkingLROResult setResults(EntityLinkingResult results) {
        this.results = results;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityLinkingLROResult setTaskName(String taskName) {
        super.setTaskName(taskName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityLinkingLROResult setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        super.setLastUpdateDateTime(lastUpdateDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityLinkingLROResult setStatus(State status) {
        super.setStatus(status);
        return this;
    }
}
