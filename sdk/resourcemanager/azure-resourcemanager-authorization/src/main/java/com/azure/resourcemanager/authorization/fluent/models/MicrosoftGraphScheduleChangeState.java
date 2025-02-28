// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** scheduleChangeState. */
public final class MicrosoftGraphScheduleChangeState extends ExpandableStringEnum<MicrosoftGraphScheduleChangeState> {
    /** Static value pending for MicrosoftGraphScheduleChangeState. */
    public static final MicrosoftGraphScheduleChangeState PENDING = fromString("pending");

    /** Static value approved for MicrosoftGraphScheduleChangeState. */
    public static final MicrosoftGraphScheduleChangeState APPROVED = fromString("approved");

    /** Static value declined for MicrosoftGraphScheduleChangeState. */
    public static final MicrosoftGraphScheduleChangeState DECLINED = fromString("declined");

    /** Static value unknownFutureValue for MicrosoftGraphScheduleChangeState. */
    public static final MicrosoftGraphScheduleChangeState UNKNOWN_FUTURE_VALUE = fromString("unknownFutureValue");

    /**
     * Creates or finds a MicrosoftGraphScheduleChangeState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphScheduleChangeState.
     */
    @JsonCreator
    public static MicrosoftGraphScheduleChangeState fromString(String name) {
        return fromString(name, MicrosoftGraphScheduleChangeState.class);
    }

    /**
     * Gets known MicrosoftGraphScheduleChangeState values.
     *
     * @return known MicrosoftGraphScheduleChangeState values.
     */
    public static Collection<MicrosoftGraphScheduleChangeState> values() {
        return values(MicrosoftGraphScheduleChangeState.class);
    }
}
