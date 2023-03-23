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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/VoiceProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceProfile implements Serializable, Cloneable, StructuredPojo {

    private String voiceProfileId;

    private String voiceProfileArn;

    private String voiceProfileDomainId;

    private java.util.Date createdTimestamp;

    private java.util.Date updatedTimestamp;

    private java.util.Date expirationTimestamp;

    /**
     * @param voiceProfileId
     */

    public void setVoiceProfileId(String voiceProfileId) {
        this.voiceProfileId = voiceProfileId;
    }

    /**
     * @return
     */

    public String getVoiceProfileId() {
        return this.voiceProfileId;
    }

    /**
     * @param voiceProfileId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfile withVoiceProfileId(String voiceProfileId) {
        setVoiceProfileId(voiceProfileId);
        return this;
    }

    /**
     * @param voiceProfileArn
     */

    public void setVoiceProfileArn(String voiceProfileArn) {
        this.voiceProfileArn = voiceProfileArn;
    }

    /**
     * @return
     */

    public String getVoiceProfileArn() {
        return this.voiceProfileArn;
    }

    /**
     * @param voiceProfileArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfile withVoiceProfileArn(String voiceProfileArn) {
        setVoiceProfileArn(voiceProfileArn);
        return this;
    }

    /**
     * @param voiceProfileDomainId
     */

    public void setVoiceProfileDomainId(String voiceProfileDomainId) {
        this.voiceProfileDomainId = voiceProfileDomainId;
    }

    /**
     * @return
     */

    public String getVoiceProfileDomainId() {
        return this.voiceProfileDomainId;
    }

    /**
     * @param voiceProfileDomainId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfile withVoiceProfileDomainId(String voiceProfileDomainId) {
        setVoiceProfileDomainId(voiceProfileDomainId);
        return this;
    }

    /**
     * @param createdTimestamp
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * @param createdTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfile withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * @param updatedTimestamp
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * @param updatedTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfile withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
        return this;
    }

    /**
     * @param expirationTimestamp
     */

    public void setExpirationTimestamp(java.util.Date expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    /**
     * @param expirationTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfile withExpirationTimestamp(java.util.Date expirationTimestamp) {
        setExpirationTimestamp(expirationTimestamp);
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
        if (getVoiceProfileId() != null)
            sb.append("VoiceProfileId: ").append(getVoiceProfileId()).append(",");
        if (getVoiceProfileArn() != null)
            sb.append("VoiceProfileArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getVoiceProfileDomainId() != null)
            sb.append("VoiceProfileDomainId: ").append(getVoiceProfileDomainId()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp()).append(",");
        if (getExpirationTimestamp() != null)
            sb.append("ExpirationTimestamp: ").append(getExpirationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceProfile == false)
            return false;
        VoiceProfile other = (VoiceProfile) obj;
        if (other.getVoiceProfileId() == null ^ this.getVoiceProfileId() == null)
            return false;
        if (other.getVoiceProfileId() != null && other.getVoiceProfileId().equals(this.getVoiceProfileId()) == false)
            return false;
        if (other.getVoiceProfileArn() == null ^ this.getVoiceProfileArn() == null)
            return false;
        if (other.getVoiceProfileArn() != null && other.getVoiceProfileArn().equals(this.getVoiceProfileArn()) == false)
            return false;
        if (other.getVoiceProfileDomainId() == null ^ this.getVoiceProfileDomainId() == null)
            return false;
        if (other.getVoiceProfileDomainId() != null && other.getVoiceProfileDomainId().equals(this.getVoiceProfileDomainId()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        if (other.getExpirationTimestamp() == null ^ this.getExpirationTimestamp() == null)
            return false;
        if (other.getExpirationTimestamp() != null && other.getExpirationTimestamp().equals(this.getExpirationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceProfileId() == null) ? 0 : getVoiceProfileId().hashCode());
        hashCode = prime * hashCode + ((getVoiceProfileArn() == null) ? 0 : getVoiceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getVoiceProfileDomainId() == null) ? 0 : getVoiceProfileDomainId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getExpirationTimestamp() == null) ? 0 : getExpirationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public VoiceProfile clone() {
        try {
            return (VoiceProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.VoiceProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
