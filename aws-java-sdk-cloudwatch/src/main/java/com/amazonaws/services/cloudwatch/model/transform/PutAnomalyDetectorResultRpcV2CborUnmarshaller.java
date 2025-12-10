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
 * PutAnomalyDetectorResult CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAnomalyDetectorResultRpcV2CborUnmarshaller implements Unmarshaller<PutAnomalyDetectorResult, RpcV2CborUnmarshallerContext> {

    public PutAnomalyDetectorResult unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        PutAnomalyDetectorResult putAnomalyDetectorResult = new PutAnomalyDetectorResult();

        return putAnomalyDetectorResult;
    }

    private static PutAnomalyDetectorResultRpcV2CborUnmarshaller instance;

    public static PutAnomalyDetectorResultRpcV2CborUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutAnomalyDetectorResultRpcV2CborUnmarshaller();
        return instance;
    }
}
