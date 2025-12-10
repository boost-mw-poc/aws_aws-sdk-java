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
 * AlarmHistoryItem CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmHistoryItemRpcV2CborUnmarshaller implements Unmarshaller<AlarmHistoryItem, RpcV2CborUnmarshallerContext> {

    public AlarmHistoryItem unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        AlarmHistoryItem alarmHistoryItem = new AlarmHistoryItem();

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
                if (context.testExpression("AlarmName", targetDepth)) {
                    context.nextToken();
                    alarmHistoryItem.setAlarmName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmContributorId", targetDepth)) {
                    context.nextToken();
                    alarmHistoryItem.setAlarmContributorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmType", targetDepth)) {
                    context.nextToken();
                    alarmHistoryItem.setAlarmType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timestamp", targetDepth)) {
                    context.nextToken();
                    alarmHistoryItem.setTimestamp(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HistoryItemType", targetDepth)) {
                    context.nextToken();
                    alarmHistoryItem.setHistoryItemType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HistorySummary", targetDepth)) {
                    context.nextToken();
                    alarmHistoryItem.setHistorySummary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HistoryData", targetDepth)) {
                    context.nextToken();
                    alarmHistoryItem.setHistoryData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmContributorAttributes", targetDepth)) {
                    context.nextToken();
                    alarmHistoryItem.setAlarmContributorAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return alarmHistoryItem;
    }

    private static AlarmHistoryItemRpcV2CborUnmarshaller instance;

    public static AlarmHistoryItemRpcV2CborUnmarshaller getInstance() {
        if (instance == null)
            instance = new AlarmHistoryItemRpcV2CborUnmarshaller();
        return instance;
    }
}
