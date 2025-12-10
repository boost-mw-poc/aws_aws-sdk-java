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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutMetricDataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutMetricDataRequestMarshaller {

    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Namespace").build();
    private static final MarshallingInfo<List> METRICDATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MetricData").build();
    private static final MarshallingInfo<List> ENTITYMETRICDATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntityMetricData").build();
    private static final MarshallingInfo<Boolean> STRICTENTITYVALIDATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StrictEntityValidation").build();

    private static final PutMetricDataRequestMarshaller instance = new PutMetricDataRequestMarshaller();

    public static PutMetricDataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutMetricDataRequest putMetricDataRequest, ProtocolMarshaller protocolMarshaller) {

        if (putMetricDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putMetricDataRequest.getNamespace(), NAMESPACE_BINDING);
            if (putMetricDataRequest.getMetricData() != null && !putMetricDataRequest.getMetricData().isEmpty()) {
                protocolMarshaller.marshall(putMetricDataRequest.getMetricData(), METRICDATA_BINDING);
            }
            if (putMetricDataRequest.getEntityMetricData() != null && !putMetricDataRequest.getEntityMetricData().isEmpty()) {
                protocolMarshaller.marshall(putMetricDataRequest.getEntityMetricData(), ENTITYMETRICDATA_BINDING);
            }
            protocolMarshaller.marshall(putMetricDataRequest.getStrictEntityValidation(), STRICTENTITYVALIDATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
