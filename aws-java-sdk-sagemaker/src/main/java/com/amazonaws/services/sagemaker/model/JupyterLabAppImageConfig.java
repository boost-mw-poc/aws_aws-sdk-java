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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the file system and kernels in a SageMaker image running as a JupyterLab app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/JupyterLabAppImageConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JupyterLabAppImageConfig implements Serializable, Cloneable, StructuredPojo {

    private ContainerConfig containerConfig;

    /**
     * @param containerConfig
     */

    public void setContainerConfig(ContainerConfig containerConfig) {
        this.containerConfig = containerConfig;
    }

    /**
     * @return
     */

    public ContainerConfig getContainerConfig() {
        return this.containerConfig;
    }

    /**
     * @param containerConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JupyterLabAppImageConfig withContainerConfig(ContainerConfig containerConfig) {
        setContainerConfig(containerConfig);
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
        if (getContainerConfig() != null)
            sb.append("ContainerConfig: ").append(getContainerConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JupyterLabAppImageConfig == false)
            return false;
        JupyterLabAppImageConfig other = (JupyterLabAppImageConfig) obj;
        if (other.getContainerConfig() == null ^ this.getContainerConfig() == null)
            return false;
        if (other.getContainerConfig() != null && other.getContainerConfig().equals(this.getContainerConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerConfig() == null) ? 0 : getContainerConfig().hashCode());
        return hashCode;
    }

    @Override
    public JupyterLabAppImageConfig clone() {
        try {
            return (JupyterLabAppImageConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.JupyterLabAppImageConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
