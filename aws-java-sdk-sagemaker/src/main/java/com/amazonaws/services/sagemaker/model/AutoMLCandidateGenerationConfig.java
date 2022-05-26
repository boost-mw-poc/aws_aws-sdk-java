/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Stores the config information for how a candidate is generated (optional).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLCandidateGenerationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLCandidateGenerationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job (optional). This file should be in json format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * The key name <code>FeatureAttributeNames</code> is fixed. The values listed in <code>["col1", "col2", ...]</code>
     * is case sensitive and should be a list of strings containing unique values that are a subset of the column names
     * in the input data. The list of columns provided must not include the target column.
     * </p>
     */
    private String featureSpecificationS3Uri;

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job (optional). This file should be in json format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * The key name <code>FeatureAttributeNames</code> is fixed. The values listed in <code>["col1", "col2", ...]</code>
     * is case sensitive and should be a list of strings containing unique values that are a subset of the column names
     * in the input data. The list of columns provided must not include the target column.
     * </p>
     * 
     * @param featureSpecificationS3Uri
     *        A URL to the Amazon S3 data source containing selected features from the input data source to run an
     *        Autopilot job (optional). This file should be in json format as shown below: </p>
     *        <p>
     *        <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     *        </p>
     *        <p>
     *        The key name <code>FeatureAttributeNames</code> is fixed. The values listed in
     *        <code>["col1", "col2", ...]</code> is case sensitive and should be a list of strings containing unique
     *        values that are a subset of the column names in the input data. The list of columns provided must not
     *        include the target column.
     */

    public void setFeatureSpecificationS3Uri(String featureSpecificationS3Uri) {
        this.featureSpecificationS3Uri = featureSpecificationS3Uri;
    }

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job (optional). This file should be in json format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * The key name <code>FeatureAttributeNames</code> is fixed. The values listed in <code>["col1", "col2", ...]</code>
     * is case sensitive and should be a list of strings containing unique values that are a subset of the column names
     * in the input data. The list of columns provided must not include the target column.
     * </p>
     * 
     * @return A URL to the Amazon S3 data source containing selected features from the input data source to run an
     *         Autopilot job (optional). This file should be in json format as shown below: </p>
     *         <p>
     *         <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     *         </p>
     *         <p>
     *         The key name <code>FeatureAttributeNames</code> is fixed. The values listed in
     *         <code>["col1", "col2", ...]</code> is case sensitive and should be a list of strings containing unique
     *         values that are a subset of the column names in the input data. The list of columns provided must not
     *         include the target column.
     */

    public String getFeatureSpecificationS3Uri() {
        return this.featureSpecificationS3Uri;
    }

    /**
     * <p>
     * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot
     * job (optional). This file should be in json format as shown below:
     * </p>
     * <p>
     * <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     * </p>
     * <p>
     * The key name <code>FeatureAttributeNames</code> is fixed. The values listed in <code>["col1", "col2", ...]</code>
     * is case sensitive and should be a list of strings containing unique values that are a subset of the column names
     * in the input data. The list of columns provided must not include the target column.
     * </p>
     * 
     * @param featureSpecificationS3Uri
     *        A URL to the Amazon S3 data source containing selected features from the input data source to run an
     *        Autopilot job (optional). This file should be in json format as shown below: </p>
     *        <p>
     *        <code>{ "FeatureAttributeNames":["col1", "col2", ...] }</code>.
     *        </p>
     *        <p>
     *        The key name <code>FeatureAttributeNames</code> is fixed. The values listed in
     *        <code>["col1", "col2", ...]</code> is case sensitive and should be a list of strings containing unique
     *        values that are a subset of the column names in the input data. The list of columns provided must not
     *        include the target column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidateGenerationConfig withFeatureSpecificationS3Uri(String featureSpecificationS3Uri) {
        setFeatureSpecificationS3Uri(featureSpecificationS3Uri);
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
        if (getFeatureSpecificationS3Uri() != null)
            sb.append("FeatureSpecificationS3Uri: ").append(getFeatureSpecificationS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLCandidateGenerationConfig == false)
            return false;
        AutoMLCandidateGenerationConfig other = (AutoMLCandidateGenerationConfig) obj;
        if (other.getFeatureSpecificationS3Uri() == null ^ this.getFeatureSpecificationS3Uri() == null)
            return false;
        if (other.getFeatureSpecificationS3Uri() != null && other.getFeatureSpecificationS3Uri().equals(this.getFeatureSpecificationS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureSpecificationS3Uri() == null) ? 0 : getFeatureSpecificationS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLCandidateGenerationConfig clone() {
        try {
            return (AutoMLCandidateGenerationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLCandidateGenerationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
