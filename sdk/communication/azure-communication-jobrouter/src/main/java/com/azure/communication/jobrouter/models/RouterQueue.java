// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.accesshelpers.LabelValueConstructorProxy;
import com.azure.communication.jobrouter.implementation.accesshelpers.RouterQueueConstructorProxy;
import com.azure.communication.jobrouter.implementation.models.RouterQueueInternal;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.stream.Collectors;

/** A queue that can contain jobs to be routed. */
@Fluent
public final class RouterQueue {
    /**
     * Public constructor.
     *
     * @param id The id
     */
    public RouterQueue(String id) {
        this.id = id;
    }

    /**
     * Package-private constructor of the class, used internally.
     *
     * @param internal The internal RouterQueue
     */
    RouterQueue(RouterQueueInternal internal) {
        id = internal.getId();

        setName(internal.getName());
        setDistributionPolicyId(internal.getDistributionPolicyId());
        setExceptionPolicyId(internal.getExceptionPolicyId());
        setLabels(internal.getLabels().entrySet().stream()
            .collect(Collectors.toMap(Map.Entry::getKey, entry -> LabelValueConstructorProxy.create(entry.getValue()))));
    }

    static {
        RouterQueueConstructorProxy.setAccessor(internal -> new RouterQueue(internal));
    }

    /*
     * The Id of this queue
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of this queue.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The ID of the distribution policy that will determine how a job is
     * distributed to workers.
     */
    @JsonProperty(value = "distributionPolicyId")
    private String distributionPolicyId;

    /*
     * A set of key/value pairs that are identifying attributes used by the
     * rules engines to make decisions.
     */
    @JsonProperty(value = "labels")
    private Map<String, LabelValue> labels;

    /*
     * (Optional) The ID of the exception policy that determines various job
     * escalation rules.
     */
    @JsonProperty(value = "exceptionPolicyId")
    private String exceptionPolicyId;

    /**
     * Get the id property: The Id of this queue.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The name of this queue.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of this queue.
     *
     * @param name the name value to set.
     * @return the RouterQueue object itself.
     */
    public RouterQueue setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the distributionPolicyId property: The ID of the distribution policy that will determine how a job is
     * distributed to workers.
     *
     * @return the distributionPolicyId value.
     */
    public String getDistributionPolicyId() {
        return this.distributionPolicyId;
    }

    /**
     * Set the distributionPolicyId property: The ID of the distribution policy that will determine how a job is
     * distributed to workers.
     *
     * @param distributionPolicyId the distributionPolicyId value to set.
     * @return the RouterQueue object itself.
     */
    public RouterQueue setDistributionPolicyId(String distributionPolicyId) {
        this.distributionPolicyId = distributionPolicyId;
        return this;
    }

    /**
     * Get the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions.
     *
     * @return the labels value.
     */
    public Map<String, LabelValue> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions.
     *
     * @param labels the labels value to set.
     * @return the RouterQueue object itself.
     */
    public RouterQueue setLabels(Map<String, LabelValue> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the exceptionPolicyId property: (Optional) The ID of the exception policy that determines various job
     * escalation rules.
     *
     * @return the exceptionPolicyId value.
     */
    public String getExceptionPolicyId() {
        return this.exceptionPolicyId;
    }

    /**
     * Set the exceptionPolicyId property: (Optional) The ID of the exception policy that determines various job
     * escalation rules.
     *
     * @param exceptionPolicyId the exceptionPolicyId value to set.
     * @return the RouterQueue object itself.
     */
    public RouterQueue setExceptionPolicyId(String exceptionPolicyId) {
        this.exceptionPolicyId = exceptionPolicyId;
        return this;
    }
}
