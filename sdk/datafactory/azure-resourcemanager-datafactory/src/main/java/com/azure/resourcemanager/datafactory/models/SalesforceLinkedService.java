// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SalesforceLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for Salesforce. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Salesforce")
@Fluent
public final class SalesforceLinkedService extends LinkedService {
    /*
     * Salesforce linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SalesforceLinkedServiceTypeProperties innerTypeProperties = new SalesforceLinkedServiceTypeProperties();

    /** Creates an instance of SalesforceLinkedService class. */
    public SalesforceLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Salesforce linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private SalesforceLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the environmentUrl property: The URL of Salesforce instance. Default is 'https://login.salesforce.com'. To
     * copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for
     * example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     *
     * @return the environmentUrl value.
     */
    public Object environmentUrl() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().environmentUrl();
    }

    /**
     * Set the environmentUrl property: The URL of Salesforce instance. Default is 'https://login.salesforce.com'. To
     * copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for
     * example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     *
     * @param environmentUrl the environmentUrl value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withEnvironmentUrl(Object environmentUrl) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEnvironmentUrl(environmentUrl);
        return this;
    }

    /**
     * Get the username property: The username for Basic authentication of the Salesforce instance. Type: string (or
     * Expression with resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: The username for Basic authentication of the Salesforce instance. Type: string (or
     * Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: The password for Basic authentication of the Salesforce instance.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: The password for Basic authentication of the Salesforce instance.
     *
     * @param password the password value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the securityToken property: The security token is optional to remotely access Salesforce instance.
     *
     * @return the securityToken value.
     */
    public SecretBase securityToken() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().securityToken();
    }

    /**
     * Set the securityToken property: The security token is optional to remotely access Salesforce instance.
     *
     * @param securityToken the securityToken value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withSecurityToken(SecretBase securityToken) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSecurityToken(securityToken);
        return this;
    }

    /**
     * Get the apiVersion property: The Salesforce API version used in ADF. Type: string (or Expression with resultType
     * string).
     *
     * @return the apiVersion value.
     */
    public Object apiVersion() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().apiVersion();
    }

    /**
     * Set the apiVersion property: The Salesforce API version used in ADF. Type: string (or Expression with resultType
     * string).
     *
     * @param apiVersion the apiVersion value to set.
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withApiVersion(Object apiVersion) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withApiVersion(apiVersion);
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
     * @return the SalesforceLinkedService object itself.
     */
    public SalesforceLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceLinkedServiceTypeProperties();
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
                        "Missing required property innerTypeProperties in model SalesforceLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SalesforceLinkedService.class);
}
