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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/SpeakerSearchDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpeakerSearchDetails implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<SpeakerSearchResult> results;

    private String voiceprintGenerationStatus;

    /**
     * @return
     */

    public java.util.List<SpeakerSearchResult> getResults() {
        return results;
    }

    /**
     * @param results
     */

    public void setResults(java.util.Collection<SpeakerSearchResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<SpeakerSearchResult>(results);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerSearchDetails withResults(SpeakerSearchResult... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<SpeakerSearchResult>(results.length));
        }
        for (SpeakerSearchResult ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * @param results
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerSearchDetails withResults(java.util.Collection<SpeakerSearchResult> results) {
        setResults(results);
        return this;
    }

    /**
     * @param voiceprintGenerationStatus
     */

    public void setVoiceprintGenerationStatus(String voiceprintGenerationStatus) {
        this.voiceprintGenerationStatus = voiceprintGenerationStatus;
    }

    /**
     * @return
     */

    public String getVoiceprintGenerationStatus() {
        return this.voiceprintGenerationStatus;
    }

    /**
     * @param voiceprintGenerationStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerSearchDetails withVoiceprintGenerationStatus(String voiceprintGenerationStatus) {
        setVoiceprintGenerationStatus(voiceprintGenerationStatus);
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults()).append(",");
        if (getVoiceprintGenerationStatus() != null)
            sb.append("VoiceprintGenerationStatus: ").append(getVoiceprintGenerationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpeakerSearchDetails == false)
            return false;
        SpeakerSearchDetails other = (SpeakerSearchDetails) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getVoiceprintGenerationStatus() == null ^ this.getVoiceprintGenerationStatus() == null)
            return false;
        if (other.getVoiceprintGenerationStatus() != null && other.getVoiceprintGenerationStatus().equals(this.getVoiceprintGenerationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getVoiceprintGenerationStatus() == null) ? 0 : getVoiceprintGenerationStatus().hashCode());
        return hashCode;
    }

    @Override
    public SpeakerSearchDetails clone() {
        try {
            return (SpeakerSearchDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.SpeakerSearchDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
