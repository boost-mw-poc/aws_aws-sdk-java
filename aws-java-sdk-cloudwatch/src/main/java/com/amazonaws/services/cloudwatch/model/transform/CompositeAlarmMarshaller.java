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
 * CompositeAlarmMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CompositeAlarmMarshaller {

    private static final MarshallingInfo<Boolean> ACTIONSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsEnabled").build();
    private static final MarshallingInfo<List> ALARMACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmActions").build();
    private static final MarshallingInfo<String> ALARMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmArn").build();
    private static final MarshallingInfo<java.util.Date> ALARMCONFIGURATIONUPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlarmConfigurationUpdatedTimestamp").timestampFormat("unixTimestamp").build();
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
    private static final MarshallingInfo<String> STATEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateReason").build();
    private static final MarshallingInfo<String> STATEREASONDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateReasonData").build();
    private static final MarshallingInfo<java.util.Date> STATEUPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateUpdatedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateValue").build();
    private static final MarshallingInfo<java.util.Date> STATETRANSITIONEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateTransitionedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ACTIONSSUPPRESSEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsSuppressedBy").build();
    private static final MarshallingInfo<String> ACTIONSSUPPRESSEDREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsSuppressedReason").build();
    private static final MarshallingInfo<String> ACTIONSSUPPRESSOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsSuppressor").build();
    private static final MarshallingInfo<Integer> ACTIONSSUPPRESSORWAITPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsSuppressorWaitPeriod").build();
    private static final MarshallingInfo<Integer> ACTIONSSUPPRESSOREXTENSIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsSuppressorExtensionPeriod").build();

    private static final CompositeAlarmMarshaller instance = new CompositeAlarmMarshaller();

    public static CompositeAlarmMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CompositeAlarm compositeAlarm, ProtocolMarshaller protocolMarshaller) {

        if (compositeAlarm == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(compositeAlarm.getActionsEnabled(), ACTIONSENABLED_BINDING);
            if (compositeAlarm.getAlarmActions() != null && !compositeAlarm.getAlarmActions().isEmpty()) {
                protocolMarshaller.marshall(compositeAlarm.getAlarmActions(), ALARMACTIONS_BINDING);
            }
            protocolMarshaller.marshall(compositeAlarm.getAlarmArn(), ALARMARN_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getAlarmConfigurationUpdatedTimestamp(), ALARMCONFIGURATIONUPDATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getAlarmDescription(), ALARMDESCRIPTION_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getAlarmName(), ALARMNAME_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getAlarmRule(), ALARMRULE_BINDING);
            if (compositeAlarm.getInsufficientDataActions() != null && !compositeAlarm.getInsufficientDataActions().isEmpty()) {
                protocolMarshaller.marshall(compositeAlarm.getInsufficientDataActions(), INSUFFICIENTDATAACTIONS_BINDING);
            }
            if (compositeAlarm.getOKActions() != null && !compositeAlarm.getOKActions().isEmpty()) {
                protocolMarshaller.marshall(compositeAlarm.getOKActions(), OKACTIONS_BINDING);
            }
            protocolMarshaller.marshall(compositeAlarm.getStateReason(), STATEREASON_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getStateReasonData(), STATEREASONDATA_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getStateUpdatedTimestamp(), STATEUPDATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getStateValue(), STATEVALUE_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getStateTransitionedTimestamp(), STATETRANSITIONEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getActionsSuppressedBy(), ACTIONSSUPPRESSEDBY_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getActionsSuppressedReason(), ACTIONSSUPPRESSEDREASON_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getActionsSuppressor(), ACTIONSSUPPRESSOR_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getActionsSuppressorWaitPeriod(), ACTIONSSUPPRESSORWAITPERIOD_BINDING);
            protocolMarshaller.marshall(compositeAlarm.getActionsSuppressorExtensionPeriod(), ACTIONSSUPPRESSOREXTENSIONPERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
