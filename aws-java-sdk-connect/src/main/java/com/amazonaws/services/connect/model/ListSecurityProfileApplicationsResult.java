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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfileApplications"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecurityProfileApplicationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * A list of the third party application's metadata.
     * </p>
     */
    private java.util.List<Application> applications;
    /**
     * <p>
     * The token for the next set of results. The next set of results can be retrieved by using the token value returned
     * in the previous response when making the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * A list of the third party application's metadata.
     * </p>
     * 
     * @return This API is in preview release for Amazon Connect and is subject to change.</p>
     *         <p>
     *         A list of the third party application's metadata.
     */

    public java.util.List<Application> getApplications() {
        return applications;
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * A list of the third party application's metadata.
     * </p>
     * 
     * @param applications
     *        This API is in preview release for Amazon Connect and is subject to change.</p>
     *        <p>
     *        A list of the third party application's metadata.
     */

    public void setApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new java.util.ArrayList<Application>(applications);
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * A list of the third party application's metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applications
     *        This API is in preview release for Amazon Connect and is subject to change.</p>
     *        <p>
     *        A list of the third party application's metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfileApplicationsResult withApplications(Application... applications) {
        if (this.applications == null) {
            setApplications(new java.util.ArrayList<Application>(applications.length));
        }
        for (Application ele : applications) {
            this.applications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * A list of the third party application's metadata.
     * </p>
     * 
     * @param applications
     *        This API is in preview release for Amazon Connect and is subject to change.</p>
     *        <p>
     *        A list of the third party application's metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfileApplicationsResult withApplications(java.util.Collection<Application> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. The next set of results can be retrieved by using the token value returned
     * in the previous response when making the next request.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. The next set of results can be retrieved by using the token value
     *        returned in the previous response when making the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. The next set of results can be retrieved by using the token value returned
     * in the previous response when making the next request.
     * </p>
     * 
     * @return The token for the next set of results. The next set of results can be retrieved by using the token value
     *         returned in the previous response when making the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. The next set of results can be retrieved by using the token value returned
     * in the previous response when making the next request.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. The next set of results can be retrieved by using the token value
     *        returned in the previous response when making the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfileApplicationsResult withNextToken(String nextToken) {
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
        if (getApplications() != null)
            sb.append("Applications: ").append(getApplications()).append(",");
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

        if (obj instanceof ListSecurityProfileApplicationsResult == false)
            return false;
        ListSecurityProfileApplicationsResult other = (ListSecurityProfileApplicationsResult) obj;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
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

        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityProfileApplicationsResult clone() {
        try {
            return (ListSecurityProfileApplicationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
