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

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StopMetricStreamsResult CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopMetricStreamsResultRpcV2CborUnmarshaller implements Unmarshaller<StopMetricStreamsResult, RpcV2CborUnmarshallerContext> {

    public StopMetricStreamsResult unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        StopMetricStreamsResult stopMetricStreamsResult = new StopMetricStreamsResult();

        return stopMetricStreamsResult;
    }

    private static StopMetricStreamsResultRpcV2CborUnmarshaller instance;

    public static StopMetricStreamsResultRpcV2CborUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopMetricStreamsResultRpcV2CborUnmarshaller();
        return instance;
    }
}
