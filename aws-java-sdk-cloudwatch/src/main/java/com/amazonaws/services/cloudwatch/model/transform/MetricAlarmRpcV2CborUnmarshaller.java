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
 * MetricAlarm CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricAlarmRpcV2CborUnmarshaller implements Unmarshaller<MetricAlarm, RpcV2CborUnmarshallerContext> {

    public MetricAlarm unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        MetricAlarm metricAlarm = new MetricAlarm();

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
                    metricAlarm.setAlarmName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmArn", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setAlarmArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmDescription", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setAlarmDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmConfigurationUpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setAlarmConfigurationUpdatedTimestamp(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ActionsEnabled", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setActionsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OKActions", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setOKActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AlarmActions", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setAlarmActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("InsufficientDataActions", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setInsufficientDataActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("StateValue", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setStateValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReasonData", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setStateReasonData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateUpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setStateUpdatedTimestamp(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MetricName", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Namespace", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Statistic", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setStatistic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExtendedStatistic", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setExtendedStatistic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Dimensions", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setDimensions(new ListUnmarshaller<Dimension>(DimensionRpcV2CborUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Period", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Unit", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationPeriods", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setEvaluationPeriods(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DatapointsToAlarm", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setDatapointsToAlarm(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Threshold", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ComparisonOperator", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setComparisonOperator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TreatMissingData", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setTreatMissingData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluateLowSampleCountPercentile", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setEvaluateLowSampleCountPercentile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Metrics", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setMetrics(new ListUnmarshaller<MetricDataQuery>(MetricDataQueryRpcV2CborUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ThresholdMetricId", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setThresholdMetricId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationState", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setEvaluationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateTransitionedTimestamp", targetDepth)) {
                    context.nextToken();
                    metricAlarm.setStateTransitionedTimestamp(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return metricAlarm;
    }

    private static MetricAlarmRpcV2CborUnmarshaller instance;

    public static MetricAlarmRpcV2CborUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricAlarmRpcV2CborUnmarshaller();
        return instance;
    }
}
