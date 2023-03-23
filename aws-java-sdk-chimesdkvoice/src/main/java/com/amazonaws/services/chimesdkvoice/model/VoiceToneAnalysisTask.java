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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/VoiceToneAnalysisTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceToneAnalysisTask implements Serializable, Cloneable, StructuredPojo {

    private String voiceToneAnalysisTaskId;

    private String voiceToneAnalysisTaskStatus;

    private CallDetails callDetails;

    private java.util.Date createdTimestamp;

    private java.util.Date updatedTimestamp;

    private java.util.Date startedTimestamp;

    private String statusMessage;

    /**
     * @param voiceToneAnalysisTaskId
     */

    public void setVoiceToneAnalysisTaskId(String voiceToneAnalysisTaskId) {
        this.voiceToneAnalysisTaskId = voiceToneAnalysisTaskId;
    }

    /**
     * @return
     */

    public String getVoiceToneAnalysisTaskId() {
        return this.voiceToneAnalysisTaskId;
    }

    /**
     * @param voiceToneAnalysisTaskId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceToneAnalysisTask withVoiceToneAnalysisTaskId(String voiceToneAnalysisTaskId) {
        setVoiceToneAnalysisTaskId(voiceToneAnalysisTaskId);
        return this;
    }

    /**
     * @param voiceToneAnalysisTaskStatus
     */

    public void setVoiceToneAnalysisTaskStatus(String voiceToneAnalysisTaskStatus) {
        this.voiceToneAnalysisTaskStatus = voiceToneAnalysisTaskStatus;
    }

    /**
     * @return
     */

    public String getVoiceToneAnalysisTaskStatus() {
        return this.voiceToneAnalysisTaskStatus;
    }

    /**
     * @param voiceToneAnalysisTaskStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceToneAnalysisTask withVoiceToneAnalysisTaskStatus(String voiceToneAnalysisTaskStatus) {
        setVoiceToneAnalysisTaskStatus(voiceToneAnalysisTaskStatus);
        return this;
    }

    /**
     * @param callDetails
     */

    public void setCallDetails(CallDetails callDetails) {
        this.callDetails = callDetails;
    }

    /**
     * @return
     */

    public CallDetails getCallDetails() {
        return this.callDetails;
    }

    /**
     * @param callDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceToneAnalysisTask withCallDetails(CallDetails callDetails) {
        setCallDetails(callDetails);
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

    public VoiceToneAnalysisTask withCreatedTimestamp(java.util.Date createdTimestamp) {
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

    public VoiceToneAnalysisTask withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
        return this;
    }

    /**
     * @param startedTimestamp
     */

    public void setStartedTimestamp(java.util.Date startedTimestamp) {
        this.startedTimestamp = startedTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getStartedTimestamp() {
        return this.startedTimestamp;
    }

    /**
     * @param startedTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceToneAnalysisTask withStartedTimestamp(java.util.Date startedTimestamp) {
        setStartedTimestamp(startedTimestamp);
        return this;
    }

    /**
     * @param statusMessage
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * @return
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * @param statusMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceToneAnalysisTask withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getVoiceToneAnalysisTaskId() != null)
            sb.append("VoiceToneAnalysisTaskId: ").append(getVoiceToneAnalysisTaskId()).append(",");
        if (getVoiceToneAnalysisTaskStatus() != null)
            sb.append("VoiceToneAnalysisTaskStatus: ").append(getVoiceToneAnalysisTaskStatus()).append(",");
        if (getCallDetails() != null)
            sb.append("CallDetails: ").append(getCallDetails()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp()).append(",");
        if (getStartedTimestamp() != null)
            sb.append("StartedTimestamp: ").append(getStartedTimestamp()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceToneAnalysisTask == false)
            return false;
        VoiceToneAnalysisTask other = (VoiceToneAnalysisTask) obj;
        if (other.getVoiceToneAnalysisTaskId() == null ^ this.getVoiceToneAnalysisTaskId() == null)
            return false;
        if (other.getVoiceToneAnalysisTaskId() != null && other.getVoiceToneAnalysisTaskId().equals(this.getVoiceToneAnalysisTaskId()) == false)
            return false;
        if (other.getVoiceToneAnalysisTaskStatus() == null ^ this.getVoiceToneAnalysisTaskStatus() == null)
            return false;
        if (other.getVoiceToneAnalysisTaskStatus() != null && other.getVoiceToneAnalysisTaskStatus().equals(this.getVoiceToneAnalysisTaskStatus()) == false)
            return false;
        if (other.getCallDetails() == null ^ this.getCallDetails() == null)
            return false;
        if (other.getCallDetails() != null && other.getCallDetails().equals(this.getCallDetails()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        if (other.getStartedTimestamp() == null ^ this.getStartedTimestamp() == null)
            return false;
        if (other.getStartedTimestamp() != null && other.getStartedTimestamp().equals(this.getStartedTimestamp()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceToneAnalysisTaskId() == null) ? 0 : getVoiceToneAnalysisTaskId().hashCode());
        hashCode = prime * hashCode + ((getVoiceToneAnalysisTaskStatus() == null) ? 0 : getVoiceToneAnalysisTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getCallDetails() == null) ? 0 : getCallDetails().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStartedTimestamp() == null) ? 0 : getStartedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public VoiceToneAnalysisTask clone() {
        try {
            return (VoiceToneAnalysisTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.VoiceToneAnalysisTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
