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
 * PutMetricAlarmRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutMetricAlarmRequestMarshaller {

    private static final MarshallingInfo<String> ALARMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmName").build();
    private static final MarshallingInfo<String> ALARMDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlarmDescription").build();
    private static final MarshallingInfo<Boolean> ACTIONSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsEnabled").build();
    private static final MarshallingInfo<List> OKACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OKActions").build();
    private static final MarshallingInfo<List> ALARMACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmActions").build();
    private static final MarshallingInfo<List> INSUFFICIENTDATAACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InsufficientDataActions").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Namespace").build();
    private static final MarshallingInfo<String> STATISTIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Statistic").build();
    private static final MarshallingInfo<String> EXTENDEDSTATISTIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtendedStatistic").build();
    private static final MarshallingInfo<List> DIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dimensions").build();
    private static final MarshallingInfo<Integer> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Period").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Unit").build();
    private static final MarshallingInfo<Integer> EVALUATIONPERIODS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationPeriods").build();
    private static final MarshallingInfo<Integer> DATAPOINTSTOALARM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatapointsToAlarm").build();
    private static final MarshallingInfo<Double> THRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Threshold").build();
    private static final MarshallingInfo<String> COMPARISONOPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComparisonOperator").build();
    private static final MarshallingInfo<String> TREATMISSINGDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TreatMissingData").build();
    private static final MarshallingInfo<String> EVALUATELOWSAMPLECOUNTPERCENTILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluateLowSampleCountPercentile").build();
    private static final MarshallingInfo<List> METRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metrics").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> THRESHOLDMETRICID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThresholdMetricId").build();

    private static final PutMetricAlarmRequestMarshaller instance = new PutMetricAlarmRequestMarshaller();

    public static PutMetricAlarmRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutMetricAlarmRequest putMetricAlarmRequest, ProtocolMarshaller protocolMarshaller) {

        if (putMetricAlarmRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putMetricAlarmRequest.getAlarmName(), ALARMNAME_BINDING);
            protocolMarshaller.marshall(putMetricAlarmRequest.getAlarmDescription(), ALARMDESCRIPTION_BINDING);
            protocolMarshaller.marshall(putMetricAlarmRequest.getActionsEnabled(), ACTIONSENABLED_BINDING);
            if (putMetricAlarmRequest.getOKActions() != null && !putMetricAlarmRequest.getOKActions().isEmpty()) {
                protocolMarshaller.marshall(putMetricAlarmRequest.getOKActions(), OKACTIONS_BINDING);
            }
            if (putMetricAlarmRequest.getAlarmActions() != null && !putMetricAlarmRequest.getAlarmActions().isEmpty()) {
                protocolMarshaller.marshall(putMetricAlarmRequest.getAlarmActions(), ALARMACTIONS_BINDING);
            }
            if (putMetricAlarmRequest.getInsufficientDataActions() != null && !putMetricAlarmRequest.getInsufficientDataActions().isEmpty()) {
                protocolMarshaller.marshall(putMetricAlarmRequest.getInsufficientDataActions(), INSUFFICIENTDATAACTIONS_BINDING);
            }
            protocolMarshaller.marshall(putMetricAlarmRequest.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(putMetricAlarmRequest.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(putMetricAlarmRequest.getStatistic(), STATISTIC_BINDING);
            protocolMarshaller.marshall(putMetricAlarmRequest.getExtendedStatistic(), EXTENDEDSTATISTIC_BINDING);
            if (putMetricAlarmRequest.getDimensions() != null && !putMetricAlarmRequest.getDimensions().isEmpty()) {
                protocolMarshaller.marshall(putMetricAlarmRequest.getDimensions(), DIMENSIONS_BINDING);
            }
            protocolMarshaller.marshall(putMetricAlarmRequest.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(putMetricAlarmRequest.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(putMetricAlarmRequest.getEvaluationPeriods(), EVALUATIONPERIODS_BINDING);
            protocolMarshaller.marshall(putMetricAlarmRequest.getDatapointsToAlarm(), DATAPOINTSTOALARM_BINDING);
            protocolMarshaller.marshall(putMetricAlarmRequest.getThreshold(), THRESHOLD_BINDING);
            protocolMarshaller.marshall(putMetricAlarmRequest.getComparisonOperator(), COMPARISONOPERATOR_BINDING);
            protocolMarshaller.marshall(putMetricAlarmRequest.getTreatMissingData(), TREATMISSINGDATA_BINDING);
            protocolMarshaller.marshall(putMetricAlarmRequest.getEvaluateLowSampleCountPercentile(), EVALUATELOWSAMPLECOUNTPERCENTILE_BINDING);
            if (putMetricAlarmRequest.getMetrics() != null && !putMetricAlarmRequest.getMetrics().isEmpty()) {
                protocolMarshaller.marshall(putMetricAlarmRequest.getMetrics(), METRICS_BINDING);
            }
            if (putMetricAlarmRequest.getTags() != null && !putMetricAlarmRequest.getTags().isEmpty()) {
                protocolMarshaller.marshall(putMetricAlarmRequest.getTags(), TAGS_BINDING);
            }
            protocolMarshaller.marshall(putMetricAlarmRequest.getThresholdMetricId(), THRESHOLDMETRICID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
