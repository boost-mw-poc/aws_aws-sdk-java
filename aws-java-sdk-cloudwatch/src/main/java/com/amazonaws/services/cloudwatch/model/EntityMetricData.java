/*
 * Copyright 2020-2025 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of metrics that are associated with an entity, such as a specific service or resource. Contains the entity and
 * the list of metric data associated with it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/EntityMetricData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityMetricData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The entity associated with the metrics.
     * </p>
     */
    private Entity entity;
    /**
     * <p>
     * The metric data.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricDatum> metricData;

    /**
     * <p>
     * The entity associated with the metrics.
     * </p>
     * 
     * @param entity
     *        The entity associated with the metrics.
     */

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * <p>
     * The entity associated with the metrics.
     * </p>
     * 
     * @return The entity associated with the metrics.
     */

    public Entity getEntity() {
        return this.entity;
    }

    /**
     * <p>
     * The entity associated with the metrics.
     * </p>
     * 
     * @param entity
     *        The entity associated with the metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityMetricData withEntity(Entity entity) {
        setEntity(entity);
        return this;
    }

    /**
     * <p>
     * The metric data.
     * </p>
     * 
     * @return The metric data.
     */

    public java.util.List<MetricDatum> getMetricData() {
        if (metricData == null) {
            metricData = new com.amazonaws.internal.SdkInternalList<MetricDatum>();
        }
        return metricData;
    }

    /**
     * <p>
     * The metric data.
     * </p>
     * 
     * @param metricData
     *        The metric data.
     */

    public void setMetricData(java.util.Collection<MetricDatum> metricData) {
        if (metricData == null) {
            this.metricData = null;
            return;
        }

        this.metricData = new com.amazonaws.internal.SdkInternalList<MetricDatum>(metricData);
    }

    /**
     * <p>
     * The metric data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricData(java.util.Collection)} or {@link #withMetricData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricData
     *        The metric data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityMetricData withMetricData(MetricDatum... metricData) {
        if (this.metricData == null) {
            setMetricData(new com.amazonaws.internal.SdkInternalList<MetricDatum>(metricData.length));
        }
        for (MetricDatum ele : metricData) {
            this.metricData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metric data.
     * </p>
     * 
     * @param metricData
     *        The metric data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityMetricData withMetricData(java.util.Collection<MetricDatum> metricData) {
        setMetricData(metricData);
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
        if (getEntity() != null)
            sb.append("Entity: ").append(getEntity()).append(",");
        if (getMetricData() != null)
            sb.append("MetricData: ").append(getMetricData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityMetricData == false)
            return false;
        EntityMetricData other = (EntityMetricData) obj;
        if (other.getEntity() == null ^ this.getEntity() == null)
            return false;
        if (other.getEntity() != null && other.getEntity().equals(this.getEntity()) == false)
            return false;
        if (other.getMetricData() == null ^ this.getMetricData() == null)
            return false;
        if (other.getMetricData() != null && other.getMetricData().equals(this.getMetricData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntity() == null) ? 0 : getEntity().hashCode());
        hashCode = prime * hashCode + ((getMetricData() == null) ? 0 : getMetricData().hashCode());
        return hashCode;
    }

    @Override
    public EntityMetricData clone() {
        try {
            return (EntityMetricData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatch.model.transform.EntityMetricDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
