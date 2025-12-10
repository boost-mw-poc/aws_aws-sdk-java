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
 * GetMetricDataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetMetricDataRequestMarshaller {

    private static final MarshallingInfo<List> METRICDATAQUERIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricDataQueries").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<String> SCANBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ScanBy").build();
    private static final MarshallingInfo<Integer> MAXDATAPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxDatapoints").build();
    private static final MarshallingInfo<StructuredPojo> LABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelOptions").build();

    private static final GetMetricDataRequestMarshaller instance = new GetMetricDataRequestMarshaller();

    public static GetMetricDataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetMetricDataRequest getMetricDataRequest, ProtocolMarshaller protocolMarshaller) {

        if (getMetricDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            if (getMetricDataRequest.getMetricDataQueries() != null && !getMetricDataRequest.getMetricDataQueries().isEmpty()) {
                protocolMarshaller.marshall(getMetricDataRequest.getMetricDataQueries(), METRICDATAQUERIES_BINDING);
            }
            protocolMarshaller.marshall(getMetricDataRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(getMetricDataRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(getMetricDataRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getMetricDataRequest.getScanBy(), SCANBY_BINDING);
            protocolMarshaller.marshall(getMetricDataRequest.getMaxDatapoints(), MAXDATAPOINTS_BINDING);
            protocolMarshaller.marshall(getMetricDataRequest.getLabelOptions(), LABELOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
