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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the last <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request. This is set to
 * Completed after the configuration is updated, or removed if deletion of the data lake is successful.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details of the last <code>UpdateDatalake</code>or <code>DeleteDatalake</code> API request which failed.
     * </p>
     */
    private LastUpdateFailure lastUpdateFailure;
    /**
     * <p>
     * The unique ID for the <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request.
     * </p>
     */
    private String lastUpdateRequestId;
    /**
     * <p>
     * The status of the last <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request that was requested.
     * </p>
     */
    private String lastUpdateStatus;

    /**
     * <p>
     * The details of the last <code>UpdateDatalake</code>or <code>DeleteDatalake</code> API request which failed.
     * </p>
     * 
     * @param lastUpdateFailure
     *        The details of the last <code>UpdateDatalake</code>or <code>DeleteDatalake</code> API request which
     *        failed.
     */

    public void setLastUpdateFailure(LastUpdateFailure lastUpdateFailure) {
        this.lastUpdateFailure = lastUpdateFailure;
    }

    /**
     * <p>
     * The details of the last <code>UpdateDatalake</code>or <code>DeleteDatalake</code> API request which failed.
     * </p>
     * 
     * @return The details of the last <code>UpdateDatalake</code>or <code>DeleteDatalake</code> API request which
     *         failed.
     */

    public LastUpdateFailure getLastUpdateFailure() {
        return this.lastUpdateFailure;
    }

    /**
     * <p>
     * The details of the last <code>UpdateDatalake</code>or <code>DeleteDatalake</code> API request which failed.
     * </p>
     * 
     * @param lastUpdateFailure
     *        The details of the last <code>UpdateDatalake</code>or <code>DeleteDatalake</code> API request which
     *        failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStatus withLastUpdateFailure(LastUpdateFailure lastUpdateFailure) {
        setLastUpdateFailure(lastUpdateFailure);
        return this;
    }

    /**
     * <p>
     * The unique ID for the <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request.
     * </p>
     * 
     * @param lastUpdateRequestId
     *        The unique ID for the <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request.
     */

    public void setLastUpdateRequestId(String lastUpdateRequestId) {
        this.lastUpdateRequestId = lastUpdateRequestId;
    }

    /**
     * <p>
     * The unique ID for the <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request.
     * </p>
     * 
     * @return The unique ID for the <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request.
     */

    public String getLastUpdateRequestId() {
        return this.lastUpdateRequestId;
    }

    /**
     * <p>
     * The unique ID for the <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request.
     * </p>
     * 
     * @param lastUpdateRequestId
     *        The unique ID for the <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStatus withLastUpdateRequestId(String lastUpdateRequestId) {
        setLastUpdateRequestId(lastUpdateRequestId);
        return this;
    }

    /**
     * <p>
     * The status of the last <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request that was requested.
     * </p>
     * 
     * @param lastUpdateStatus
     *        The status of the last <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request that was
     *        requested.
     * @see SettingsStatus
     */

    public void setLastUpdateStatus(String lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus;
    }

    /**
     * <p>
     * The status of the last <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request that was requested.
     * </p>
     * 
     * @return The status of the last <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request that was
     *         requested.
     * @see SettingsStatus
     */

    public String getLastUpdateStatus() {
        return this.lastUpdateStatus;
    }

    /**
     * <p>
     * The status of the last <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request that was requested.
     * </p>
     * 
     * @param lastUpdateStatus
     *        The status of the last <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request that was
     *        requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingsStatus
     */

    public UpdateStatus withLastUpdateStatus(String lastUpdateStatus) {
        setLastUpdateStatus(lastUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The status of the last <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request that was requested.
     * </p>
     * 
     * @param lastUpdateStatus
     *        The status of the last <code>UpdateDatalake</code> or <code>DeleteDatalake</code> API request that was
     *        requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingsStatus
     */

    public UpdateStatus withLastUpdateStatus(SettingsStatus lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus.toString();
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
        if (getLastUpdateFailure() != null)
            sb.append("LastUpdateFailure: ").append(getLastUpdateFailure()).append(",");
        if (getLastUpdateRequestId() != null)
            sb.append("LastUpdateRequestId: ").append(getLastUpdateRequestId()).append(",");
        if (getLastUpdateStatus() != null)
            sb.append("LastUpdateStatus: ").append(getLastUpdateStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStatus == false)
            return false;
        UpdateStatus other = (UpdateStatus) obj;
        if (other.getLastUpdateFailure() == null ^ this.getLastUpdateFailure() == null)
            return false;
        if (other.getLastUpdateFailure() != null && other.getLastUpdateFailure().equals(this.getLastUpdateFailure()) == false)
            return false;
        if (other.getLastUpdateRequestId() == null ^ this.getLastUpdateRequestId() == null)
            return false;
        if (other.getLastUpdateRequestId() != null && other.getLastUpdateRequestId().equals(this.getLastUpdateRequestId()) == false)
            return false;
        if (other.getLastUpdateStatus() == null ^ this.getLastUpdateStatus() == null)
            return false;
        if (other.getLastUpdateStatus() != null && other.getLastUpdateStatus().equals(this.getLastUpdateStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastUpdateFailure() == null) ? 0 : getLastUpdateFailure().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateRequestId() == null) ? 0 : getLastUpdateRequestId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateStatus() == null) ? 0 : getLastUpdateStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStatus clone() {
        try {
            return (UpdateStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.UpdateStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
