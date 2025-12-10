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
 * DescribeAlarmHistoryRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeAlarmHistoryRequestMarshaller {

    private static final MarshallingInfo<String> ALARMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmName").build();
    private static final MarshallingInfo<String> ALARMCONTRIBUTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlarmContributorId").build();
    private static final MarshallingInfo<List> ALARMTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmTypes").build();
    private static final MarshallingInfo<String> HISTORYITEMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HistoryItemType").build();
    private static final MarshallingInfo<java.util.Date> STARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> MAXRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxRecords").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<String> SCANBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ScanBy").build();

    private static final DescribeAlarmHistoryRequestMarshaller instance = new DescribeAlarmHistoryRequestMarshaller();

    public static DescribeAlarmHistoryRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeAlarmHistoryRequest describeAlarmHistoryRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeAlarmHistoryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeAlarmHistoryRequest.getAlarmName(), ALARMNAME_BINDING);
            protocolMarshaller.marshall(describeAlarmHistoryRequest.getAlarmContributorId(), ALARMCONTRIBUTORID_BINDING);
            if (describeAlarmHistoryRequest.getAlarmTypes() != null && !describeAlarmHistoryRequest.getAlarmTypes().isEmpty()) {
                protocolMarshaller.marshall(describeAlarmHistoryRequest.getAlarmTypes(), ALARMTYPES_BINDING);
            }
            protocolMarshaller.marshall(describeAlarmHistoryRequest.getHistoryItemType(), HISTORYITEMTYPE_BINDING);
            protocolMarshaller.marshall(describeAlarmHistoryRequest.getStartDate(), STARTDATE_BINDING);
            protocolMarshaller.marshall(describeAlarmHistoryRequest.getEndDate(), ENDDATE_BINDING);
            protocolMarshaller.marshall(describeAlarmHistoryRequest.getMaxRecords(), MAXRECORDS_BINDING);
            protocolMarshaller.marshall(describeAlarmHistoryRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(describeAlarmHistoryRequest.getScanBy(), SCANBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
