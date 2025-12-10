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
 * ListMetricsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListMetricsRequestMarshaller {

    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Namespace").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<List> DIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dimensions").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<String> RECENTLYACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecentlyActive").build();
    private static final MarshallingInfo<Boolean> INCLUDELINKEDACCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeLinkedAccounts").build();
    private static final MarshallingInfo<String> OWNINGACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OwningAccount").build();

    private static final ListMetricsRequestMarshaller instance = new ListMetricsRequestMarshaller();

    public static ListMetricsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListMetricsRequest listMetricsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listMetricsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listMetricsRequest.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(listMetricsRequest.getMetricName(), METRICNAME_BINDING);
            if (listMetricsRequest.getDimensions() != null && !listMetricsRequest.getDimensions().isEmpty()) {
                protocolMarshaller.marshall(listMetricsRequest.getDimensions(), DIMENSIONS_BINDING);
            }
            protocolMarshaller.marshall(listMetricsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listMetricsRequest.getRecentlyActive(), RECENTLYACTIVE_BINDING);
            protocolMarshaller.marshall(listMetricsRequest.getIncludeLinkedAccounts(), INCLUDELINKEDACCOUNTS_BINDING);
            protocolMarshaller.marshall(listMetricsRequest.getOwningAccount(), OWNINGACCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
