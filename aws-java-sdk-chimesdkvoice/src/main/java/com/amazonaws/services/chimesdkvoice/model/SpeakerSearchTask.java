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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/SpeakerSearchTask" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpeakerSearchTask implements Serializable, Cloneable, StructuredPojo {

    private String speakerSearchTaskId;

    private String speakerSearchTaskStatus;

    private CallDetails callDetails;

    private SpeakerSearchDetails speakerSearchDetails;

    private java.util.Date createdTimestamp;

    private java.util.Date updatedTimestamp;

    private java.util.Date startedTimestamp;

    private String statusMessage;

    /**
     * @param speakerSearchTaskId
     */

    public void setSpeakerSearchTaskId(String speakerSearchTaskId) {
        this.speakerSearchTaskId = speakerSearchTaskId;
    }

    /**
     * @return
     */

    public String getSpeakerSearchTaskId() {
        return this.speakerSearchTaskId;
    }

    /**
     * @param speakerSearchTaskId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerSearchTask withSpeakerSearchTaskId(String speakerSearchTaskId) {
        setSpeakerSearchTaskId(speakerSearchTaskId);
        return this;
    }

    /**
     * @param speakerSearchTaskStatus
     */

    public void setSpeakerSearchTaskStatus(String speakerSearchTaskStatus) {
        this.speakerSearchTaskStatus = speakerSearchTaskStatus;
    }

    /**
     * @return
     */

    public String getSpeakerSearchTaskStatus() {
        return this.speakerSearchTaskStatus;
    }

    /**
     * @param speakerSearchTaskStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerSearchTask withSpeakerSearchTaskStatus(String speakerSearchTaskStatus) {
        setSpeakerSearchTaskStatus(speakerSearchTaskStatus);
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

    public SpeakerSearchTask withCallDetails(CallDetails callDetails) {
        setCallDetails(callDetails);
        return this;
    }

    /**
     * @param speakerSearchDetails
     */

    public void setSpeakerSearchDetails(SpeakerSearchDetails speakerSearchDetails) {
        this.speakerSearchDetails = speakerSearchDetails;
    }

    /**
     * @return
     */

    public SpeakerSearchDetails getSpeakerSearchDetails() {
        return this.speakerSearchDetails;
    }

    /**
     * @param speakerSearchDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerSearchTask withSpeakerSearchDetails(SpeakerSearchDetails speakerSearchDetails) {
        setSpeakerSearchDetails(speakerSearchDetails);
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

    public SpeakerSearchTask withCreatedTimestamp(java.util.Date createdTimestamp) {
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

    public SpeakerSearchTask withUpdatedTimestamp(java.util.Date updatedTimestamp) {
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

    public SpeakerSearchTask withStartedTimestamp(java.util.Date startedTimestamp) {
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

    public SpeakerSearchTask withStatusMessage(String statusMessage) {
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
        if (getSpeakerSearchTaskId() != null)
            sb.append("SpeakerSearchTaskId: ").append(getSpeakerSearchTaskId()).append(",");
        if (getSpeakerSearchTaskStatus() != null)
            sb.append("SpeakerSearchTaskStatus: ").append(getSpeakerSearchTaskStatus()).append(",");
        if (getCallDetails() != null)
            sb.append("CallDetails: ").append(getCallDetails()).append(",");
        if (getSpeakerSearchDetails() != null)
            sb.append("SpeakerSearchDetails: ").append(getSpeakerSearchDetails()).append(",");
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

        if (obj instanceof SpeakerSearchTask == false)
            return false;
        SpeakerSearchTask other = (SpeakerSearchTask) obj;
        if (other.getSpeakerSearchTaskId() == null ^ this.getSpeakerSearchTaskId() == null)
            return false;
        if (other.getSpeakerSearchTaskId() != null && other.getSpeakerSearchTaskId().equals(this.getSpeakerSearchTaskId()) == false)
            return false;
        if (other.getSpeakerSearchTaskStatus() == null ^ this.getSpeakerSearchTaskStatus() == null)
            return false;
        if (other.getSpeakerSearchTaskStatus() != null && other.getSpeakerSearchTaskStatus().equals(this.getSpeakerSearchTaskStatus()) == false)
            return false;
        if (other.getCallDetails() == null ^ this.getCallDetails() == null)
            return false;
        if (other.getCallDetails() != null && other.getCallDetails().equals(this.getCallDetails()) == false)
            return false;
        if (other.getSpeakerSearchDetails() == null ^ this.getSpeakerSearchDetails() == null)
            return false;
        if (other.getSpeakerSearchDetails() != null && other.getSpeakerSearchDetails().equals(this.getSpeakerSearchDetails()) == false)
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

        hashCode = prime * hashCode + ((getSpeakerSearchTaskId() == null) ? 0 : getSpeakerSearchTaskId().hashCode());
        hashCode = prime * hashCode + ((getSpeakerSearchTaskStatus() == null) ? 0 : getSpeakerSearchTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getCallDetails() == null) ? 0 : getCallDetails().hashCode());
        hashCode = prime * hashCode + ((getSpeakerSearchDetails() == null) ? 0 : getSpeakerSearchDetails().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStartedTimestamp() == null) ? 0 : getStartedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public SpeakerSearchTask clone() {
        try {
            return (SpeakerSearchTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.SpeakerSearchTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
