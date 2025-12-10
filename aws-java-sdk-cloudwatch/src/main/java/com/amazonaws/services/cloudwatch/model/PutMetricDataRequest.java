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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutMetricData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMetricDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace for the metric data. You can use ASCII characters for the namespace, except for control characters
     * which are not supported.
     * </p>
     * <p>
     * To avoid conflicts with Amazon Web Services service namespaces, you should not specify a namespace that begins
     * with <code>AWS/</code>
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The data for the metrics. Use this parameter if your metrics do not contain associated entities. The array can
     * include no more than 1000 metrics per call.
     * </p>
     * <p>
     * The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and <code>MetricData</code>
     * metrics.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricDatum> metricData;
    /**
     * <p>
     * Data for metrics that contain associated entity information. You can include up to two
     * <code>EntityMetricData</code> objects, each of which can contain a single <code>Entity</code> and associated
     * metrics.
     * </p>
     * <p>
     * The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and <code>MetricData</code>
     * metrics.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EntityMetricData> entityMetricData;
    /**
     * <p>
     * Whether to accept valid metric data when an invalid entity is sent.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When set to <code>true</code>: Any validation error (for entity or metric data) will fail the entire request, and
     * no data will be ingested. The failed operation will return a 400 result with the error.
     * </p>
     * </li>
     * <li>
     * <p>
     * When set to <code>false</code>: Validation errors in the entity will not associate the metric with the entity,
     * but the metric data will still be accepted and ingested. Validation errors in the metric data will fail the
     * entire request, and no data will be ingested.
     * </p>
     * <p>
     * In the case of an invalid entity, the operation will return a <code>200</code> status, but an additional response
     * header will contain information about the validation errors. The new header, <code>X-Amzn-Failure-Message</code>
     * is an enumeration of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InvalidEntity</code> - The provided entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidKeyAttributes</code> - The provided <code>KeyAttributes</code> of an entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidAttributes</code> - The provided <code>Attributes</code> of an entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidTypeValue</code> - The provided <code>Type</code> in the <code>KeyAttributes</code> of an entity is
     * invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntitySizeTooLarge</code> - The number of <code>EntityMetricData</code> objects allowed is 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MissingRequiredFields</code> - There are missing required fields in the <code>KeyAttributes</code> for the
     * provided <code>Type</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details of the requirements for specifying an entity, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is <i>required</i> when <code>EntityMetricData</code> is included.
     * </p>
     */
    private Boolean strictEntityValidation;

    /**
     * <p>
     * The namespace for the metric data. You can use ASCII characters for the namespace, except for control characters
     * which are not supported.
     * </p>
     * <p>
     * To avoid conflicts with Amazon Web Services service namespaces, you should not specify a namespace that begins
     * with <code>AWS/</code>
     * </p>
     * 
     * @param namespace
     *        The namespace for the metric data. You can use ASCII characters for the namespace, except for control
     *        characters which are not supported.</p>
     *        <p>
     *        To avoid conflicts with Amazon Web Services service namespaces, you should not specify a namespace that
     *        begins with <code>AWS/</code>
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace for the metric data. You can use ASCII characters for the namespace, except for control characters
     * which are not supported.
     * </p>
     * <p>
     * To avoid conflicts with Amazon Web Services service namespaces, you should not specify a namespace that begins
     * with <code>AWS/</code>
     * </p>
     * 
     * @return The namespace for the metric data. You can use ASCII characters for the namespace, except for control
     *         characters which are not supported.</p>
     *         <p>
     *         To avoid conflicts with Amazon Web Services service namespaces, you should not specify a namespace that
     *         begins with <code>AWS/</code>
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace for the metric data. You can use ASCII characters for the namespace, except for control characters
     * which are not supported.
     * </p>
     * <p>
     * To avoid conflicts with Amazon Web Services service namespaces, you should not specify a namespace that begins
     * with <code>AWS/</code>
     * </p>
     * 
     * @param namespace
     *        The namespace for the metric data. You can use ASCII characters for the namespace, except for control
     *        characters which are not supported.</p>
     *        <p>
     *        To avoid conflicts with Amazon Web Services service namespaces, you should not specify a namespace that
     *        begins with <code>AWS/</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricDataRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The data for the metrics. Use this parameter if your metrics do not contain associated entities. The array can
     * include no more than 1000 metrics per call.
     * </p>
     * <p>
     * The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and <code>MetricData</code>
     * metrics.
     * </p>
     * 
     * @return The data for the metrics. Use this parameter if your metrics do not contain associated entities. The
     *         array can include no more than 1000 metrics per call.</p>
     *         <p>
     *         The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and
     *         <code>MetricData</code> metrics.
     */

    public java.util.List<MetricDatum> getMetricData() {
        if (metricData == null) {
            metricData = new com.amazonaws.internal.SdkInternalList<MetricDatum>();
        }
        return metricData;
    }

    /**
     * <p>
     * The data for the metrics. Use this parameter if your metrics do not contain associated entities. The array can
     * include no more than 1000 metrics per call.
     * </p>
     * <p>
     * The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and <code>MetricData</code>
     * metrics.
     * </p>
     * 
     * @param metricData
     *        The data for the metrics. Use this parameter if your metrics do not contain associated entities. The array
     *        can include no more than 1000 metrics per call.</p>
     *        <p>
     *        The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and
     *        <code>MetricData</code> metrics.
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
     * The data for the metrics. Use this parameter if your metrics do not contain associated entities. The array can
     * include no more than 1000 metrics per call.
     * </p>
     * <p>
     * The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and <code>MetricData</code>
     * metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricData(java.util.Collection)} or {@link #withMetricData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricData
     *        The data for the metrics. Use this parameter if your metrics do not contain associated entities. The array
     *        can include no more than 1000 metrics per call.</p>
     *        <p>
     *        The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and
     *        <code>MetricData</code> metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricDataRequest withMetricData(MetricDatum... metricData) {
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
     * The data for the metrics. Use this parameter if your metrics do not contain associated entities. The array can
     * include no more than 1000 metrics per call.
     * </p>
     * <p>
     * The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and <code>MetricData</code>
     * metrics.
     * </p>
     * 
     * @param metricData
     *        The data for the metrics. Use this parameter if your metrics do not contain associated entities. The array
     *        can include no more than 1000 metrics per call.</p>
     *        <p>
     *        The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and
     *        <code>MetricData</code> metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricDataRequest withMetricData(java.util.Collection<MetricDatum> metricData) {
        setMetricData(metricData);
        return this;
    }

    /**
     * <p>
     * Data for metrics that contain associated entity information. You can include up to two
     * <code>EntityMetricData</code> objects, each of which can contain a single <code>Entity</code> and associated
     * metrics.
     * </p>
     * <p>
     * The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and <code>MetricData</code>
     * metrics.
     * </p>
     * 
     * @return Data for metrics that contain associated entity information. You can include up to two
     *         <code>EntityMetricData</code> objects, each of which can contain a single <code>Entity</code> and
     *         associated metrics.</p>
     *         <p>
     *         The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and
     *         <code>MetricData</code> metrics.
     */

    public java.util.List<EntityMetricData> getEntityMetricData() {
        if (entityMetricData == null) {
            entityMetricData = new com.amazonaws.internal.SdkInternalList<EntityMetricData>();
        }
        return entityMetricData;
    }

    /**
     * <p>
     * Data for metrics that contain associated entity information. You can include up to two
     * <code>EntityMetricData</code> objects, each of which can contain a single <code>Entity</code> and associated
     * metrics.
     * </p>
     * <p>
     * The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and <code>MetricData</code>
     * metrics.
     * </p>
     * 
     * @param entityMetricData
     *        Data for metrics that contain associated entity information. You can include up to two
     *        <code>EntityMetricData</code> objects, each of which can contain a single <code>Entity</code> and
     *        associated metrics.</p>
     *        <p>
     *        The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and
     *        <code>MetricData</code> metrics.
     */

    public void setEntityMetricData(java.util.Collection<EntityMetricData> entityMetricData) {
        if (entityMetricData == null) {
            this.entityMetricData = null;
            return;
        }

        this.entityMetricData = new com.amazonaws.internal.SdkInternalList<EntityMetricData>(entityMetricData);
    }

    /**
     * <p>
     * Data for metrics that contain associated entity information. You can include up to two
     * <code>EntityMetricData</code> objects, each of which can contain a single <code>Entity</code> and associated
     * metrics.
     * </p>
     * <p>
     * The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and <code>MetricData</code>
     * metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityMetricData(java.util.Collection)} or {@link #withEntityMetricData(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param entityMetricData
     *        Data for metrics that contain associated entity information. You can include up to two
     *        <code>EntityMetricData</code> objects, each of which can contain a single <code>Entity</code> and
     *        associated metrics.</p>
     *        <p>
     *        The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and
     *        <code>MetricData</code> metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricDataRequest withEntityMetricData(EntityMetricData... entityMetricData) {
        if (this.entityMetricData == null) {
            setEntityMetricData(new com.amazonaws.internal.SdkInternalList<EntityMetricData>(entityMetricData.length));
        }
        for (EntityMetricData ele : entityMetricData) {
            this.entityMetricData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Data for metrics that contain associated entity information. You can include up to two
     * <code>EntityMetricData</code> objects, each of which can contain a single <code>Entity</code> and associated
     * metrics.
     * </p>
     * <p>
     * The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and <code>MetricData</code>
     * metrics.
     * </p>
     * 
     * @param entityMetricData
     *        Data for metrics that contain associated entity information. You can include up to two
     *        <code>EntityMetricData</code> objects, each of which can contain a single <code>Entity</code> and
     *        associated metrics.</p>
     *        <p>
     *        The limit of metrics allowed, 1000, is the sum of both <code>EntityMetricData</code> and
     *        <code>MetricData</code> metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricDataRequest withEntityMetricData(java.util.Collection<EntityMetricData> entityMetricData) {
        setEntityMetricData(entityMetricData);
        return this;
    }

    /**
     * <p>
     * Whether to accept valid metric data when an invalid entity is sent.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When set to <code>true</code>: Any validation error (for entity or metric data) will fail the entire request, and
     * no data will be ingested. The failed operation will return a 400 result with the error.
     * </p>
     * </li>
     * <li>
     * <p>
     * When set to <code>false</code>: Validation errors in the entity will not associate the metric with the entity,
     * but the metric data will still be accepted and ingested. Validation errors in the metric data will fail the
     * entire request, and no data will be ingested.
     * </p>
     * <p>
     * In the case of an invalid entity, the operation will return a <code>200</code> status, but an additional response
     * header will contain information about the validation errors. The new header, <code>X-Amzn-Failure-Message</code>
     * is an enumeration of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InvalidEntity</code> - The provided entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidKeyAttributes</code> - The provided <code>KeyAttributes</code> of an entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidAttributes</code> - The provided <code>Attributes</code> of an entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidTypeValue</code> - The provided <code>Type</code> in the <code>KeyAttributes</code> of an entity is
     * invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntitySizeTooLarge</code> - The number of <code>EntityMetricData</code> objects allowed is 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MissingRequiredFields</code> - There are missing required fields in the <code>KeyAttributes</code> for the
     * provided <code>Type</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details of the requirements for specifying an entity, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is <i>required</i> when <code>EntityMetricData</code> is included.
     * </p>
     * 
     * @param strictEntityValidation
     *        Whether to accept valid metric data when an invalid entity is sent.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        When set to <code>true</code>: Any validation error (for entity or metric data) will fail the entire
     *        request, and no data will be ingested. The failed operation will return a 400 result with the error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When set to <code>false</code>: Validation errors in the entity will not associate the metric with the
     *        entity, but the metric data will still be accepted and ingested. Validation errors in the metric data will
     *        fail the entire request, and no data will be ingested.
     *        </p>
     *        <p>
     *        In the case of an invalid entity, the operation will return a <code>200</code> status, but an additional
     *        response header will contain information about the validation errors. The new header,
     *        <code>X-Amzn-Failure-Message</code> is an enumeration of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InvalidEntity</code> - The provided entity is invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidKeyAttributes</code> - The provided <code>KeyAttributes</code> of an entity is invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidAttributes</code> - The provided <code>Attributes</code> of an entity is invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidTypeValue</code> - The provided <code>Type</code> in the <code>KeyAttributes</code> of an
     *        entity is invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EntitySizeTooLarge</code> - The number of <code>EntityMetricData</code> objects allowed is 2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MissingRequiredFields</code> - There are missing required fields in the <code>KeyAttributes</code>
     *        for the provided <code>Type</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For details of the requirements for specifying an entity, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html"
     *        >How to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This parameter is <i>required</i> when <code>EntityMetricData</code> is included.
     */

    public void setStrictEntityValidation(Boolean strictEntityValidation) {
        this.strictEntityValidation = strictEntityValidation;
    }

    /**
     * <p>
     * Whether to accept valid metric data when an invalid entity is sent.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When set to <code>true</code>: Any validation error (for entity or metric data) will fail the entire request, and
     * no data will be ingested. The failed operation will return a 400 result with the error.
     * </p>
     * </li>
     * <li>
     * <p>
     * When set to <code>false</code>: Validation errors in the entity will not associate the metric with the entity,
     * but the metric data will still be accepted and ingested. Validation errors in the metric data will fail the
     * entire request, and no data will be ingested.
     * </p>
     * <p>
     * In the case of an invalid entity, the operation will return a <code>200</code> status, but an additional response
     * header will contain information about the validation errors. The new header, <code>X-Amzn-Failure-Message</code>
     * is an enumeration of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InvalidEntity</code> - The provided entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidKeyAttributes</code> - The provided <code>KeyAttributes</code> of an entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidAttributes</code> - The provided <code>Attributes</code> of an entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidTypeValue</code> - The provided <code>Type</code> in the <code>KeyAttributes</code> of an entity is
     * invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntitySizeTooLarge</code> - The number of <code>EntityMetricData</code> objects allowed is 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MissingRequiredFields</code> - There are missing required fields in the <code>KeyAttributes</code> for the
     * provided <code>Type</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details of the requirements for specifying an entity, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is <i>required</i> when <code>EntityMetricData</code> is included.
     * </p>
     * 
     * @return Whether to accept valid metric data when an invalid entity is sent.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         When set to <code>true</code>: Any validation error (for entity or metric data) will fail the entire
     *         request, and no data will be ingested. The failed operation will return a 400 result with the error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When set to <code>false</code>: Validation errors in the entity will not associate the metric with the
     *         entity, but the metric data will still be accepted and ingested. Validation errors in the metric data
     *         will fail the entire request, and no data will be ingested.
     *         </p>
     *         <p>
     *         In the case of an invalid entity, the operation will return a <code>200</code> status, but an additional
     *         response header will contain information about the validation errors. The new header,
     *         <code>X-Amzn-Failure-Message</code> is an enumeration of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>InvalidEntity</code> - The provided entity is invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InvalidKeyAttributes</code> - The provided <code>KeyAttributes</code> of an entity is invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InvalidAttributes</code> - The provided <code>Attributes</code> of an entity is invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InvalidTypeValue</code> - The provided <code>Type</code> in the <code>KeyAttributes</code> of an
     *         entity is invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EntitySizeTooLarge</code> - The number of <code>EntityMetricData</code> objects allowed is 2.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MissingRequiredFields</code> - There are missing required fields in the <code>KeyAttributes</code>
     *         for the provided <code>Type</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For details of the requirements for specifying an entity, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html"
     *         >How to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This parameter is <i>required</i> when <code>EntityMetricData</code> is included.
     */

    public Boolean getStrictEntityValidation() {
        return this.strictEntityValidation;
    }

    /**
     * <p>
     * Whether to accept valid metric data when an invalid entity is sent.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When set to <code>true</code>: Any validation error (for entity or metric data) will fail the entire request, and
     * no data will be ingested. The failed operation will return a 400 result with the error.
     * </p>
     * </li>
     * <li>
     * <p>
     * When set to <code>false</code>: Validation errors in the entity will not associate the metric with the entity,
     * but the metric data will still be accepted and ingested. Validation errors in the metric data will fail the
     * entire request, and no data will be ingested.
     * </p>
     * <p>
     * In the case of an invalid entity, the operation will return a <code>200</code> status, but an additional response
     * header will contain information about the validation errors. The new header, <code>X-Amzn-Failure-Message</code>
     * is an enumeration of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InvalidEntity</code> - The provided entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidKeyAttributes</code> - The provided <code>KeyAttributes</code> of an entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidAttributes</code> - The provided <code>Attributes</code> of an entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidTypeValue</code> - The provided <code>Type</code> in the <code>KeyAttributes</code> of an entity is
     * invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntitySizeTooLarge</code> - The number of <code>EntityMetricData</code> objects allowed is 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MissingRequiredFields</code> - There are missing required fields in the <code>KeyAttributes</code> for the
     * provided <code>Type</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details of the requirements for specifying an entity, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is <i>required</i> when <code>EntityMetricData</code> is included.
     * </p>
     * 
     * @param strictEntityValidation
     *        Whether to accept valid metric data when an invalid entity is sent.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        When set to <code>true</code>: Any validation error (for entity or metric data) will fail the entire
     *        request, and no data will be ingested. The failed operation will return a 400 result with the error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When set to <code>false</code>: Validation errors in the entity will not associate the metric with the
     *        entity, but the metric data will still be accepted and ingested. Validation errors in the metric data will
     *        fail the entire request, and no data will be ingested.
     *        </p>
     *        <p>
     *        In the case of an invalid entity, the operation will return a <code>200</code> status, but an additional
     *        response header will contain information about the validation errors. The new header,
     *        <code>X-Amzn-Failure-Message</code> is an enumeration of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InvalidEntity</code> - The provided entity is invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidKeyAttributes</code> - The provided <code>KeyAttributes</code> of an entity is invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidAttributes</code> - The provided <code>Attributes</code> of an entity is invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidTypeValue</code> - The provided <code>Type</code> in the <code>KeyAttributes</code> of an
     *        entity is invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EntitySizeTooLarge</code> - The number of <code>EntityMetricData</code> objects allowed is 2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MissingRequiredFields</code> - There are missing required fields in the <code>KeyAttributes</code>
     *        for the provided <code>Type</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For details of the requirements for specifying an entity, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html"
     *        >How to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This parameter is <i>required</i> when <code>EntityMetricData</code> is included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricDataRequest withStrictEntityValidation(Boolean strictEntityValidation) {
        setStrictEntityValidation(strictEntityValidation);
        return this;
    }

    /**
     * <p>
     * Whether to accept valid metric data when an invalid entity is sent.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When set to <code>true</code>: Any validation error (for entity or metric data) will fail the entire request, and
     * no data will be ingested. The failed operation will return a 400 result with the error.
     * </p>
     * </li>
     * <li>
     * <p>
     * When set to <code>false</code>: Validation errors in the entity will not associate the metric with the entity,
     * but the metric data will still be accepted and ingested. Validation errors in the metric data will fail the
     * entire request, and no data will be ingested.
     * </p>
     * <p>
     * In the case of an invalid entity, the operation will return a <code>200</code> status, but an additional response
     * header will contain information about the validation errors. The new header, <code>X-Amzn-Failure-Message</code>
     * is an enumeration of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InvalidEntity</code> - The provided entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidKeyAttributes</code> - The provided <code>KeyAttributes</code> of an entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidAttributes</code> - The provided <code>Attributes</code> of an entity is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidTypeValue</code> - The provided <code>Type</code> in the <code>KeyAttributes</code> of an entity is
     * invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntitySizeTooLarge</code> - The number of <code>EntityMetricData</code> objects allowed is 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MissingRequiredFields</code> - There are missing required fields in the <code>KeyAttributes</code> for the
     * provided <code>Type</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details of the requirements for specifying an entity, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is <i>required</i> when <code>EntityMetricData</code> is included.
     * </p>
     * 
     * @return Whether to accept valid metric data when an invalid entity is sent.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         When set to <code>true</code>: Any validation error (for entity or metric data) will fail the entire
     *         request, and no data will be ingested. The failed operation will return a 400 result with the error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When set to <code>false</code>: Validation errors in the entity will not associate the metric with the
     *         entity, but the metric data will still be accepted and ingested. Validation errors in the metric data
     *         will fail the entire request, and no data will be ingested.
     *         </p>
     *         <p>
     *         In the case of an invalid entity, the operation will return a <code>200</code> status, but an additional
     *         response header will contain information about the validation errors. The new header,
     *         <code>X-Amzn-Failure-Message</code> is an enumeration of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>InvalidEntity</code> - The provided entity is invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InvalidKeyAttributes</code> - The provided <code>KeyAttributes</code> of an entity is invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InvalidAttributes</code> - The provided <code>Attributes</code> of an entity is invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InvalidTypeValue</code> - The provided <code>Type</code> in the <code>KeyAttributes</code> of an
     *         entity is invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EntitySizeTooLarge</code> - The number of <code>EntityMetricData</code> objects allowed is 2.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MissingRequiredFields</code> - There are missing required fields in the <code>KeyAttributes</code>
     *         for the provided <code>Type</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For details of the requirements for specifying an entity, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html"
     *         >How to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This parameter is <i>required</i> when <code>EntityMetricData</code> is included.
     */

    public Boolean isStrictEntityValidation() {
        return this.strictEntityValidation;
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getMetricData() != null)
            sb.append("MetricData: ").append(getMetricData()).append(",");
        if (getEntityMetricData() != null)
            sb.append("EntityMetricData: ").append(getEntityMetricData()).append(",");
        if (getStrictEntityValidation() != null)
            sb.append("StrictEntityValidation: ").append(getStrictEntityValidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMetricDataRequest == false)
            return false;
        PutMetricDataRequest other = (PutMetricDataRequest) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getMetricData() == null ^ this.getMetricData() == null)
            return false;
        if (other.getMetricData() != null && other.getMetricData().equals(this.getMetricData()) == false)
            return false;
        if (other.getEntityMetricData() == null ^ this.getEntityMetricData() == null)
            return false;
        if (other.getEntityMetricData() != null && other.getEntityMetricData().equals(this.getEntityMetricData()) == false)
            return false;
        if (other.getStrictEntityValidation() == null ^ this.getStrictEntityValidation() == null)
            return false;
        if (other.getStrictEntityValidation() != null && other.getStrictEntityValidation().equals(this.getStrictEntityValidation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricData() == null) ? 0 : getMetricData().hashCode());
        hashCode = prime * hashCode + ((getEntityMetricData() == null) ? 0 : getEntityMetricData().hashCode());
        hashCode = prime * hashCode + ((getStrictEntityValidation() == null) ? 0 : getStrictEntityValidation().hashCode());
        return hashCode;
    }

    @Override
    public PutMetricDataRequest clone() {
        return (PutMetricDataRequest) super.clone();
    }

}
