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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnomalyDetectorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnomalyDetectorMarshaller {

    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Namespace").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<List> DIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dimensions").build();
    private static final MarshallingInfo<String> STAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Stat").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Configuration").build();
    private static final MarshallingInfo<String> STATEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateValue").build();
    private static final MarshallingInfo<StructuredPojo> METRICCHARACTERISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricCharacteristics").build();
    private static final MarshallingInfo<StructuredPojo> SINGLEMETRICANOMALYDETECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SingleMetricAnomalyDetector").build();
    private static final MarshallingInfo<StructuredPojo> METRICMATHANOMALYDETECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricMathAnomalyDetector").build();

    private static final AnomalyDetectorMarshaller instance = new AnomalyDetectorMarshaller();

    public static AnomalyDetectorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnomalyDetector anomalyDetector, ProtocolMarshaller protocolMarshaller) {

        if (anomalyDetector == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(anomalyDetector.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getMetricName(), METRICNAME_BINDING);
            if (anomalyDetector.getDimensions() != null && !anomalyDetector.getDimensions().isEmpty()) {
                protocolMarshaller.marshall(anomalyDetector.getDimensions(), DIMENSIONS_BINDING);
            }
            protocolMarshaller.marshall(anomalyDetector.getStat(), STAT_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getStateValue(), STATEVALUE_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getMetricCharacteristics(), METRICCHARACTERISTICS_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getSingleMetricAnomalyDetector(), SINGLEMETRICANOMALYDETECTOR_BINDING);
            protocolMarshaller.marshall(anomalyDetector.getMetricMathAnomalyDetector(), METRICMATHANOMALYDETECTOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
