// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Storage to Network Proximity
 *
 * <p>Provides storage to network proximity information for the volume.
 */
public final class VolumeStorageToNetworkProximity extends ExpandableStringEnum<VolumeStorageToNetworkProximity> {
    /** Static value Default for VolumeStorageToNetworkProximity. */
    public static final VolumeStorageToNetworkProximity DEFAULT = fromString("Default");

    /** Static value T1 for VolumeStorageToNetworkProximity. */
    public static final VolumeStorageToNetworkProximity T1 = fromString("T1");

    /** Static value T2 for VolumeStorageToNetworkProximity. */
    public static final VolumeStorageToNetworkProximity T2 = fromString("T2");

    /**
     * Creates a new instance of VolumeStorageToNetworkProximity value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VolumeStorageToNetworkProximity() {
    }

    /**
     * Creates or finds a VolumeStorageToNetworkProximity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VolumeStorageToNetworkProximity.
     */
    @JsonCreator
    public static VolumeStorageToNetworkProximity fromString(String name) {
        return fromString(name, VolumeStorageToNetworkProximity.class);
    }

    /**
     * Gets known VolumeStorageToNetworkProximity values.
     *
     * @return known VolumeStorageToNetworkProximity values.
     */
    public static Collection<VolumeStorageToNetworkProximity> values() {
        return values(VolumeStorageToNetworkProximity.class);
    }
}
