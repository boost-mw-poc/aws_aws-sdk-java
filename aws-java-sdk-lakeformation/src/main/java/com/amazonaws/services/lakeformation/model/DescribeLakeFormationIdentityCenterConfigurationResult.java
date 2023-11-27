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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeLakeFormationIdentityCenterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLakeFormationIdentityCenterConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the integrated application.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * Indicates if external filtering is enabled.
     * </p>
     */
    private ExternalFilteringConfiguration externalFiltering;

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your Lake Formation environment.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     * </p>
     * 
     * @return The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *         metadata store. It contains database definitions, table definitions, and other control information to
     *         manage your Lake Formation environment.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your Lake Formation environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLakeFormationIdentityCenterConfigurationResult withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the connection.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the connection.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLakeFormationIdentityCenterConfigurationResult withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the integrated application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the integrated application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the integrated application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the integrated application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the integrated application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the integrated application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLakeFormationIdentityCenterConfigurationResult withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * Indicates if external filtering is enabled.
     * </p>
     * 
     * @param externalFiltering
     *        Indicates if external filtering is enabled.
     */

    public void setExternalFiltering(ExternalFilteringConfiguration externalFiltering) {
        this.externalFiltering = externalFiltering;
    }

    /**
     * <p>
     * Indicates if external filtering is enabled.
     * </p>
     * 
     * @return Indicates if external filtering is enabled.
     */

    public ExternalFilteringConfiguration getExternalFiltering() {
        return this.externalFiltering;
    }

    /**
     * <p>
     * Indicates if external filtering is enabled.
     * </p>
     * 
     * @param externalFiltering
     *        Indicates if external filtering is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLakeFormationIdentityCenterConfigurationResult withExternalFiltering(ExternalFilteringConfiguration externalFiltering) {
        setExternalFiltering(externalFiltering);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getExternalFiltering() != null)
            sb.append("ExternalFiltering: ").append(getExternalFiltering());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLakeFormationIdentityCenterConfigurationResult == false)
            return false;
        DescribeLakeFormationIdentityCenterConfigurationResult other = (DescribeLakeFormationIdentityCenterConfigurationResult) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getExternalFiltering() == null ^ this.getExternalFiltering() == null)
            return false;
        if (other.getExternalFiltering() != null && other.getExternalFiltering().equals(this.getExternalFiltering()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getExternalFiltering() == null) ? 0 : getExternalFiltering().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLakeFormationIdentityCenterConfigurationResult clone() {
        try {
            return (DescribeLakeFormationIdentityCenterConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
