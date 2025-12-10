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
 * MetricAlarmMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MetricAlarmMarshaller {

    private static final MarshallingInfo<String> ALARMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmName").build();
    private static final MarshallingInfo<String> ALARMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmArn").build();
    private static final MarshallingInfo<String> ALARMDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlarmDescription").build();
    private static final MarshallingInfo<java.util.Date> ALARMCONFIGURATIONUPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlarmConfigurationUpdatedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Boolean> ACTIONSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsEnabled").build();
    private static final MarshallingInfo<List> OKACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OKActions").build();
    private static final MarshallingInfo<List> ALARMACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmActions").build();
    private static final MarshallingInfo<List> INSUFFICIENTDATAACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InsufficientDataActions").build();
    private static final MarshallingInfo<String> STATEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateValue").build();
    private static final MarshallingInfo<String> STATEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateReason").build();
    private static final MarshallingInfo<String> STATEREASONDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateReasonData").build();
    private static final MarshallingInfo<java.util.Date> STATEUPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateUpdatedTimestamp").timestampFormat("unixTimestamp").build();
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
    private static final MarshallingInfo<String> THRESHOLDMETRICID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThresholdMetricId").build();
    private static final MarshallingInfo<String> EVALUATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationState").build();
    private static final MarshallingInfo<java.util.Date> STATETRANSITIONEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateTransitionedTimestamp").timestampFormat("unixTimestamp").build();

    private static final MetricAlarmMarshaller instance = new MetricAlarmMarshaller();

    public static MetricAlarmMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MetricAlarm metricAlarm, ProtocolMarshaller protocolMarshaller) {

        if (metricAlarm == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(metricAlarm.getAlarmName(), ALARMNAME_BINDING);
            protocolMarshaller.marshall(metricAlarm.getAlarmArn(), ALARMARN_BINDING);
            protocolMarshaller.marshall(metricAlarm.getAlarmDescription(), ALARMDESCRIPTION_BINDING);
            protocolMarshaller.marshall(metricAlarm.getAlarmConfigurationUpdatedTimestamp(), ALARMCONFIGURATIONUPDATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(metricAlarm.getActionsEnabled(), ACTIONSENABLED_BINDING);
            if (metricAlarm.getOKActions() != null && !metricAlarm.getOKActions().isEmpty()) {
                protocolMarshaller.marshall(metricAlarm.getOKActions(), OKACTIONS_BINDING);
            }
            if (metricAlarm.getAlarmActions() != null && !metricAlarm.getAlarmActions().isEmpty()) {
                protocolMarshaller.marshall(metricAlarm.getAlarmActions(), ALARMACTIONS_BINDING);
            }
            if (metricAlarm.getInsufficientDataActions() != null && !metricAlarm.getInsufficientDataActions().isEmpty()) {
                protocolMarshaller.marshall(metricAlarm.getInsufficientDataActions(), INSUFFICIENTDATAACTIONS_BINDING);
            }
            protocolMarshaller.marshall(metricAlarm.getStateValue(), STATEVALUE_BINDING);
            protocolMarshaller.marshall(metricAlarm.getStateReason(), STATEREASON_BINDING);
            protocolMarshaller.marshall(metricAlarm.getStateReasonData(), STATEREASONDATA_BINDING);
            protocolMarshaller.marshall(metricAlarm.getStateUpdatedTimestamp(), STATEUPDATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(metricAlarm.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(metricAlarm.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(metricAlarm.getStatistic(), STATISTIC_BINDING);
            protocolMarshaller.marshall(metricAlarm.getExtendedStatistic(), EXTENDEDSTATISTIC_BINDING);
            if (metricAlarm.getDimensions() != null && !metricAlarm.getDimensions().isEmpty()) {
                protocolMarshaller.marshall(metricAlarm.getDimensions(), DIMENSIONS_BINDING);
            }
            protocolMarshaller.marshall(metricAlarm.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(metricAlarm.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(metricAlarm.getEvaluationPeriods(), EVALUATIONPERIODS_BINDING);
            protocolMarshaller.marshall(metricAlarm.getDatapointsToAlarm(), DATAPOINTSTOALARM_BINDING);
            protocolMarshaller.marshall(metricAlarm.getThreshold(), THRESHOLD_BINDING);
            protocolMarshaller.marshall(metricAlarm.getComparisonOperator(), COMPARISONOPERATOR_BINDING);
            protocolMarshaller.marshall(metricAlarm.getTreatMissingData(), TREATMISSINGDATA_BINDING);
            protocolMarshaller.marshall(metricAlarm.getEvaluateLowSampleCountPercentile(), EVALUATELOWSAMPLECOUNTPERCENTILE_BINDING);
            if (metricAlarm.getMetrics() != null && !metricAlarm.getMetrics().isEmpty()) {
                protocolMarshaller.marshall(metricAlarm.getMetrics(), METRICS_BINDING);
            }
            protocolMarshaller.marshall(metricAlarm.getThresholdMetricId(), THRESHOLDMETRICID_BINDING);
            protocolMarshaller.marshall(metricAlarm.getEvaluationState(), EVALUATIONSTATE_BINDING);
            protocolMarshaller.marshall(metricAlarm.getStateTransitionedTimestamp(), STATETRANSITIONEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request: " + e.getMessage(), e);
        }
    }

}
