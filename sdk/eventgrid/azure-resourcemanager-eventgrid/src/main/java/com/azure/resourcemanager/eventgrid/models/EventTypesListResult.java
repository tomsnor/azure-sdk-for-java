// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.EventTypeInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the List Event Types operation. */
@Fluent
public final class EventTypesListResult {
    /*
     * A collection of event types
     */
    @JsonProperty(value = "value")
    private List<EventTypeInner> value;

    /** Creates an instance of EventTypesListResult class. */
    public EventTypesListResult() {
    }

    /**
     * Get the value property: A collection of event types.
     *
     * @return the value value.
     */
    public List<EventTypeInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of event types.
     *
     * @param value the value value to set.
     * @return the EventTypesListResult object itself.
     */
    public EventTypesListResult withValue(List<EventTypeInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
