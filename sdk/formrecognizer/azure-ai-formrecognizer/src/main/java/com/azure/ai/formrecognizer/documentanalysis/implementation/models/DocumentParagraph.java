// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.ai.formrecognizer.documentanalysis.models.ParagraphRole;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A paragraph object consisting with contiguous lines generally with common alignment and spacing. */
@Immutable
public final class DocumentParagraph {
    /*
     * Semantic role of the paragraph.
     */
    @JsonProperty(value = "role")
    private ParagraphRole role;

    /*
     * Concatenated content of the paragraph in reading order.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /*
     * Bounding regions covering the paragraph.
     */
    @JsonProperty(value = "boundingRegions")
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the paragraph in the reading order concatenated content.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /**
     * Creates an instance of DocumentParagraph class.
     *
     * @param content the content value to set.
     * @param spans the spans value to set.
     */
    @JsonCreator
    private DocumentParagraph(
            @JsonProperty(value = "content", required = true) String content,
            @JsonProperty(value = "spans", required = true) List<DocumentSpan> spans) {
        this.content = content;
        this.spans = spans;
    }

    /**
     * Get the role property: Semantic role of the paragraph.
     *
     * @return the role value.
     */
    public ParagraphRole getRole() {
        return this.role;
    }

    /**
     * Get the content property: Concatenated content of the paragraph in reading order.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the paragraph.
     *
     * @return the boundingRegions value.
     */
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Get the spans property: Location of the paragraph in the reading order concatenated content.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }
}
