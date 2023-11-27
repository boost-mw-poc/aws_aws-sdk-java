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
package com.amazonaws.services.workspacesthinclient.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resource and internal ID of a resource to tag.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/EmbeddedTag" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmbeddedTag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource to tag.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The internal ID of a resource to tag.
     * </p>
     */
    private String internalId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource to tag.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of a resource to tag.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource to tag.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a resource to tag.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource to tag.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of a resource to tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmbeddedTag withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The internal ID of a resource to tag.
     * </p>
     * 
     * @param internalId
     *        The internal ID of a resource to tag.
     */

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    /**
     * <p>
     * The internal ID of a resource to tag.
     * </p>
     * 
     * @return The internal ID of a resource to tag.
     */

    public String getInternalId() {
        return this.internalId;
    }

    /**
     * <p>
     * The internal ID of a resource to tag.
     * </p>
     * 
     * @param internalId
     *        The internal ID of a resource to tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmbeddedTag withInternalId(String internalId) {
        setInternalId(internalId);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getInternalId() != null)
            sb.append("InternalId: ").append(getInternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmbeddedTag == false)
            return false;
        EmbeddedTag other = (EmbeddedTag) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getInternalId() == null ^ this.getInternalId() == null)
            return false;
        if (other.getInternalId() != null && other.getInternalId().equals(this.getInternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getInternalId() == null) ? 0 : getInternalId().hashCode());
        return hashCode;
    }

    @Override
    public EmbeddedTag clone() {
        try {
            return (EmbeddedTag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesthinclient.model.transform.EmbeddedTagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
