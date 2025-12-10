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
 * PutCompositeAlarmRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutCompositeAlarmRequestMarshaller {

    private static final MarshallingInfo<Boolean> ACTIONSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsEnabled").build();
    private static final MarshallingInfo<List> ALARMACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmActions").build();
    private static final MarshallingInfo<String> ALARMDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlarmDescription").build();
    private static final MarshallingInfo<String> ALARMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmName").build();
    private static final MarshallingInfo<String> ALARMRULE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmRule").build();
    private static final MarshallingInfo<List> INSUFFICIENTDATAACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InsufficientDataActions").build();
    private static final MarshallingInfo<List> OKACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OKActions").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> ACTIONSSUPPRESSOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsSuppressor").build();
    private static final MarshallingInfo<Integer> ACTIONSSUPPRESSORWAITPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsSuppressorWaitPeriod").build();
    private static final MarshallingInfo<Integer> ACTIONSSUPPRESSOREXTENSIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsSuppressorExtensionPeriod").build();

    private static final PutCompositeAlarmRequestMarshaller instance = new PutCompositeAlarmRequestMarshaller();

    public static PutCompositeAlarmRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutCompositeAlarmRequest putCompositeAlarmRequest, ProtocolMarshaller protocolMarshaller) {

        if (putCompositeAlarmRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putCompositeAlarmRequest.getActionsEnabled(), ACTIONSENABLED_BINDING);
            if (putCompositeAlarmRequest.getAlarmActions() != null && !putCompositeAlarmRequest.getAlarmActions().isEmpty()) {
                protocolMarshaller.marshall(putCompositeAlarmRequest.getAlarmActions(), ALARMACTIONS_BINDING);
            }
            protocolMarshaller.marshall(putCompositeAlarmRequest.getAlarmDescription(), ALARMDESCRIPTION_BINDING);
            protocolMarshaller.marshall(putCompositeAlarmRequest.getAlarmName(), ALARMNAME_BINDING);
            protocolMarshaller.marshall(putCompositeAlarmRequest.getAlarmRule(), ALARMRULE_BINDING);
            if (putCompositeAlarmRequest.getInsufficientDataActions() != null && !putCompositeAlarmRequest.getInsufficientDataActions().isEmpty()) {
                protocolMarshaller.marshall(putCompositeAlarmRequest.getInsufficientDataActions(), INSUFFICIENTDATAACTIONS_BINDING);
            }
            if (putCompositeAlarmRequest.getOKActions() != null && !putCompositeAlarmRequest.getOKActions().isEmpty()) {
                protocolMarshaller.marshall(putCompositeAlarmRequest.getOKActions(), OKACTIONS_BINDING);
            }
            if (putCompositeAlarmRequest.getTags() != null && !putCompositeAlarmRequest.getTags().isEmpty()) {
                protocolMarshaller.marshall(putCompositeAlarmRequest.getTags(), TAGS_BINDING);
            }
            protocolMarshaller.marshall(putCompositeAlarmRequest.getActionsSuppressor(), ACTIONSSUPPRESSOR_BINDING);
            protocolMarshaller.marshall(putCompositeAlarmRequest.getActionsSuppressorWaitPeriod(), ACTIONSSUPPRESSORWAITPERIOD_BINDING);
            protocolMarshaller.marshall(putCompositeAlarmRequest.getActionsSuppressorExtensionPeriod(), ACTIONSSUPPRESSOREXTENSIONPERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
