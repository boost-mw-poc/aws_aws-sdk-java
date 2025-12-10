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
 * DescribeAlarmsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeAlarmsRequestMarshaller {

    private static final MarshallingInfo<List> ALARMNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmNames").build();
    private static final MarshallingInfo<String> ALARMNAMEPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlarmNamePrefix").build();
    private static final MarshallingInfo<List> ALARMTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmTypes").build();
    private static final MarshallingInfo<String> CHILDRENOFALARMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChildrenOfAlarmName").build();
    private static final MarshallingInfo<String> PARENTSOFALARMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentsOfAlarmName").build();
    private static final MarshallingInfo<String> STATEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateValue").build();
    private static final MarshallingInfo<String> ACTIONPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionPrefix").build();
    private static final MarshallingInfo<Integer> MAXRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxRecords").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final DescribeAlarmsRequestMarshaller instance = new DescribeAlarmsRequestMarshaller();

    public static DescribeAlarmsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeAlarmsRequest describeAlarmsRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeAlarmsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            if (describeAlarmsRequest.getAlarmNames() != null && !describeAlarmsRequest.getAlarmNames().isEmpty()) {
                protocolMarshaller.marshall(describeAlarmsRequest.getAlarmNames(), ALARMNAMES_BINDING);
            }
            protocolMarshaller.marshall(describeAlarmsRequest.getAlarmNamePrefix(), ALARMNAMEPREFIX_BINDING);
            if (describeAlarmsRequest.getAlarmTypes() != null && !describeAlarmsRequest.getAlarmTypes().isEmpty()) {
                protocolMarshaller.marshall(describeAlarmsRequest.getAlarmTypes(), ALARMTYPES_BINDING);
            }
            protocolMarshaller.marshall(describeAlarmsRequest.getChildrenOfAlarmName(), CHILDRENOFALARMNAME_BINDING);
            protocolMarshaller.marshall(describeAlarmsRequest.getParentsOfAlarmName(), PARENTSOFALARMNAME_BINDING);
            protocolMarshaller.marshall(describeAlarmsRequest.getStateValue(), STATEVALUE_BINDING);
            protocolMarshaller.marshall(describeAlarmsRequest.getActionPrefix(), ACTIONPREFIX_BINDING);
            protocolMarshaller.marshall(describeAlarmsRequest.getMaxRecords(), MAXRECORDS_BINDING);
            protocolMarshaller.marshall(describeAlarmsRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
