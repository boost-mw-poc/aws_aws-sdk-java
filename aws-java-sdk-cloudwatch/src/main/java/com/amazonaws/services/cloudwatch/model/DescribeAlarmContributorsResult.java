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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAlarmContributors"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlarmContributorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of alarm contributors that provide details about the individual time series contributing to the alarm's
     * state.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AlarmContributor> alarmContributors;
    /**
     * <p>
     * The token that marks the start of the next batch of returned results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of alarm contributors that provide details about the individual time series contributing to the alarm's
     * state.
     * </p>
     * 
     * @return A list of alarm contributors that provide details about the individual time series contributing to the
     *         alarm's state.
     */

    public java.util.List<AlarmContributor> getAlarmContributors() {
        if (alarmContributors == null) {
            alarmContributors = new com.amazonaws.internal.SdkInternalList<AlarmContributor>();
        }
        return alarmContributors;
    }

    /**
     * <p>
     * A list of alarm contributors that provide details about the individual time series contributing to the alarm's
     * state.
     * </p>
     * 
     * @param alarmContributors
     *        A list of alarm contributors that provide details about the individual time series contributing to the
     *        alarm's state.
     */

    public void setAlarmContributors(java.util.Collection<AlarmContributor> alarmContributors) {
        if (alarmContributors == null) {
            this.alarmContributors = null;
            return;
        }

        this.alarmContributors = new com.amazonaws.internal.SdkInternalList<AlarmContributor>(alarmContributors);
    }

    /**
     * <p>
     * A list of alarm contributors that provide details about the individual time series contributing to the alarm's
     * state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmContributors(java.util.Collection)} or {@link #withAlarmContributors(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param alarmContributors
     *        A list of alarm contributors that provide details about the individual time series contributing to the
     *        alarm's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmContributorsResult withAlarmContributors(AlarmContributor... alarmContributors) {
        if (this.alarmContributors == null) {
            setAlarmContributors(new com.amazonaws.internal.SdkInternalList<AlarmContributor>(alarmContributors.length));
        }
        for (AlarmContributor ele : alarmContributors) {
            this.alarmContributors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of alarm contributors that provide details about the individual time series contributing to the alarm's
     * state.
     * </p>
     * 
     * @param alarmContributors
     *        A list of alarm contributors that provide details about the individual time series contributing to the
     *        alarm's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmContributorsResult withAlarmContributors(java.util.Collection<AlarmContributor> alarmContributors) {
        setAlarmContributors(alarmContributors);
        return this;
    }

    /**
     * <p>
     * The token that marks the start of the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        The token that marks the start of the next batch of returned results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that marks the start of the next batch of returned results.
     * </p>
     * 
     * @return The token that marks the start of the next batch of returned results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that marks the start of the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        The token that marks the start of the next batch of returned results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlarmContributorsResult withNextToken(String nextToken) {
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
        if (getAlarmContributors() != null)
            sb.append("AlarmContributors: ").append(getAlarmContributors()).append(",");
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

        if (obj instanceof DescribeAlarmContributorsResult == false)
            return false;
        DescribeAlarmContributorsResult other = (DescribeAlarmContributorsResult) obj;
        if (other.getAlarmContributors() == null ^ this.getAlarmContributors() == null)
            return false;
        if (other.getAlarmContributors() != null && other.getAlarmContributors().equals(this.getAlarmContributors()) == false)
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

        hashCode = prime * hashCode + ((getAlarmContributors() == null) ? 0 : getAlarmContributors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlarmContributorsResult clone() {
        try {
            return (DescribeAlarmContributorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
