// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

/** Describes a set of worker selectors that will be attached if the given condition resolves to true. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("conditional")
@Fluent
public final class ConditionalWorkerSelectorAttachment extends WorkerSelectorAttachment {
    /*
     * A rule of one of the following types:
     *
     * StaticRule:  A rule providing static rules that always return the same
     * result, regardless of input.
     * DirectMapRule:  A rule that return the same labels as the input labels.
     * ExpressionRule: A rule providing inline expression rules.
     * AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure
     * Function.
     * WebhookRule: A rule providing a binding to a webserver following
     * OAuth2.0 authentication protocol.
     */
    @JsonProperty(value = "condition", required = true)
    private RouterRule condition;

    /*
     * The worker selectors to attach
     */
    @JsonProperty(value = "workerSelectors", required = true)
    private List<RouterWorkerSelector> workerSelectors;

    /**
     * Get the condition property: A rule of one of the following types:
     *
     * <p>StaticRule: A rule providing static rules that always return the same result, regardless of input.
     * DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule providing inline
     * expression rules. AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure Function. WebhookRule:
     * A rule providing a binding to a webserver following OAuth2.0 authentication protocol.
     *
     * @return the condition value.
     */
    public RouterRule getCondition() {
        return this.condition;
    }

    /**
     * Set the condition property: A rule of one of the following types:
     *
     * <p>StaticRule: A rule providing static rules that always return the same result, regardless of input.
     * DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule providing inline
     * expression rules. AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure Function. WebhookRule:
     * A rule providing a binding to a webserver following OAuth2.0 authentication protocol.
     *
     * @param condition the condition value to set.
     * @return the ConditionalWorkerSelectorAttachment object itself.
     */
    public ConditionalWorkerSelectorAttachment setCondition(RouterRule condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the workerSelectors property: The worker selectors to attach.
     *
     * @return the workerSelectors value.
     */
    public List<RouterWorkerSelector> getWorkerSelectors() {
        return this.workerSelectors;
    }

    /**
     * Set the workerSelectors property: The worker selectors to attach.
     *
     * @param workerSelectors the workerSelectors value to set.
     * @return the ConditionalWorkerSelectorAttachment object itself.
     */
    public ConditionalWorkerSelectorAttachment setWorkerSelectors(List<RouterWorkerSelector> workerSelectors) {
        this.workerSelectors = workerSelectors;
        return this;
    }
}
