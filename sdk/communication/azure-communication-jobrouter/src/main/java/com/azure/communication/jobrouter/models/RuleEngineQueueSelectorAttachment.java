// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Attaches queue selectors to a job when the RouterRule is resolved. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("rule-engine")
@Fluent
public final class RuleEngineQueueSelectorAttachment extends QueueSelectorAttachment {
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
    @JsonProperty(value = "rule", required = true)
    private RouterRule rule;

    /**
     * Get the rule property: A rule of one of the following types:
     *
     * <p>StaticRule: A rule providing static rules that always return the same result, regardless of input.
     * DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule providing inline
     * expression rules. AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure Function. WebhookRule:
     * A rule providing a binding to a webserver following OAuth2.0 authentication protocol.
     *
     * @return the rule value.
     */
    public RouterRule getRule() {
        return this.rule;
    }

    /**
     * Set the rule property: A rule of one of the following types:
     *
     * <p>StaticRule: A rule providing static rules that always return the same result, regardless of input.
     * DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule providing inline
     * expression rules. AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure Function. WebhookRule:
     * A rule providing a binding to a webserver following OAuth2.0 authentication protocol.
     *
     * @param rule the rule value to set.
     * @return the RuleEngineQueueSelectorAttachment object itself.
     */
    public RuleEngineQueueSelectorAttachment setRule(RouterRule rule) {
        this.rule = rule;
        return this;
    }
}
