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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceToneAnalysisTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVoiceToneAnalysisTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String voiceConnectorId;

    private String voiceToneAnalysisTaskId;

    private Boolean isCaller;

    /**
     * @param voiceConnectorId
     */

    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * @return
     */

    public String getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    /**
     * @param voiceConnectorId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVoiceToneAnalysisTaskRequest withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

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

    public GetVoiceToneAnalysisTaskRequest withVoiceToneAnalysisTaskId(String voiceToneAnalysisTaskId) {
        setVoiceToneAnalysisTaskId(voiceToneAnalysisTaskId);
        return this;
    }

    /**
     * @param isCaller
     */

    public void setIsCaller(Boolean isCaller) {
        this.isCaller = isCaller;
    }

    /**
     * @return
     */

    public Boolean getIsCaller() {
        return this.isCaller;
    }

    /**
     * @param isCaller
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVoiceToneAnalysisTaskRequest withIsCaller(Boolean isCaller) {
        setIsCaller(isCaller);
        return this;
    }

    /**
     * @return
     */

    public Boolean isCaller() {
        return this.isCaller;
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
        if (getVoiceConnectorId() != null)
            sb.append("VoiceConnectorId: ").append(getVoiceConnectorId()).append(",");
        if (getVoiceToneAnalysisTaskId() != null)
            sb.append("VoiceToneAnalysisTaskId: ").append(getVoiceToneAnalysisTaskId()).append(",");
        if (getIsCaller() != null)
            sb.append("IsCaller: ").append(getIsCaller());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVoiceToneAnalysisTaskRequest == false)
            return false;
        GetVoiceToneAnalysisTaskRequest other = (GetVoiceToneAnalysisTaskRequest) obj;
        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getVoiceToneAnalysisTaskId() == null ^ this.getVoiceToneAnalysisTaskId() == null)
            return false;
        if (other.getVoiceToneAnalysisTaskId() != null && other.getVoiceToneAnalysisTaskId().equals(this.getVoiceToneAnalysisTaskId()) == false)
            return false;
        if (other.getIsCaller() == null ^ this.getIsCaller() == null)
            return false;
        if (other.getIsCaller() != null && other.getIsCaller().equals(this.getIsCaller()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getVoiceToneAnalysisTaskId() == null) ? 0 : getVoiceToneAnalysisTaskId().hashCode());
        hashCode = prime * hashCode + ((getIsCaller() == null) ? 0 : getIsCaller().hashCode());
        return hashCode;
    }

    @Override
    public GetVoiceToneAnalysisTaskRequest clone() {
        return (GetVoiceToneAnalysisTaskRequest) super.clone();
    }

}
