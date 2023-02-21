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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolNetworkInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSolNetworkInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the network instance operation occurrence.
     * </p>
     */
    private String nsLcmOpOccId;

    /**
     * <p>
     * The identifier of the network instance operation occurrence.
     * </p>
     * 
     * @param nsLcmOpOccId
     *        The identifier of the network instance operation occurrence.
     */

    public void setNsLcmOpOccId(String nsLcmOpOccId) {
        this.nsLcmOpOccId = nsLcmOpOccId;
    }

    /**
     * <p>
     * The identifier of the network instance operation occurrence.
     * </p>
     * 
     * @return The identifier of the network instance operation occurrence.
     */

    public String getNsLcmOpOccId() {
        return this.nsLcmOpOccId;
    }

    /**
     * <p>
     * The identifier of the network instance operation occurrence.
     * </p>
     * 
     * @param nsLcmOpOccId
     *        The identifier of the network instance operation occurrence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSolNetworkInstanceResult withNsLcmOpOccId(String nsLcmOpOccId) {
        setNsLcmOpOccId(nsLcmOpOccId);
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
        if (getNsLcmOpOccId() != null)
            sb.append("NsLcmOpOccId: ").append(getNsLcmOpOccId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSolNetworkInstanceResult == false)
            return false;
        UpdateSolNetworkInstanceResult other = (UpdateSolNetworkInstanceResult) obj;
        if (other.getNsLcmOpOccId() == null ^ this.getNsLcmOpOccId() == null)
            return false;
        if (other.getNsLcmOpOccId() != null && other.getNsLcmOpOccId().equals(this.getNsLcmOpOccId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNsLcmOpOccId() == null) ? 0 : getNsLcmOpOccId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSolNetworkInstanceResult clone() {
        try {
            return (UpdateSolNetworkInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
