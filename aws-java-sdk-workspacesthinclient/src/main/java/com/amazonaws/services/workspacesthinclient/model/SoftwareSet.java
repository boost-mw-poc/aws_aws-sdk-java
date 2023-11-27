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
 * Describes a software set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/SoftwareSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SoftwareSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the software set.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The version of the software set.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The timestamp of when the software set was released.
     * </p>
     */
    private java.util.Date releasedAt;
    /**
     * <p>
     * The timestamp of the end of support for the software set.
     * </p>
     */
    private java.util.Date supportedUntil;
    /**
     * <p>
     * An option to define if the software set has been validated.
     * </p>
     */
    private String validationStatus;
    /**
     * <p>
     * A list of the software components in the software set.
     * </p>
     */
    private java.util.List<Software> software;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the software set.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ID of the software set.
     * </p>
     * 
     * @param id
     *        The ID of the software set.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the software set.
     * </p>
     * 
     * @return The ID of the software set.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the software set.
     * </p>
     * 
     * @param id
     *        The ID of the software set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwareSet withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The version of the software set.
     * </p>
     * 
     * @param version
     *        The version of the software set.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the software set.
     * </p>
     * 
     * @return The version of the software set.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the software set.
     * </p>
     * 
     * @param version
     *        The version of the software set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwareSet withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the software set was released.
     * </p>
     * 
     * @param releasedAt
     *        The timestamp of when the software set was released.
     */

    public void setReleasedAt(java.util.Date releasedAt) {
        this.releasedAt = releasedAt;
    }

    /**
     * <p>
     * The timestamp of when the software set was released.
     * </p>
     * 
     * @return The timestamp of when the software set was released.
     */

    public java.util.Date getReleasedAt() {
        return this.releasedAt;
    }

    /**
     * <p>
     * The timestamp of when the software set was released.
     * </p>
     * 
     * @param releasedAt
     *        The timestamp of when the software set was released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwareSet withReleasedAt(java.util.Date releasedAt) {
        setReleasedAt(releasedAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of the end of support for the software set.
     * </p>
     * 
     * @param supportedUntil
     *        The timestamp of the end of support for the software set.
     */

    public void setSupportedUntil(java.util.Date supportedUntil) {
        this.supportedUntil = supportedUntil;
    }

    /**
     * <p>
     * The timestamp of the end of support for the software set.
     * </p>
     * 
     * @return The timestamp of the end of support for the software set.
     */

    public java.util.Date getSupportedUntil() {
        return this.supportedUntil;
    }

    /**
     * <p>
     * The timestamp of the end of support for the software set.
     * </p>
     * 
     * @param supportedUntil
     *        The timestamp of the end of support for the software set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwareSet withSupportedUntil(java.util.Date supportedUntil) {
        setSupportedUntil(supportedUntil);
        return this;
    }

    /**
     * <p>
     * An option to define if the software set has been validated.
     * </p>
     * 
     * @param validationStatus
     *        An option to define if the software set has been validated.
     * @see SoftwareSetValidationStatus
     */

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    /**
     * <p>
     * An option to define if the software set has been validated.
     * </p>
     * 
     * @return An option to define if the software set has been validated.
     * @see SoftwareSetValidationStatus
     */

    public String getValidationStatus() {
        return this.validationStatus;
    }

    /**
     * <p>
     * An option to define if the software set has been validated.
     * </p>
     * 
     * @param validationStatus
     *        An option to define if the software set has been validated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SoftwareSetValidationStatus
     */

    public SoftwareSet withValidationStatus(String validationStatus) {
        setValidationStatus(validationStatus);
        return this;
    }

    /**
     * <p>
     * An option to define if the software set has been validated.
     * </p>
     * 
     * @param validationStatus
     *        An option to define if the software set has been validated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SoftwareSetValidationStatus
     */

    public SoftwareSet withValidationStatus(SoftwareSetValidationStatus validationStatus) {
        this.validationStatus = validationStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of the software components in the software set.
     * </p>
     * 
     * @return A list of the software components in the software set.
     */

    public java.util.List<Software> getSoftware() {
        return software;
    }

    /**
     * <p>
     * A list of the software components in the software set.
     * </p>
     * 
     * @param software
     *        A list of the software components in the software set.
     */

    public void setSoftware(java.util.Collection<Software> software) {
        if (software == null) {
            this.software = null;
            return;
        }

        this.software = new java.util.ArrayList<Software>(software);
    }

    /**
     * <p>
     * A list of the software components in the software set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSoftware(java.util.Collection)} or {@link #withSoftware(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param software
     *        A list of the software components in the software set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwareSet withSoftware(Software... software) {
        if (this.software == null) {
            setSoftware(new java.util.ArrayList<Software>(software.length));
        }
        for (Software ele : software) {
            this.software.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the software components in the software set.
     * </p>
     * 
     * @param software
     *        A list of the software components in the software set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwareSet withSoftware(java.util.Collection<Software> software) {
        setSoftware(software);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the software set.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the software set.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the software set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the software set.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the software set.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the software set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwareSet withArn(String arn) {
        setArn(arn);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getReleasedAt() != null)
            sb.append("ReleasedAt: ").append(getReleasedAt()).append(",");
        if (getSupportedUntil() != null)
            sb.append("SupportedUntil: ").append(getSupportedUntil()).append(",");
        if (getValidationStatus() != null)
            sb.append("ValidationStatus: ").append(getValidationStatus()).append(",");
        if (getSoftware() != null)
            sb.append("Software: ").append(getSoftware()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SoftwareSet == false)
            return false;
        SoftwareSet other = (SoftwareSet) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getReleasedAt() == null ^ this.getReleasedAt() == null)
            return false;
        if (other.getReleasedAt() != null && other.getReleasedAt().equals(this.getReleasedAt()) == false)
            return false;
        if (other.getSupportedUntil() == null ^ this.getSupportedUntil() == null)
            return false;
        if (other.getSupportedUntil() != null && other.getSupportedUntil().equals(this.getSupportedUntil()) == false)
            return false;
        if (other.getValidationStatus() == null ^ this.getValidationStatus() == null)
            return false;
        if (other.getValidationStatus() != null && other.getValidationStatus().equals(this.getValidationStatus()) == false)
            return false;
        if (other.getSoftware() == null ^ this.getSoftware() == null)
            return false;
        if (other.getSoftware() != null && other.getSoftware().equals(this.getSoftware()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getReleasedAt() == null) ? 0 : getReleasedAt().hashCode());
        hashCode = prime * hashCode + ((getSupportedUntil() == null) ? 0 : getSupportedUntil().hashCode());
        hashCode = prime * hashCode + ((getValidationStatus() == null) ? 0 : getValidationStatus().hashCode());
        hashCode = prime * hashCode + ((getSoftware() == null) ? 0 : getSoftware().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public SoftwareSet clone() {
        try {
            return (SoftwareSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesthinclient.model.transform.SoftwareSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
