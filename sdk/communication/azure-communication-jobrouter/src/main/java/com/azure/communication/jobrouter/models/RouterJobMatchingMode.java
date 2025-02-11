// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobMatchingMode model. */
@Fluent
public final class RouterJobMatchingMode {
    /*
     * The modeType property.
     */
    @JsonProperty(value = "modeType")
    private RouterJobMatchModeType modeType;

    /*
     * The queueAndMatchMode property.
     */
    @JsonProperty(value = "queueAndMatchMode")
    private QueueAndMatchMode queueAndMatchMode;

    /*
     * The scheduleAndSuspendMode property.
     */
    @JsonProperty(value = "scheduleAndSuspendMode")
    private ScheduleAndSuspendMode scheduleAndSuspendMode;

    /*
     * The suspendMode property.
     */
    @JsonProperty(value = "suspendMode")
    private SuspendMode suspendMode;

    /**
     * Get the modeType property: The modeType property.
     *
     * @return the modeType value.
     */
    public RouterJobMatchModeType getModeType() {
        return this.modeType;
    }

    /**
     * Set the modeType property: The modeType property.
     *
     * @param modeType the modeType value to set.
     * @return the JobMatchingMode object itself.
     */
    public RouterJobMatchingMode setModeType(RouterJobMatchModeType modeType) {
        this.modeType = modeType;
        return this;
    }

    /**
     * Get the queueAndMatchMode property: QueueAndMatchMode.
     *
     * @return the queueAndMatchMode value.
     */
    public QueueAndMatchMode getQueueAndMatchMode() {
        return this.queueAndMatchMode;
    }

    /**
     * Set the queueAndMatchMode property: Any object.
     *
     * @param queueAndMatchMode the queueAndMatchMode value to set.
     * @return the JobMatchingMode object itself.
     */
    public RouterJobMatchingMode setQueueAndMatchMode(QueueAndMatchMode queueAndMatchMode) {
        this.queueAndMatchMode = queueAndMatchMode;
        return this;
    }

    /**
     * Get the scheduleAndSuspendMode property: The scheduleAndSuspendMode property.
     *
     * @return the scheduleAndSuspendMode value.
     */
    public ScheduleAndSuspendMode getScheduleAndSuspendMode() {
        return this.scheduleAndSuspendMode;
    }

    /**
     * Set the scheduleAndSuspendMode property: The scheduleAndSuspendMode property.
     *
     * @param scheduleAndSuspendMode the scheduleAndSuspendMode value to set.
     * @return the JobMatchingMode object itself.
     */
    public RouterJobMatchingMode setScheduleAndSuspendMode(ScheduleAndSuspendMode scheduleAndSuspendMode) {
        this.scheduleAndSuspendMode = scheduleAndSuspendMode;
        return this;
    }

    /**
     * Get the suspendMode property: SuspendMode.
     *
     * @return the suspendMode value.
     */
    public SuspendMode getSuspendMode() {
        return this.suspendMode;
    }

    /**
     * Set the suspendMode property: SuspendMode.
     *
     * @param suspendMode the suspendMode value to set.
     * @return the JobMatchingMode object itself.
     */
    public RouterJobMatchingMode setSuspendMode(SuspendMode suspendMode) {
        this.suspendMode = suspendMode;
        return this;
    }
}
