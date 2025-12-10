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
 * MetricStreamEntry CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricStreamEntryRpcV2CborUnmarshaller implements Unmarshaller<MetricStreamEntry, RpcV2CborUnmarshallerContext> {

    public MetricStreamEntry unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        MetricStreamEntry metricStreamEntry = new MetricStreamEntry();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    metricStreamEntry.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    metricStreamEntry.setCreationDate(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastUpdateDate", targetDepth)) {
                    context.nextToken();
                    metricStreamEntry.setLastUpdateDate(DateCborUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    metricStreamEntry.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirehoseArn", targetDepth)) {
                    context.nextToken();
                    metricStreamEntry.setFirehoseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    metricStreamEntry.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputFormat", targetDepth)) {
                    context.nextToken();
                    metricStreamEntry.setOutputFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return metricStreamEntry;
    }

    private static MetricStreamEntryRpcV2CborUnmarshaller instance;

    public static MetricStreamEntryRpcV2CborUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricStreamEntryRpcV2CborUnmarshaller();
        return instance;
    }
}
