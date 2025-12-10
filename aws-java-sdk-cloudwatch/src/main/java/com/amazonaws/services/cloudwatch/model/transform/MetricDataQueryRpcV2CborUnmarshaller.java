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
 * MetricDataQuery CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDataQueryRpcV2CborUnmarshaller implements Unmarshaller<MetricDataQuery, RpcV2CborUnmarshallerContext> {

    public MetricDataQuery unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        MetricDataQuery metricDataQuery = new MetricDataQuery();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    metricDataQuery.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricStat", targetDepth)) {
                    context.nextToken();
                    metricDataQuery.setMetricStat(MetricStatRpcV2CborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Expression", targetDepth)) {
                    context.nextToken();
                    metricDataQuery.setExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Label", targetDepth)) {
                    context.nextToken();
                    metricDataQuery.setLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReturnData", targetDepth)) {
                    context.nextToken();
                    metricDataQuery.setReturnData(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Period", targetDepth)) {
                    context.nextToken();
                    metricDataQuery.setPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    metricDataQuery.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return metricDataQuery;
    }

    private static MetricDataQueryRpcV2CborUnmarshaller instance;

    public static MetricDataQueryRpcV2CborUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricDataQueryRpcV2CborUnmarshaller();
        return instance;
    }
}
