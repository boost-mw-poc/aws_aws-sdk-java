/*
 * Copyright 2020-2025 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an individual contributor to a multi-timeseries alarm, containing information about a specific time series
 * and its contribution to the alarm's state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/AlarmContributor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmContributor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for this alarm contributor.
     * </p>
     */
    private String contributorId;
    /**
     * <p>
     * A map of attributes that describe the contributor, such as metric dimensions and other identifying
     * characteristics.
     * </p>
     */
    private java.util.Map<String, String> contributorAttributes;
    /**
     * <p>
     * An explanation for the contributor's current state, providing context about why it is in its current condition.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The timestamp when the contributor last transitioned to its current state.
     * </p>
     */
    private java.util.Date stateTransitionedTimestamp;

    /**
     * <p>
     * The unique identifier for this alarm contributor.
     * </p>
     * 
     * @param contributorId
     *        The unique identifier for this alarm contributor.
     */

    public void setContributorId(String contributorId) {
        this.contributorId = contributorId;
    }

    /**
     * <p>
     * The unique identifier for this alarm contributor.
     * </p>
     * 
     * @return The unique identifier for this alarm contributor.
     */

    public String getContributorId() {
        return this.contributorId;
    }

    /**
     * <p>
     * The unique identifier for this alarm contributor.
     * </p>
     * 
     * @param contributorId
     *        The unique identifier for this alarm contributor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmContributor withContributorId(String contributorId) {
        setContributorId(contributorId);
        return this;
    }

    /**
     * <p>
     * A map of attributes that describe the contributor, such as metric dimensions and other identifying
     * characteristics.
     * </p>
     * 
     * @return A map of attributes that describe the contributor, such as metric dimensions and other identifying
     *         characteristics.
     */

    public java.util.Map<String, String> getContributorAttributes() {
        return contributorAttributes;
    }

    /**
     * <p>
     * A map of attributes that describe the contributor, such as metric dimensions and other identifying
     * characteristics.
     * </p>
     * 
     * @param contributorAttributes
     *        A map of attributes that describe the contributor, such as metric dimensions and other identifying
     *        characteristics.
     */

    public void setContributorAttributes(java.util.Map<String, String> contributorAttributes) {
        this.contributorAttributes = contributorAttributes;
    }

    /**
     * <p>
     * A map of attributes that describe the contributor, such as metric dimensions and other identifying
     * characteristics.
     * </p>
     * 
     * @param contributorAttributes
     *        A map of attributes that describe the contributor, such as metric dimensions and other identifying
     *        characteristics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmContributor withContributorAttributes(java.util.Map<String, String> contributorAttributes) {
        setContributorAttributes(contributorAttributes);
        return this;
    }

    /**
     * Add a single ContributorAttributes entry
     *
     * @see AlarmContributor#withContributorAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AlarmContributor addContributorAttributesEntry(String key, String value) {
        if (null == this.contributorAttributes) {
            this.contributorAttributes = new java.util.HashMap<String, String>();
        }
        if (this.contributorAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.contributorAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ContributorAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmContributor clearContributorAttributesEntries() {
        this.contributorAttributes = null;
        return this;
    }

    /**
     * <p>
     * An explanation for the contributor's current state, providing context about why it is in its current condition.
     * </p>
     * 
     * @param stateReason
     *        An explanation for the contributor's current state, providing context about why it is in its current
     *        condition.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * An explanation for the contributor's current state, providing context about why it is in its current condition.
     * </p>
     * 
     * @return An explanation for the contributor's current state, providing context about why it is in its current
     *         condition.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * An explanation for the contributor's current state, providing context about why it is in its current condition.
     * </p>
     * 
     * @param stateReason
     *        An explanation for the contributor's current state, providing context about why it is in its current
     *        condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmContributor withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The timestamp when the contributor last transitioned to its current state.
     * </p>
     * 
     * @param stateTransitionedTimestamp
     *        The timestamp when the contributor last transitioned to its current state.
     */

    public void setStateTransitionedTimestamp(java.util.Date stateTransitionedTimestamp) {
        this.stateTransitionedTimestamp = stateTransitionedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contributor last transitioned to its current state.
     * </p>
     * 
     * @return The timestamp when the contributor last transitioned to its current state.
     */

    public java.util.Date getStateTransitionedTimestamp() {
        return this.stateTransitionedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contributor last transitioned to its current state.
     * </p>
     * 
     * @param stateTransitionedTimestamp
     *        The timestamp when the contributor last transitioned to its current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmContributor withStateTransitionedTimestamp(java.util.Date stateTransitionedTimestamp) {
        setStateTransitionedTimestamp(stateTransitionedTimestamp);
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
        if (getContributorId() != null)
            sb.append("ContributorId: ").append(getContributorId()).append(",");
        if (getContributorAttributes() != null)
            sb.append("ContributorAttributes: ").append(getContributorAttributes()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getStateTransitionedTimestamp() != null)
            sb.append("StateTransitionedTimestamp: ").append(getStateTransitionedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmContributor == false)
            return false;
        AlarmContributor other = (AlarmContributor) obj;
        if (other.getContributorId() == null ^ this.getContributorId() == null)
            return false;
        if (other.getContributorId() != null && other.getContributorId().equals(this.getContributorId()) == false)
            return false;
        if (other.getContributorAttributes() == null ^ this.getContributorAttributes() == null)
            return false;
        if (other.getContributorAttributes() != null && other.getContributorAttributes().equals(this.getContributorAttributes()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getStateTransitionedTimestamp() == null ^ this.getStateTransitionedTimestamp() == null)
            return false;
        if (other.getStateTransitionedTimestamp() != null && other.getStateTransitionedTimestamp().equals(this.getStateTransitionedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContributorId() == null) ? 0 : getContributorId().hashCode());
        hashCode = prime * hashCode + ((getContributorAttributes() == null) ? 0 : getContributorAttributes().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getStateTransitionedTimestamp() == null) ? 0 : getStateTransitionedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public AlarmContributor clone() {
        try {
            return (AlarmContributor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatch.model.transform.AlarmContributorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
