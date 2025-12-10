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
 * DescribeAlarmHistoryResult CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlarmHistoryResultRpcV2CborUnmarshaller implements Unmarshaller<DescribeAlarmHistoryResult, RpcV2CborUnmarshallerContext> {

    public DescribeAlarmHistoryResult unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        DescribeAlarmHistoryResult describeAlarmHistoryResult = new DescribeAlarmHistoryResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAlarmHistoryResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AlarmHistoryItems", targetDepth)) {
                    context.nextToken();
                    describeAlarmHistoryResult.setAlarmHistoryItems(new ListUnmarshaller<AlarmHistoryItem>(AlarmHistoryItemRpcV2CborUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    describeAlarmHistoryResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAlarmHistoryResult;
    }

    private static DescribeAlarmHistoryResultRpcV2CborUnmarshaller instance;

    public static DescribeAlarmHistoryResultRpcV2CborUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAlarmHistoryResultRpcV2CborUnmarshaller();
        return instance;
    }
}
