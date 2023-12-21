/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configurations to use RDS to store knowledge base data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/RdsConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsConfiguration implements Serializable, Cloneable, StructuredPojo {

    private String resourceArn;

    private String credentialsSecretArn;

    private String databaseName;

    private String tableName;

    private RdsFieldMapping fieldMapping;

    /**
     * @param resourceArn
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * @return
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * @param resourceArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * @param credentialsSecretArn
     */

    public void setCredentialsSecretArn(String credentialsSecretArn) {
        this.credentialsSecretArn = credentialsSecretArn;
    }

    /**
     * @return
     */

    public String getCredentialsSecretArn() {
        return this.credentialsSecretArn;
    }

    /**
     * @param credentialsSecretArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withCredentialsSecretArn(String credentialsSecretArn) {
        setCredentialsSecretArn(credentialsSecretArn);
        return this;
    }

    /**
     * @param databaseName
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * @return
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @param databaseName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * @param tableName
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * @param tableName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * @param fieldMapping
     */

    public void setFieldMapping(RdsFieldMapping fieldMapping) {
        this.fieldMapping = fieldMapping;
    }

    /**
     * @return
     */

    public RdsFieldMapping getFieldMapping() {
        return this.fieldMapping;
    }

    /**
     * @param fieldMapping
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withFieldMapping(RdsFieldMapping fieldMapping) {
        setFieldMapping(fieldMapping);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getCredentialsSecretArn() != null)
            sb.append("CredentialsSecretArn: ").append(getCredentialsSecretArn()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getFieldMapping() != null)
            sb.append("FieldMapping: ").append(getFieldMapping());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsConfiguration == false)
            return false;
        RdsConfiguration other = (RdsConfiguration) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getCredentialsSecretArn() == null ^ this.getCredentialsSecretArn() == null)
            return false;
        if (other.getCredentialsSecretArn() != null && other.getCredentialsSecretArn().equals(this.getCredentialsSecretArn()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getFieldMapping() == null ^ this.getFieldMapping() == null)
            return false;
        if (other.getFieldMapping() != null && other.getFieldMapping().equals(this.getFieldMapping()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getCredentialsSecretArn() == null) ? 0 : getCredentialsSecretArn().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getFieldMapping() == null) ? 0 : getFieldMapping().hashCode());
        return hashCode;
    }

    @Override
    public RdsConfiguration clone() {
        try {
            return (RdsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.RdsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
