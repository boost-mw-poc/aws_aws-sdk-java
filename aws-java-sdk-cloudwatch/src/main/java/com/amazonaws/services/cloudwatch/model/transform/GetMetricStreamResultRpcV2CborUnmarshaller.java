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
 * GetMetricStreamResult CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricStreamResultRpcV2CborUnmarshaller implements Unmarshaller<GetMetricStreamResult, RpcV2CborUnmarshallerContext> {

    public GetMetricStreamResult unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        GetMetricStreamResult getMetricStreamResult = new GetMetricStreamResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMetricStreamResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    getMetricStreamResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getMetricStreamResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IncludeFilters", targetDepth)) {
                    context.nextToken();
                    getMetricStreamResult.setIncludeFilters(new ListUnmarshaller<MetricStreamFilter>(MetricStreamFilterRpcV2CborUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ExcludeFilters", targetDepth)) {
                    context.nextToken();
                    getMetricStreamResult.setExcludeFilters(new ListUnmarshaller<MetricStreamFilter>(MetricStreamFilterRpcV2CborUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FirehoseArn", targetDepth)) {
                    context.nextToken();
                    getMetricStreamResult.setFirehoseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    getMetricStreamResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    getMetricStreamResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    getMetricStreamResult.setCreationDate(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastUpdateDate", targetDepth)) {
                    context.nextToken();
                    getMetricStreamResult.setLastUpdateDate(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputFormat", targetDepth)) {
                    context.nextToken();
                    getMetricStreamResult.setOutputFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatisticsConfigurations", targetDepth)) {
                    context.nextToken();
                    getMetricStreamResult.setStatisticsConfigurations(new ListUnmarshaller<MetricStreamStatisticsConfiguration>(
                            MetricStreamStatisticsConfigurationRpcV2CborUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("IncludeLinkedAccountsMetrics", targetDepth)) {
                    context.nextToken();
                    getMetricStreamResult.setIncludeLinkedAccountsMetrics(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMetricStreamResult;
    }

    private static GetMetricStreamResultRpcV2CborUnmarshaller instance;

    public static GetMetricStreamResultRpcV2CborUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMetricStreamResultRpcV2CborUnmarshaller();
        return instance;
    }
}
