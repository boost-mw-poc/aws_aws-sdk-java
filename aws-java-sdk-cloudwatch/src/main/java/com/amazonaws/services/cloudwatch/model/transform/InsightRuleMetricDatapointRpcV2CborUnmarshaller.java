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
 * InsightRuleMetricDatapoint CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightRuleMetricDatapointRpcV2CborUnmarshaller implements Unmarshaller<InsightRuleMetricDatapoint, RpcV2CborUnmarshallerContext> {

    public InsightRuleMetricDatapoint unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        InsightRuleMetricDatapoint insightRuleMetricDatapoint = new InsightRuleMetricDatapoint();

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
                if (context.testExpression("Timestamp", targetDepth)) {
                    context.nextToken();
                    insightRuleMetricDatapoint.setTimestamp(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UniqueContributors", targetDepth)) {
                    context.nextToken();
                    insightRuleMetricDatapoint.setUniqueContributors(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("MaxContributorValue", targetDepth)) {
                    context.nextToken();
                    insightRuleMetricDatapoint.setMaxContributorValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("SampleCount", targetDepth)) {
                    context.nextToken();
                    insightRuleMetricDatapoint.setSampleCount(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Average", targetDepth)) {
                    context.nextToken();
                    insightRuleMetricDatapoint.setAverage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Sum", targetDepth)) {
                    context.nextToken();
                    insightRuleMetricDatapoint.setSum(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Minimum", targetDepth)) {
                    context.nextToken();
                    insightRuleMetricDatapoint.setMinimum(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Maximum", targetDepth)) {
                    context.nextToken();
                    insightRuleMetricDatapoint.setMaximum(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return insightRuleMetricDatapoint;
    }

    private static InsightRuleMetricDatapointRpcV2CborUnmarshaller instance;

    public static InsightRuleMetricDatapointRpcV2CborUnmarshaller getInstance() {
        if (instance == null)
            instance = new InsightRuleMetricDatapointRpcV2CborUnmarshaller();
        return instance;
    }
}
