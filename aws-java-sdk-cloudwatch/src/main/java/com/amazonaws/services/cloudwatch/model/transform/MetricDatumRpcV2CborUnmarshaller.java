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
 * MetricDatum CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDatumRpcV2CborUnmarshaller implements Unmarshaller<MetricDatum, RpcV2CborUnmarshallerContext> {

    public MetricDatum unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        MetricDatum metricDatum = new MetricDatum();

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
                if (context.testExpression("MetricName", targetDepth)) {
                    context.nextToken();
                    metricDatum.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Dimensions", targetDepth)) {
                    context.nextToken();
                    metricDatum.setDimensions(new ListUnmarshaller<Dimension>(DimensionRpcV2CborUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Timestamp", targetDepth)) {
                    context.nextToken();
                    metricDatum.setTimestamp(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Value", targetDepth)) {
                    context.nextToken();
                    metricDatum.setValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("StatisticValues", targetDepth)) {
                    context.nextToken();
                    metricDatum.setStatisticValues(StatisticSetRpcV2CborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Values", targetDepth)) {
                    context.nextToken();
                    metricDatum.setValues(new ListUnmarshaller<Double>(context.getUnmarshaller(Double.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Counts", targetDepth)) {
                    context.nextToken();
                    metricDatum.setCounts(new ListUnmarshaller<Double>(context.getUnmarshaller(Double.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Unit", targetDepth)) {
                    context.nextToken();
                    metricDatum.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageResolution", targetDepth)) {
                    context.nextToken();
                    metricDatum.setStorageResolution(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return metricDatum;
    }

    private static MetricDatumRpcV2CborUnmarshaller instance;

    public static MetricDatumRpcV2CborUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricDatumRpcV2CborUnmarshaller();
        return instance;
    }
}
