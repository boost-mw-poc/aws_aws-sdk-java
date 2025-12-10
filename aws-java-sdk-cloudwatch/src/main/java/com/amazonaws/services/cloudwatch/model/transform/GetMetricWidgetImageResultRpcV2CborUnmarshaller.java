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
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.*;
import com.amazonaws.transform.rpcv2cbor.*;
import com.amazonaws.transform.Unmarshaller;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetMetricWidgetImageResult CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricWidgetImageResultRpcV2CborUnmarshaller implements Unmarshaller<GetMetricWidgetImageResult, RpcV2CborUnmarshallerContext> {

    public GetMetricWidgetImageResult unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        GetMetricWidgetImageResult getMetricWidgetImageResult = new GetMetricWidgetImageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMetricWidgetImageResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("MetricWidgetImage", targetDepth)) {
                    context.nextToken();
                    getMetricWidgetImageResult.setMetricWidgetImage(context.getUnmarshaller(java.nio.ByteBuffer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMetricWidgetImageResult;
    }

    private static GetMetricWidgetImageResultRpcV2CborUnmarshaller instance;

    public static GetMetricWidgetImageResultRpcV2CborUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMetricWidgetImageResultRpcV2CborUnmarshaller();
        return instance;
    }
}
