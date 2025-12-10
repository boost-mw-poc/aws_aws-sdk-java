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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AlarmHistoryItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AlarmHistoryItemMarshaller {

    private static final MarshallingInfo<String> ALARMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmName").build();
    private static final MarshallingInfo<String> ALARMCONTRIBUTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlarmContributorId").build();
    private static final MarshallingInfo<String> ALARMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmType").build();
    private static final MarshallingInfo<java.util.Date> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Timestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> HISTORYITEMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HistoryItemType").build();
    private static final MarshallingInfo<String> HISTORYSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HistorySummary").build();
    private static final MarshallingInfo<String> HISTORYDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HistoryData").build();
    private static final MarshallingInfo<Map> ALARMCONTRIBUTORATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlarmContributorAttributes").build();

    private static final AlarmHistoryItemMarshaller instance = new AlarmHistoryItemMarshaller();

    public static AlarmHistoryItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AlarmHistoryItem alarmHistoryItem, ProtocolMarshaller protocolMarshaller) {

        if (alarmHistoryItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(alarmHistoryItem.getAlarmName(), ALARMNAME_BINDING);
            protocolMarshaller.marshall(alarmHistoryItem.getAlarmContributorId(), ALARMCONTRIBUTORID_BINDING);
            protocolMarshaller.marshall(alarmHistoryItem.getAlarmType(), ALARMTYPE_BINDING);
            protocolMarshaller.marshall(alarmHistoryItem.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(alarmHistoryItem.getHistoryItemType(), HISTORYITEMTYPE_BINDING);
            protocolMarshaller.marshall(alarmHistoryItem.getHistorySummary(), HISTORYSUMMARY_BINDING);
            protocolMarshaller.marshall(alarmHistoryItem.getHistoryData(), HISTORYDATA_BINDING);
            protocolMarshaller.marshall(alarmHistoryItem.getAlarmContributorAttributes(), ALARMCONTRIBUTORATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
