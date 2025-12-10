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
 * InsightRuleContributorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InsightRuleContributorMarshaller {

    private static final MarshallingInfo<List> KEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Keys").build();
    private static final MarshallingInfo<Double> APPROXIMATEAGGREGATEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApproximateAggregateValue").build();
    private static final MarshallingInfo<List> DATAPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Datapoints").build();

    private static final InsightRuleContributorMarshaller instance = new InsightRuleContributorMarshaller();

    public static InsightRuleContributorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InsightRuleContributor insightRuleContributor, ProtocolMarshaller protocolMarshaller) {

        if (insightRuleContributor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            if (insightRuleContributor.getKeys() != null && !insightRuleContributor.getKeys().isEmpty()) {
                protocolMarshaller.marshall(insightRuleContributor.getKeys(), KEYS_BINDING);
            }
            protocolMarshaller.marshall(insightRuleContributor.getApproximateAggregateValue(), APPROXIMATEAGGREGATEVALUE_BINDING);
            if (insightRuleContributor.getDatapoints() != null && !insightRuleContributor.getDatapoints().isEmpty()) {
                protocolMarshaller.marshall(insightRuleContributor.getDatapoints(), DATAPOINTS_BINDING);
            }
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
