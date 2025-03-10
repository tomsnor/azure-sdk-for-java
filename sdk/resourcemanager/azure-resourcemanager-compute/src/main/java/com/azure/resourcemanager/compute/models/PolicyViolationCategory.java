// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Describes the nature of the policy violation. */
public final class PolicyViolationCategory extends ExpandableStringEnum<PolicyViolationCategory> {
    /** Static value Other for PolicyViolationCategory. */
    public static final PolicyViolationCategory OTHER = fromString("Other");

    /** Static value ImageFlaggedUnsafe for PolicyViolationCategory. */
    public static final PolicyViolationCategory IMAGE_FLAGGED_UNSAFE = fromString("ImageFlaggedUnsafe");

    /** Static value CopyrightValidation for PolicyViolationCategory. */
    public static final PolicyViolationCategory COPYRIGHT_VALIDATION = fromString("CopyrightValidation");

    /** Static value IpTheft for PolicyViolationCategory. */
    public static final PolicyViolationCategory IP_THEFT = fromString("IpTheft");

    /**
     * Creates a new instance of PolicyViolationCategory value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PolicyViolationCategory() {
    }

    /**
     * Creates or finds a PolicyViolationCategory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PolicyViolationCategory.
     */
    @JsonCreator
    public static PolicyViolationCategory fromString(String name) {
        return fromString(name, PolicyViolationCategory.class);
    }

    /**
     * Gets known PolicyViolationCategory values.
     *
     * @return known PolicyViolationCategory values.
     */
    public static Collection<PolicyViolationCategory> values() {
        return values(PolicyViolationCategory.class);
    }
}
