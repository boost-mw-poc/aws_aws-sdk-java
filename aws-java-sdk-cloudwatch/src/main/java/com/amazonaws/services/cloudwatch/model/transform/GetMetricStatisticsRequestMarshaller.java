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
 * GetMetricStatisticsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetMetricStatisticsRequestMarshaller {

    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Namespace").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<List> DIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dimensions").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Period").build();
    private static final MarshallingInfo<List> STATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Statistics").build();
    private static final MarshallingInfo<List> EXTENDEDSTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtendedStatistics").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Unit").build();

    private static final GetMetricStatisticsRequestMarshaller instance = new GetMetricStatisticsRequestMarshaller();

    public static GetMetricStatisticsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetMetricStatisticsRequest getMetricStatisticsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getMetricStatisticsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getMetricStatisticsRequest.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(getMetricStatisticsRequest.getMetricName(), METRICNAME_BINDING);
            if (getMetricStatisticsRequest.getDimensions() != null && !getMetricStatisticsRequest.getDimensions().isEmpty()) {
                protocolMarshaller.marshall(getMetricStatisticsRequest.getDimensions(), DIMENSIONS_BINDING);
            }
            protocolMarshaller.marshall(getMetricStatisticsRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(getMetricStatisticsRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(getMetricStatisticsRequest.getPeriod(), PERIOD_BINDING);
            if (getMetricStatisticsRequest.getStatistics() != null && !getMetricStatisticsRequest.getStatistics().isEmpty()) {
                protocolMarshaller.marshall(getMetricStatisticsRequest.getStatistics(), STATISTICS_BINDING);
            }
            if (getMetricStatisticsRequest.getExtendedStatistics() != null && !getMetricStatisticsRequest.getExtendedStatistics().isEmpty()) {
                protocolMarshaller.marshall(getMetricStatisticsRequest.getExtendedStatistics(), EXTENDEDSTATISTICS_BINDING);
            }
            protocolMarshaller.marshall(getMetricStatisticsRequest.getUnit(), UNIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
