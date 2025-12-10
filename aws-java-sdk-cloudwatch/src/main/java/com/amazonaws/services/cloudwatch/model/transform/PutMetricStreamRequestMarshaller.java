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
 * PutMetricStreamRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutMetricStreamRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> INCLUDEFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeFilters").build();
    private static final MarshallingInfo<List> EXCLUDEFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeFilters").build();
    private static final MarshallingInfo<String> FIREHOSEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirehoseArn").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> OUTPUTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputFormat").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<List> STATISTICSCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatisticsConfigurations").build();
    private static final MarshallingInfo<Boolean> INCLUDELINKEDACCOUNTSMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeLinkedAccountsMetrics").build();

    private static final PutMetricStreamRequestMarshaller instance = new PutMetricStreamRequestMarshaller();

    public static PutMetricStreamRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutMetricStreamRequest putMetricStreamRequest, ProtocolMarshaller protocolMarshaller) {

        if (putMetricStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putMetricStreamRequest.getName(), NAME_BINDING);
            if (putMetricStreamRequest.getIncludeFilters() != null && !putMetricStreamRequest.getIncludeFilters().isEmpty()) {
                protocolMarshaller.marshall(putMetricStreamRequest.getIncludeFilters(), INCLUDEFILTERS_BINDING);
            }
            if (putMetricStreamRequest.getExcludeFilters() != null && !putMetricStreamRequest.getExcludeFilters().isEmpty()) {
                protocolMarshaller.marshall(putMetricStreamRequest.getExcludeFilters(), EXCLUDEFILTERS_BINDING);
            }
            protocolMarshaller.marshall(putMetricStreamRequest.getFirehoseArn(), FIREHOSEARN_BINDING);
            protocolMarshaller.marshall(putMetricStreamRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(putMetricStreamRequest.getOutputFormat(), OUTPUTFORMAT_BINDING);
            if (putMetricStreamRequest.getTags() != null && !putMetricStreamRequest.getTags().isEmpty()) {
                protocolMarshaller.marshall(putMetricStreamRequest.getTags(), TAGS_BINDING);
            }
            if (putMetricStreamRequest.getStatisticsConfigurations() != null && !putMetricStreamRequest.getStatisticsConfigurations().isEmpty()) {
                protocolMarshaller.marshall(putMetricStreamRequest.getStatisticsConfigurations(), STATISTICSCONFIGURATIONS_BINDING);
            }
            protocolMarshaller.marshall(putMetricStreamRequest.getIncludeLinkedAccountsMetrics(), INCLUDELINKEDACCOUNTSMETRICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
