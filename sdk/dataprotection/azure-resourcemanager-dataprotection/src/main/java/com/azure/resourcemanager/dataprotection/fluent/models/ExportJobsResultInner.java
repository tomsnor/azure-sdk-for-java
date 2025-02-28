// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExportJobsResult
 *
 * <p>The result for export jobs containing blob details.
 */
@Immutable
public final class ExportJobsResultInner {
    /*
     * URL of the blob into which the serialized string of list of jobs is exported.
     */
    @JsonProperty(value = "blobUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String blobUrl;

    /*
     * SAS key to access the blob.
     */
    @JsonProperty(value = "blobSasKey", access = JsonProperty.Access.WRITE_ONLY)
    private String blobSasKey;

    /*
     * URL of the blob into which the ExcelFile is uploaded.
     */
    @JsonProperty(value = "excelFileBlobUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String excelFileBlobUrl;

    /*
     * SAS key to access the ExcelFile blob.
     */
    @JsonProperty(value = "excelFileBlobSasKey", access = JsonProperty.Access.WRITE_ONLY)
    private String excelFileBlobSasKey;

    /** Creates an instance of ExportJobsResultInner class. */
    public ExportJobsResultInner() {
    }

    /**
     * Get the blobUrl property: URL of the blob into which the serialized string of list of jobs is exported.
     *
     * @return the blobUrl value.
     */
    public String blobUrl() {
        return this.blobUrl;
    }

    /**
     * Get the blobSasKey property: SAS key to access the blob.
     *
     * @return the blobSasKey value.
     */
    public String blobSasKey() {
        return this.blobSasKey;
    }

    /**
     * Get the excelFileBlobUrl property: URL of the blob into which the ExcelFile is uploaded.
     *
     * @return the excelFileBlobUrl value.
     */
    public String excelFileBlobUrl() {
        return this.excelFileBlobUrl;
    }

    /**
     * Get the excelFileBlobSasKey property: SAS key to access the ExcelFile blob.
     *
     * @return the excelFileBlobSasKey value.
     */
    public String excelFileBlobSasKey() {
        return this.excelFileBlobSasKey;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
