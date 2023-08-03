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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that defines a data provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DataProviderSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataProviderSettings implements Serializable, Cloneable, StructuredPojo {

    private PostgreSqlDataProviderSettings postgreSqlSettings;

    private MySqlDataProviderSettings mySqlSettings;

    private OracleDataProviderSettings oracleSettings;

    private MicrosoftSqlServerDataProviderSettings microsoftSqlServerSettings;

    /**
     * @param postgreSqlSettings
     */

    public void setPostgreSqlSettings(PostgreSqlDataProviderSettings postgreSqlSettings) {
        this.postgreSqlSettings = postgreSqlSettings;
    }

    /**
     * @return
     */

    public PostgreSqlDataProviderSettings getPostgreSqlSettings() {
        return this.postgreSqlSettings;
    }

    /**
     * @param postgreSqlSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProviderSettings withPostgreSqlSettings(PostgreSqlDataProviderSettings postgreSqlSettings) {
        setPostgreSqlSettings(postgreSqlSettings);
        return this;
    }

    /**
     * @param mySqlSettings
     */

    public void setMySqlSettings(MySqlDataProviderSettings mySqlSettings) {
        this.mySqlSettings = mySqlSettings;
    }

    /**
     * @return
     */

    public MySqlDataProviderSettings getMySqlSettings() {
        return this.mySqlSettings;
    }

    /**
     * @param mySqlSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProviderSettings withMySqlSettings(MySqlDataProviderSettings mySqlSettings) {
        setMySqlSettings(mySqlSettings);
        return this;
    }

    /**
     * @param oracleSettings
     */

    public void setOracleSettings(OracleDataProviderSettings oracleSettings) {
        this.oracleSettings = oracleSettings;
    }

    /**
     * @return
     */

    public OracleDataProviderSettings getOracleSettings() {
        return this.oracleSettings;
    }

    /**
     * @param oracleSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProviderSettings withOracleSettings(OracleDataProviderSettings oracleSettings) {
        setOracleSettings(oracleSettings);
        return this;
    }

    /**
     * @param microsoftSqlServerSettings
     */

    public void setMicrosoftSqlServerSettings(MicrosoftSqlServerDataProviderSettings microsoftSqlServerSettings) {
        this.microsoftSqlServerSettings = microsoftSqlServerSettings;
    }

    /**
     * @return
     */

    public MicrosoftSqlServerDataProviderSettings getMicrosoftSqlServerSettings() {
        return this.microsoftSqlServerSettings;
    }

    /**
     * @param microsoftSqlServerSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProviderSettings withMicrosoftSqlServerSettings(MicrosoftSqlServerDataProviderSettings microsoftSqlServerSettings) {
        setMicrosoftSqlServerSettings(microsoftSqlServerSettings);
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
        if (getPostgreSqlSettings() != null)
            sb.append("PostgreSqlSettings: ").append(getPostgreSqlSettings()).append(",");
        if (getMySqlSettings() != null)
            sb.append("MySqlSettings: ").append(getMySqlSettings()).append(",");
        if (getOracleSettings() != null)
            sb.append("OracleSettings: ").append(getOracleSettings()).append(",");
        if (getMicrosoftSqlServerSettings() != null)
            sb.append("MicrosoftSqlServerSettings: ").append(getMicrosoftSqlServerSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataProviderSettings == false)
            return false;
        DataProviderSettings other = (DataProviderSettings) obj;
        if (other.getPostgreSqlSettings() == null ^ this.getPostgreSqlSettings() == null)
            return false;
        if (other.getPostgreSqlSettings() != null && other.getPostgreSqlSettings().equals(this.getPostgreSqlSettings()) == false)
            return false;
        if (other.getMySqlSettings() == null ^ this.getMySqlSettings() == null)
            return false;
        if (other.getMySqlSettings() != null && other.getMySqlSettings().equals(this.getMySqlSettings()) == false)
            return false;
        if (other.getOracleSettings() == null ^ this.getOracleSettings() == null)
            return false;
        if (other.getOracleSettings() != null && other.getOracleSettings().equals(this.getOracleSettings()) == false)
            return false;
        if (other.getMicrosoftSqlServerSettings() == null ^ this.getMicrosoftSqlServerSettings() == null)
            return false;
        if (other.getMicrosoftSqlServerSettings() != null && other.getMicrosoftSqlServerSettings().equals(this.getMicrosoftSqlServerSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPostgreSqlSettings() == null) ? 0 : getPostgreSqlSettings().hashCode());
        hashCode = prime * hashCode + ((getMySqlSettings() == null) ? 0 : getMySqlSettings().hashCode());
        hashCode = prime * hashCode + ((getOracleSettings() == null) ? 0 : getOracleSettings().hashCode());
        hashCode = prime * hashCode + ((getMicrosoftSqlServerSettings() == null) ? 0 : getMicrosoftSqlServerSettings().hashCode());
        return hashCode;
    }

    @Override
    public DataProviderSettings clone() {
        try {
            return (DataProviderSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.DataProviderSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
