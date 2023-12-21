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
 * Configures the physical storage of ingested data in a knowledge base.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/StorageConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageConfiguration implements Serializable, Cloneable, StructuredPojo {

    private String type;

    private OpenSearchServerlessConfiguration opensearchServerlessConfiguration;

    private PineconeConfiguration pineconeConfiguration;

    private RedisEnterpriseCloudConfiguration redisEnterpriseCloudConfiguration;

    private RdsConfiguration rdsConfiguration;

    /**
     * @param type
     * @see KnowledgeBaseStorageType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     * @see KnowledgeBaseStorageType
     */

    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseStorageType
     */

    public StorageConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseStorageType
     */

    public StorageConfiguration withType(KnowledgeBaseStorageType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * @param opensearchServerlessConfiguration
     */

    public void setOpensearchServerlessConfiguration(OpenSearchServerlessConfiguration opensearchServerlessConfiguration) {
        this.opensearchServerlessConfiguration = opensearchServerlessConfiguration;
    }

    /**
     * @return
     */

    public OpenSearchServerlessConfiguration getOpensearchServerlessConfiguration() {
        return this.opensearchServerlessConfiguration;
    }

    /**
     * @param opensearchServerlessConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withOpensearchServerlessConfiguration(OpenSearchServerlessConfiguration opensearchServerlessConfiguration) {
        setOpensearchServerlessConfiguration(opensearchServerlessConfiguration);
        return this;
    }

    /**
     * @param pineconeConfiguration
     */

    public void setPineconeConfiguration(PineconeConfiguration pineconeConfiguration) {
        this.pineconeConfiguration = pineconeConfiguration;
    }

    /**
     * @return
     */

    public PineconeConfiguration getPineconeConfiguration() {
        return this.pineconeConfiguration;
    }

    /**
     * @param pineconeConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withPineconeConfiguration(PineconeConfiguration pineconeConfiguration) {
        setPineconeConfiguration(pineconeConfiguration);
        return this;
    }

    /**
     * @param redisEnterpriseCloudConfiguration
     */

    public void setRedisEnterpriseCloudConfiguration(RedisEnterpriseCloudConfiguration redisEnterpriseCloudConfiguration) {
        this.redisEnterpriseCloudConfiguration = redisEnterpriseCloudConfiguration;
    }

    /**
     * @return
     */

    public RedisEnterpriseCloudConfiguration getRedisEnterpriseCloudConfiguration() {
        return this.redisEnterpriseCloudConfiguration;
    }

    /**
     * @param redisEnterpriseCloudConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withRedisEnterpriseCloudConfiguration(RedisEnterpriseCloudConfiguration redisEnterpriseCloudConfiguration) {
        setRedisEnterpriseCloudConfiguration(redisEnterpriseCloudConfiguration);
        return this;
    }

    /**
     * @param rdsConfiguration
     */

    public void setRdsConfiguration(RdsConfiguration rdsConfiguration) {
        this.rdsConfiguration = rdsConfiguration;
    }

    /**
     * @return
     */

    public RdsConfiguration getRdsConfiguration() {
        return this.rdsConfiguration;
    }

    /**
     * @param rdsConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withRdsConfiguration(RdsConfiguration rdsConfiguration) {
        setRdsConfiguration(rdsConfiguration);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getOpensearchServerlessConfiguration() != null)
            sb.append("OpensearchServerlessConfiguration: ").append(getOpensearchServerlessConfiguration()).append(",");
        if (getPineconeConfiguration() != null)
            sb.append("PineconeConfiguration: ").append(getPineconeConfiguration()).append(",");
        if (getRedisEnterpriseCloudConfiguration() != null)
            sb.append("RedisEnterpriseCloudConfiguration: ").append(getRedisEnterpriseCloudConfiguration()).append(",");
        if (getRdsConfiguration() != null)
            sb.append("RdsConfiguration: ").append(getRdsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageConfiguration == false)
            return false;
        StorageConfiguration other = (StorageConfiguration) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOpensearchServerlessConfiguration() == null ^ this.getOpensearchServerlessConfiguration() == null)
            return false;
        if (other.getOpensearchServerlessConfiguration() != null
                && other.getOpensearchServerlessConfiguration().equals(this.getOpensearchServerlessConfiguration()) == false)
            return false;
        if (other.getPineconeConfiguration() == null ^ this.getPineconeConfiguration() == null)
            return false;
        if (other.getPineconeConfiguration() != null && other.getPineconeConfiguration().equals(this.getPineconeConfiguration()) == false)
            return false;
        if (other.getRedisEnterpriseCloudConfiguration() == null ^ this.getRedisEnterpriseCloudConfiguration() == null)
            return false;
        if (other.getRedisEnterpriseCloudConfiguration() != null
                && other.getRedisEnterpriseCloudConfiguration().equals(this.getRedisEnterpriseCloudConfiguration()) == false)
            return false;
        if (other.getRdsConfiguration() == null ^ this.getRdsConfiguration() == null)
            return false;
        if (other.getRdsConfiguration() != null && other.getRdsConfiguration().equals(this.getRdsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOpensearchServerlessConfiguration() == null) ? 0 : getOpensearchServerlessConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPineconeConfiguration() == null) ? 0 : getPineconeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRedisEnterpriseCloudConfiguration() == null) ? 0 : getRedisEnterpriseCloudConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRdsConfiguration() == null) ? 0 : getRdsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public StorageConfiguration clone() {
        try {
            return (StorageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.StorageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
