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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/InstantiateSolNetworkInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstantiateSolNetworkInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A check for whether you have the required permissions for the action without actually making the request and
     * provides an error response. If you have the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;
    /**
     * <p>
     * ID of the network instance.
     * </p>
     */
    private String nsInstanceId;

    /**
     * <p>
     * A check for whether you have the required permissions for the action without actually making the request and
     * provides an error response. If you have the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     * </p>
     * 
     * @param dryRun
     *        A check for whether you have the required permissions for the action without actually making the request
     *        and provides an error response. If you have the required permissions, the error response is
     *        <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * A check for whether you have the required permissions for the action without actually making the request and
     * provides an error response. If you have the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     * </p>
     * 
     * @return A check for whether you have the required permissions for the action without actually making the request
     *         and provides an error response. If you have the required permissions, the error response is
     *         <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * A check for whether you have the required permissions for the action without actually making the request and
     * provides an error response. If you have the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     * </p>
     * 
     * @param dryRun
     *        A check for whether you have the required permissions for the action without actually making the request
     *        and provides an error response. If you have the required permissions, the error response is
     *        <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstantiateSolNetworkInstanceRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * A check for whether you have the required permissions for the action without actually making the request and
     * provides an error response. If you have the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     * </p>
     * 
     * @return A check for whether you have the required permissions for the action without actually making the request
     *         and provides an error response. If you have the required permissions, the error response is
     *         <code>DryRunOperation</code>. Otherwise, it is <code>UnauthorizedOperation</code>.
     */

    public Boolean isDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * ID of the network instance.
     * </p>
     * 
     * @param nsInstanceId
     *        ID of the network instance.
     */

    public void setNsInstanceId(String nsInstanceId) {
        this.nsInstanceId = nsInstanceId;
    }

    /**
     * <p>
     * ID of the network instance.
     * </p>
     * 
     * @return ID of the network instance.
     */

    public String getNsInstanceId() {
        return this.nsInstanceId;
    }

    /**
     * <p>
     * ID of the network instance.
     * </p>
     * 
     * @param nsInstanceId
     *        ID of the network instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstantiateSolNetworkInstanceRequest withNsInstanceId(String nsInstanceId) {
        setNsInstanceId(nsInstanceId);
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
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun()).append(",");
        if (getNsInstanceId() != null)
            sb.append("NsInstanceId: ").append(getNsInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstantiateSolNetworkInstanceRequest == false)
            return false;
        InstantiateSolNetworkInstanceRequest other = (InstantiateSolNetworkInstanceRequest) obj;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getNsInstanceId() == null ^ this.getNsInstanceId() == null)
            return false;
        if (other.getNsInstanceId() != null && other.getNsInstanceId().equals(this.getNsInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getNsInstanceId() == null) ? 0 : getNsInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public InstantiateSolNetworkInstanceRequest clone() {
        return (InstantiateSolNetworkInstanceRequest) super.clone();
    }

}
