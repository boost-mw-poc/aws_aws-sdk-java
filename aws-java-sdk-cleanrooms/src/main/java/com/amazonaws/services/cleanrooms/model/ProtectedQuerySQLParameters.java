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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for the SQL type Protected Query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ProtectedQuerySQLParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectedQuerySQLParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The query string to be submitted.
     * </p>
     */
    private String queryString;

    /**
     * <p>
     * The query string to be submitted.
     * </p>
     * 
     * @param queryString
     *        The query string to be submitted.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string to be submitted.
     * </p>
     * 
     * @return The query string to be submitted.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query string to be submitted.
     * </p>
     * 
     * @param queryString
     *        The query string to be submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuerySQLParameters withQueryString(String queryString) {
        setQueryString(queryString);
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
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectedQuerySQLParameters == false)
            return false;
        ProtectedQuerySQLParameters other = (ProtectedQuerySQLParameters) obj;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        return hashCode;
    }

    @Override
    public ProtectedQuerySQLParameters clone() {
        try {
            return (ProtectedQuerySQLParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ProtectedQuerySQLParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
