// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** A copy activity Amazon RDS for SQL Server source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonRdsForSqlServerSource")
@Fluent
public final class AmazonRdsForSqlServerSource extends TabularSource {
    /*
     * SQL reader query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sqlReaderQuery")
    private Object sqlReaderQuery;

    /*
     * Name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sqlReaderStoredProcedureName")
    private Object sqlReaderStoredProcedureName;

    /*
     * Value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     */
    @JsonProperty(value = "storedProcedureParameters")
    private Map<String, StoredProcedureParameter> storedProcedureParameters;

    /*
     * Specifies the transaction locking behavior for the SQL source. Allowed values:
     * ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "isolationLevel")
    private Object isolationLevel;

    /*
     * Which additional types to produce.
     */
    @JsonProperty(value = "produceAdditionalTypes")
    private Object produceAdditionalTypes;

    /*
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: "None",
     * "PhysicalPartitionsOfTable", "DynamicRange".
     */
    @JsonProperty(value = "partitionOption")
    private Object partitionOption;

    /*
     * The settings that will be leveraged for Sql source partitioning.
     */
    @JsonProperty(value = "partitionSettings")
    private SqlPartitionSettings partitionSettings;

    /** Creates an instance of AmazonRdsForSqlServerSource class. */
    public AmazonRdsForSqlServerSource() {}

    /**
     * Get the sqlReaderQuery property: SQL reader query. Type: string (or Expression with resultType string).
     *
     * @return the sqlReaderQuery value.
     */
    public Object getSqlReaderQuery() {
        return this.sqlReaderQuery;
    }

    /**
     * Set the sqlReaderQuery property: SQL reader query. Type: string (or Expression with resultType string).
     *
     * @param sqlReaderQuery the sqlReaderQuery value to set.
     * @return the AmazonRdsForSqlServerSource object itself.
     */
    public AmazonRdsForSqlServerSource setSqlReaderQuery(Object sqlReaderQuery) {
        this.sqlReaderQuery = sqlReaderQuery;
        return this;
    }

    /**
     * Get the sqlReaderStoredProcedureName property: Name of the stored procedure for a SQL Database source. This
     * cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     *
     * @return the sqlReaderStoredProcedureName value.
     */
    public Object getSqlReaderStoredProcedureName() {
        return this.sqlReaderStoredProcedureName;
    }

    /**
     * Set the sqlReaderStoredProcedureName property: Name of the stored procedure for a SQL Database source. This
     * cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     *
     * @param sqlReaderStoredProcedureName the sqlReaderStoredProcedureName value to set.
     * @return the AmazonRdsForSqlServerSource object itself.
     */
    public AmazonRdsForSqlServerSource setSqlReaderStoredProcedureName(Object sqlReaderStoredProcedureName) {
        this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
        return this;
    }

    /**
     * Get the storedProcedureParameters property: Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     *
     * @return the storedProcedureParameters value.
     */
    public Map<String, StoredProcedureParameter> getStoredProcedureParameters() {
        return this.storedProcedureParameters;
    }

    /**
     * Set the storedProcedureParameters property: Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     *
     * @param storedProcedureParameters the storedProcedureParameters value to set.
     * @return the AmazonRdsForSqlServerSource object itself.
     */
    public AmazonRdsForSqlServerSource setStoredProcedureParameters(
            Map<String, StoredProcedureParameter> storedProcedureParameters) {
        this.storedProcedureParameters = storedProcedureParameters;
        return this;
    }

    /**
     * Get the isolationLevel property: Specifies the transaction locking behavior for the SQL source. Allowed values:
     * ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type:
     * string (or Expression with resultType string).
     *
     * @return the isolationLevel value.
     */
    public Object getIsolationLevel() {
        return this.isolationLevel;
    }

    /**
     * Set the isolationLevel property: Specifies the transaction locking behavior for the SQL source. Allowed values:
     * ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type:
     * string (or Expression with resultType string).
     *
     * @param isolationLevel the isolationLevel value to set.
     * @return the AmazonRdsForSqlServerSource object itself.
     */
    public AmazonRdsForSqlServerSource setIsolationLevel(Object isolationLevel) {
        this.isolationLevel = isolationLevel;
        return this;
    }

    /**
     * Get the produceAdditionalTypes property: Which additional types to produce.
     *
     * @return the produceAdditionalTypes value.
     */
    public Object getProduceAdditionalTypes() {
        return this.produceAdditionalTypes;
    }

    /**
     * Set the produceAdditionalTypes property: Which additional types to produce.
     *
     * @param produceAdditionalTypes the produceAdditionalTypes value to set.
     * @return the AmazonRdsForSqlServerSource object itself.
     */
    public AmazonRdsForSqlServerSource setProduceAdditionalTypes(Object produceAdditionalTypes) {
        this.produceAdditionalTypes = produceAdditionalTypes;
        return this;
    }

    /**
     * Get the partitionOption property: The partition mechanism that will be used for Sql read in parallel. Possible
     * values include: "None", "PhysicalPartitionsOfTable", "DynamicRange".
     *
     * @return the partitionOption value.
     */
    public Object getPartitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partitionOption property: The partition mechanism that will be used for Sql read in parallel. Possible
     * values include: "None", "PhysicalPartitionsOfTable", "DynamicRange".
     *
     * @param partitionOption the partitionOption value to set.
     * @return the AmazonRdsForSqlServerSource object itself.
     */
    public AmazonRdsForSqlServerSource setPartitionOption(Object partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the partitionSettings property: The settings that will be leveraged for Sql source partitioning.
     *
     * @return the partitionSettings value.
     */
    public SqlPartitionSettings getPartitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the partitionSettings property: The settings that will be leveraged for Sql source partitioning.
     *
     * @param partitionSettings the partitionSettings value to set.
     * @return the AmazonRdsForSqlServerSource object itself.
     */
    public AmazonRdsForSqlServerSource setPartitionSettings(SqlPartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRdsForSqlServerSource setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRdsForSqlServerSource setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRdsForSqlServerSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRdsForSqlServerSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRdsForSqlServerSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
