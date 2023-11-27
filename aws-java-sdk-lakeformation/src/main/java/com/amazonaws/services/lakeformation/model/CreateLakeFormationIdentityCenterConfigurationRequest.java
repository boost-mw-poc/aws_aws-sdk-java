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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CreateLakeFormationIdentityCenterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLakeFormationIdentityCenterConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, view definitions, and other control information to
     * manage your Lake Formation environment.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The ARN of the IAM Identity Center instance for which the operation will be executed. For more information about
     * ARNs, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in the Amazon Web Services
     * General Reference.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to to
     * access data managed by Lake Formation.
     * </p>
     */
    private ExternalFilteringConfiguration externalFiltering;

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, view definitions, and other control information to
     * manage your Lake Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, view definitions, and other control
     *        information to manage your Lake Formation environment.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, view definitions, and other control information to
     * manage your Lake Formation environment.
     * </p>
     * 
     * @return The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *         metadata store. It contains database definitions, table definitions, view definitions, and other control
     *         information to manage your Lake Formation environment.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, view definitions, and other control information to
     * manage your Lake Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, view definitions, and other control
     *        information to manage your Lake Formation environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLakeFormationIdentityCenterConfigurationRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM Identity Center instance for which the operation will be executed. For more information about
     * ARNs, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in the Amazon Web Services
     * General Reference.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the IAM Identity Center instance for which the operation will be executed. For more information
     *        about ARNs, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in the Amazon Web
     *        Services General Reference.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the IAM Identity Center instance for which the operation will be executed. For more information about
     * ARNs, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in the Amazon Web Services
     * General Reference.
     * </p>
     * 
     * @return The ARN of the IAM Identity Center instance for which the operation will be executed. For more
     *         information about ARNs, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in
     *         the Amazon Web Services General Reference.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The ARN of the IAM Identity Center instance for which the operation will be executed. For more information about
     * ARNs, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in the Amazon Web Services
     * General Reference.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the IAM Identity Center instance for which the operation will be executed. For more information
     *        about ARNs, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in the Amazon Web
     *        Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLakeFormationIdentityCenterConfigurationRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to to
     * access data managed by Lake Formation.
     * </p>
     * 
     * @param externalFiltering
     *        A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to
     *        to access data managed by Lake Formation.
     */

    public void setExternalFiltering(ExternalFilteringConfiguration externalFiltering) {
        this.externalFiltering = externalFiltering;
    }

    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to to
     * access data managed by Lake Formation.
     * </p>
     * 
     * @return A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to
     *         to access data managed by Lake Formation.
     */

    public ExternalFilteringConfiguration getExternalFiltering() {
        return this.externalFiltering;
    }

    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to to
     * access data managed by Lake Formation.
     * </p>
     * 
     * @param externalFiltering
     *        A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to
     *        to access data managed by Lake Formation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLakeFormationIdentityCenterConfigurationRequest withExternalFiltering(ExternalFilteringConfiguration externalFiltering) {
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

        if (obj instanceof CreateLakeFormationIdentityCenterConfigurationRequest == false)
            return false;
        CreateLakeFormationIdentityCenterConfigurationRequest other = (CreateLakeFormationIdentityCenterConfigurationRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
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
        hashCode = prime * hashCode + ((getExternalFiltering() == null) ? 0 : getExternalFiltering().hashCode());
        return hashCode;
    }

    @Override
    public CreateLakeFormationIdentityCenterConfigurationRequest clone() {
        return (CreateLakeFormationIdentityCenterConfigurationRequest) super.clone();
    }

}
