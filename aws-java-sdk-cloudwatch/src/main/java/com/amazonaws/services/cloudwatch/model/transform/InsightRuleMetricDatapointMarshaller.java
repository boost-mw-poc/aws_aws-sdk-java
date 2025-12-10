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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InsightRuleMetricDatapointMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InsightRuleMetricDatapointMarshaller {

    private static final MarshallingInfo<java.util.Date> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Timestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Double> UNIQUECONTRIBUTORS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UniqueContributors").build();
    private static final MarshallingInfo<Double> MAXCONTRIBUTORVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxContributorValue").build();
    private static final MarshallingInfo<Double> SAMPLECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleCount").build();
    private static final MarshallingInfo<Double> AVERAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Average").build();
    private static final MarshallingInfo<Double> SUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sum").build();
    private static final MarshallingInfo<Double> MINIMUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Minimum").build();
    private static final MarshallingInfo<Double> MAXIMUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Maximum").build();

    private static final InsightRuleMetricDatapointMarshaller instance = new InsightRuleMetricDatapointMarshaller();

    public static InsightRuleMetricDatapointMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InsightRuleMetricDatapoint insightRuleMetricDatapoint, ProtocolMarshaller protocolMarshaller) {

        if (insightRuleMetricDatapoint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(insightRuleMetricDatapoint.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(insightRuleMetricDatapoint.getUniqueContributors(), UNIQUECONTRIBUTORS_BINDING);
            protocolMarshaller.marshall(insightRuleMetricDatapoint.getMaxContributorValue(), MAXCONTRIBUTORVALUE_BINDING);
            protocolMarshaller.marshall(insightRuleMetricDatapoint.getSampleCount(), SAMPLECOUNT_BINDING);
            protocolMarshaller.marshall(insightRuleMetricDatapoint.getAverage(), AVERAGE_BINDING);
            protocolMarshaller.marshall(insightRuleMetricDatapoint.getSum(), SUM_BINDING);
            protocolMarshaller.marshall(insightRuleMetricDatapoint.getMinimum(), MINIMUM_BINDING);
            protocolMarshaller.marshall(insightRuleMetricDatapoint.getMaximum(), MAXIMUM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
