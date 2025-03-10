// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.ZendeskLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for Zendesk. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Zendesk")
@Fluent
public final class ZendeskLinkedService extends LinkedService {
    /*
     * Zendesk linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private ZendeskLinkedServiceTypeProperties innerTypeProperties = new ZendeskLinkedServiceTypeProperties();

    /** Creates an instance of ZendeskLinkedService class. */
    public ZendeskLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Zendesk linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private ZendeskLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ZendeskLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ZendeskLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ZendeskLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ZendeskLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to use.
     *
     * @return the authenticationType value.
     */
    public ZendeskAuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication type to use.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the ZendeskLinkedService object itself.
     */
    public ZendeskLinkedService withAuthenticationType(ZendeskAuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ZendeskLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the url property: The url to connect Zendesk source. Type: string (or Expression with resultType string).
     *
     * @return the url value.
     */
    public Object url() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().url();
    }

    /**
     * Set the url property: The url to connect Zendesk source. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set.
     * @return the ZendeskLinkedService object itself.
     */
    public ZendeskLinkedService withUrl(Object url) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ZendeskLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUrl(url);
        return this;
    }

    /**
     * Get the username property: The username of the Zendesk source. Type: string (or Expression with resultType
     * string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: The username of the Zendesk source. Type: string (or Expression with resultType
     * string).
     *
     * @param username the username value to set.
     * @return the ZendeskLinkedService object itself.
     */
    public ZendeskLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ZendeskLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: The password of the Zendesk source.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: The password of the Zendesk source.
     *
     * @param password the password value to set.
     * @return the ZendeskLinkedService object itself.
     */
    public ZendeskLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ZendeskLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the apiToken property: The api token for the Zendesk source.
     *
     * @return the apiToken value.
     */
    public SecretBase apiToken() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().apiToken();
    }

    /**
     * Set the apiToken property: The api token for the Zendesk source.
     *
     * @param apiToken the apiToken value to set.
     * @return the ZendeskLinkedService object itself.
     */
    public ZendeskLinkedService withApiToken(SecretBase apiToken) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ZendeskLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withApiToken(apiToken);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the ZendeskLinkedService object itself.
     */
    public ZendeskLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ZendeskLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model ZendeskLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ZendeskLinkedService.class);
}
