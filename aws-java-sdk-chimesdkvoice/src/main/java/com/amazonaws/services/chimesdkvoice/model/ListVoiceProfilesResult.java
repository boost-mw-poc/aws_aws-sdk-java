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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceProfiles" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVoiceProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<VoiceProfileSummary> voiceProfiles;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<VoiceProfileSummary> getVoiceProfiles() {
        return voiceProfiles;
    }

    /**
     * @param voiceProfiles
     */

    public void setVoiceProfiles(java.util.Collection<VoiceProfileSummary> voiceProfiles) {
        if (voiceProfiles == null) {
            this.voiceProfiles = null;
            return;
        }

        this.voiceProfiles = new java.util.ArrayList<VoiceProfileSummary>(voiceProfiles);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVoiceProfiles(java.util.Collection)} or {@link #withVoiceProfiles(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param voiceProfiles
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVoiceProfilesResult withVoiceProfiles(VoiceProfileSummary... voiceProfiles) {
        if (this.voiceProfiles == null) {
            setVoiceProfiles(new java.util.ArrayList<VoiceProfileSummary>(voiceProfiles.length));
        }
        for (VoiceProfileSummary ele : voiceProfiles) {
            this.voiceProfiles.add(ele);
        }
        return this;
    }

    /**
     * @param voiceProfiles
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVoiceProfilesResult withVoiceProfiles(java.util.Collection<VoiceProfileSummary> voiceProfiles) {
        setVoiceProfiles(voiceProfiles);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVoiceProfilesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getVoiceProfiles() != null)
            sb.append("VoiceProfiles: ").append(getVoiceProfiles()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVoiceProfilesResult == false)
            return false;
        ListVoiceProfilesResult other = (ListVoiceProfilesResult) obj;
        if (other.getVoiceProfiles() == null ^ this.getVoiceProfiles() == null)
            return false;
        if (other.getVoiceProfiles() != null && other.getVoiceProfiles().equals(this.getVoiceProfiles()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceProfiles() == null) ? 0 : getVoiceProfiles().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVoiceProfilesResult clone() {
        try {
            return (ListVoiceProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
