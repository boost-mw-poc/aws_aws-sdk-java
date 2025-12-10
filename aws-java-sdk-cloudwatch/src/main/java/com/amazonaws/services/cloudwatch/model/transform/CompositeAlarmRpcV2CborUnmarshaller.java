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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.*;
import com.amazonaws.transform.rpcv2cbor.*;
import com.amazonaws.transform.Unmarshaller;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CompositeAlarm CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompositeAlarmRpcV2CborUnmarshaller implements Unmarshaller<CompositeAlarm, RpcV2CborUnmarshallerContext> {

    public CompositeAlarm unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        CompositeAlarm compositeAlarm = new CompositeAlarm();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ActionsEnabled", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setActionsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AlarmActions", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setAlarmActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AlarmArn", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setAlarmArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmConfigurationUpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setAlarmConfigurationUpdatedTimestamp(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AlarmDescription", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setAlarmDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmName", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setAlarmName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmRule", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setAlarmRule(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InsufficientDataActions", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setInsufficientDataActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("OKActions", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setOKActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReasonData", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setStateReasonData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateUpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setStateUpdatedTimestamp(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StateValue", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setStateValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateTransitionedTimestamp", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setStateTransitionedTimestamp(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ActionsSuppressedBy", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setActionsSuppressedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActionsSuppressedReason", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setActionsSuppressedReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActionsSuppressor", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setActionsSuppressor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActionsSuppressorWaitPeriod", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setActionsSuppressorWaitPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ActionsSuppressorExtensionPeriod", targetDepth)) {
                    context.nextToken();
                    compositeAlarm.setActionsSuppressorExtensionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return compositeAlarm;
    }

    private static CompositeAlarmRpcV2CborUnmarshaller instance;

    public static CompositeAlarmRpcV2CborUnmarshaller getInstance() {
        if (instance == null)
            instance = new CompositeAlarmRpcV2CborUnmarshaller();
        return instance;
    }
}
