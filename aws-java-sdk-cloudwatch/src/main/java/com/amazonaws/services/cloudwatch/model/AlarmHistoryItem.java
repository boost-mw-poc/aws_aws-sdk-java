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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the history of a specific alarm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/AlarmHistoryItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmHistoryItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The descriptive name for the alarm.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The unique identifier of the alarm contributor associated with this history item, if applicable.
     * </p>
     */
    private String alarmContributorId;
    /**
     * <p>
     * The type of alarm, either metric alarm or composite alarm.
     * </p>
     */
    private String alarmType;
    /**
     * <p>
     * The time stamp for the alarm history item.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The type of alarm history item.
     * </p>
     */
    private String historyItemType;
    /**
     * <p>
     * A summary of the alarm history, in text format.
     * </p>
     */
    private String historySummary;
    /**
     * <p>
     * Data about the alarm, in JSON format.
     * </p>
     */
    private String historyData;
    /**
     * <p>
     * A map of attributes that describe the alarm contributor associated with this history item, providing context
     * about the contributor's characteristics at the time of the event.
     * </p>
     */
    private java.util.Map<String, String> alarmContributorAttributes;

    /**
     * <p>
     * The descriptive name for the alarm.
     * </p>
     * 
     * @param alarmName
     *        The descriptive name for the alarm.
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The descriptive name for the alarm.
     * </p>
     * 
     * @return The descriptive name for the alarm.
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The descriptive name for the alarm.
     * </p>
     * 
     * @param alarmName
     *        The descriptive name for the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmHistoryItem withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the alarm contributor associated with this history item, if applicable.
     * </p>
     * 
     * @param alarmContributorId
     *        The unique identifier of the alarm contributor associated with this history item, if applicable.
     */

    public void setAlarmContributorId(String alarmContributorId) {
        this.alarmContributorId = alarmContributorId;
    }

    /**
     * <p>
     * The unique identifier of the alarm contributor associated with this history item, if applicable.
     * </p>
     * 
     * @return The unique identifier of the alarm contributor associated with this history item, if applicable.
     */

    public String getAlarmContributorId() {
        return this.alarmContributorId;
    }

    /**
     * <p>
     * The unique identifier of the alarm contributor associated with this history item, if applicable.
     * </p>
     * 
     * @param alarmContributorId
     *        The unique identifier of the alarm contributor associated with this history item, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmHistoryItem withAlarmContributorId(String alarmContributorId) {
        setAlarmContributorId(alarmContributorId);
        return this;
    }

    /**
     * <p>
     * The type of alarm, either metric alarm or composite alarm.
     * </p>
     * 
     * @param alarmType
     *        The type of alarm, either metric alarm or composite alarm.
     * @see AlarmType
     */

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    /**
     * <p>
     * The type of alarm, either metric alarm or composite alarm.
     * </p>
     * 
     * @return The type of alarm, either metric alarm or composite alarm.
     * @see AlarmType
     */

    public String getAlarmType() {
        return this.alarmType;
    }

    /**
     * <p>
     * The type of alarm, either metric alarm or composite alarm.
     * </p>
     * 
     * @param alarmType
     *        The type of alarm, either metric alarm or composite alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmType
     */

    public AlarmHistoryItem withAlarmType(String alarmType) {
        setAlarmType(alarmType);
        return this;
    }

    /**
     * <p>
     * The type of alarm, either metric alarm or composite alarm.
     * </p>
     * 
     * @param alarmType
     *        The type of alarm, either metric alarm or composite alarm.
     * @see AlarmType
     */

    public void setAlarmType(AlarmType alarmType) {
        withAlarmType(alarmType);
    }

    /**
     * <p>
     * The type of alarm, either metric alarm or composite alarm.
     * </p>
     * 
     * @param alarmType
     *        The type of alarm, either metric alarm or composite alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlarmType
     */

    public AlarmHistoryItem withAlarmType(AlarmType alarmType) {
        this.alarmType = alarmType.toString();
        return this;
    }

    /**
     * <p>
     * The time stamp for the alarm history item.
     * </p>
     * 
     * @param timestamp
     *        The time stamp for the alarm history item.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time stamp for the alarm history item.
     * </p>
     * 
     * @return The time stamp for the alarm history item.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time stamp for the alarm history item.
     * </p>
     * 
     * @param timestamp
     *        The time stamp for the alarm history item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmHistoryItem withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * 
     * @param historyItemType
     *        The type of alarm history item.
     * @see HistoryItemType
     */

    public void setHistoryItemType(String historyItemType) {
        this.historyItemType = historyItemType;
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * 
     * @return The type of alarm history item.
     * @see HistoryItemType
     */

    public String getHistoryItemType() {
        return this.historyItemType;
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * 
     * @param historyItemType
     *        The type of alarm history item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistoryItemType
     */

    public AlarmHistoryItem withHistoryItemType(String historyItemType) {
        setHistoryItemType(historyItemType);
        return this;
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * 
     * @param historyItemType
     *        The type of alarm history item.
     * @see HistoryItemType
     */

    public void setHistoryItemType(HistoryItemType historyItemType) {
        withHistoryItemType(historyItemType);
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * 
     * @param historyItemType
     *        The type of alarm history item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistoryItemType
     */

    public AlarmHistoryItem withHistoryItemType(HistoryItemType historyItemType) {
        this.historyItemType = historyItemType.toString();
        return this;
    }

    /**
     * <p>
     * A summary of the alarm history, in text format.
     * </p>
     * 
     * @param historySummary
     *        A summary of the alarm history, in text format.
     */

    public void setHistorySummary(String historySummary) {
        this.historySummary = historySummary;
    }

    /**
     * <p>
     * A summary of the alarm history, in text format.
     * </p>
     * 
     * @return A summary of the alarm history, in text format.
     */

    public String getHistorySummary() {
        return this.historySummary;
    }

    /**
     * <p>
     * A summary of the alarm history, in text format.
     * </p>
     * 
     * @param historySummary
     *        A summary of the alarm history, in text format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmHistoryItem withHistorySummary(String historySummary) {
        setHistorySummary(historySummary);
        return this;
    }

    /**
     * <p>
     * Data about the alarm, in JSON format.
     * </p>
     * 
     * @param historyData
     *        Data about the alarm, in JSON format.
     */

    public void setHistoryData(String historyData) {
        this.historyData = historyData;
    }

    /**
     * <p>
     * Data about the alarm, in JSON format.
     * </p>
     * 
     * @return Data about the alarm, in JSON format.
     */

    public String getHistoryData() {
        return this.historyData;
    }

    /**
     * <p>
     * Data about the alarm, in JSON format.
     * </p>
     * 
     * @param historyData
     *        Data about the alarm, in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmHistoryItem withHistoryData(String historyData) {
        setHistoryData(historyData);
        return this;
    }

    /**
     * <p>
     * A map of attributes that describe the alarm contributor associated with this history item, providing context
     * about the contributor's characteristics at the time of the event.
     * </p>
     * 
     * @return A map of attributes that describe the alarm contributor associated with this history item, providing
     *         context about the contributor's characteristics at the time of the event.
     */

    public java.util.Map<String, String> getAlarmContributorAttributes() {
        return alarmContributorAttributes;
    }

    /**
     * <p>
     * A map of attributes that describe the alarm contributor associated with this history item, providing context
     * about the contributor's characteristics at the time of the event.
     * </p>
     * 
     * @param alarmContributorAttributes
     *        A map of attributes that describe the alarm contributor associated with this history item, providing
     *        context about the contributor's characteristics at the time of the event.
     */

    public void setAlarmContributorAttributes(java.util.Map<String, String> alarmContributorAttributes) {
        this.alarmContributorAttributes = alarmContributorAttributes;
    }

    /**
     * <p>
     * A map of attributes that describe the alarm contributor associated with this history item, providing context
     * about the contributor's characteristics at the time of the event.
     * </p>
     * 
     * @param alarmContributorAttributes
     *        A map of attributes that describe the alarm contributor associated with this history item, providing
     *        context about the contributor's characteristics at the time of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmHistoryItem withAlarmContributorAttributes(java.util.Map<String, String> alarmContributorAttributes) {
        setAlarmContributorAttributes(alarmContributorAttributes);
        return this;
    }

    /**
     * Add a single AlarmContributorAttributes entry
     *
     * @see AlarmHistoryItem#withAlarmContributorAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AlarmHistoryItem addAlarmContributorAttributesEntry(String key, String value) {
        if (null == this.alarmContributorAttributes) {
            this.alarmContributorAttributes = new java.util.HashMap<String, String>();
        }
        if (this.alarmContributorAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.alarmContributorAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AlarmContributorAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmHistoryItem clearAlarmContributorAttributesEntries() {
        this.alarmContributorAttributes = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAlarmName() != null)
            sb.append("AlarmName: ").append(getAlarmName()).append(",");
        if (getAlarmContributorId() != null)
            sb.append("AlarmContributorId: ").append(getAlarmContributorId()).append(",");
        if (getAlarmType() != null)
            sb.append("AlarmType: ").append(getAlarmType()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getHistoryItemType() != null)
            sb.append("HistoryItemType: ").append(getHistoryItemType()).append(",");
        if (getHistorySummary() != null)
            sb.append("HistorySummary: ").append(getHistorySummary()).append(",");
        if (getHistoryData() != null)
            sb.append("HistoryData: ").append(getHistoryData()).append(",");
        if (getAlarmContributorAttributes() != null)
            sb.append("AlarmContributorAttributes: ").append(getAlarmContributorAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmHistoryItem == false)
            return false;
        AlarmHistoryItem other = (AlarmHistoryItem) obj;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getAlarmContributorId() == null ^ this.getAlarmContributorId() == null)
            return false;
        if (other.getAlarmContributorId() != null && other.getAlarmContributorId().equals(this.getAlarmContributorId()) == false)
            return false;
        if (other.getAlarmType() == null ^ this.getAlarmType() == null)
            return false;
        if (other.getAlarmType() != null && other.getAlarmType().equals(this.getAlarmType()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getHistoryItemType() == null ^ this.getHistoryItemType() == null)
            return false;
        if (other.getHistoryItemType() != null && other.getHistoryItemType().equals(this.getHistoryItemType()) == false)
            return false;
        if (other.getHistorySummary() == null ^ this.getHistorySummary() == null)
            return false;
        if (other.getHistorySummary() != null && other.getHistorySummary().equals(this.getHistorySummary()) == false)
            return false;
        if (other.getHistoryData() == null ^ this.getHistoryData() == null)
            return false;
        if (other.getHistoryData() != null && other.getHistoryData().equals(this.getHistoryData()) == false)
            return false;
        if (other.getAlarmContributorAttributes() == null ^ this.getAlarmContributorAttributes() == null)
            return false;
        if (other.getAlarmContributorAttributes() != null && other.getAlarmContributorAttributes().equals(this.getAlarmContributorAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getAlarmContributorId() == null) ? 0 : getAlarmContributorId().hashCode());
        hashCode = prime * hashCode + ((getAlarmType() == null) ? 0 : getAlarmType().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getHistoryItemType() == null) ? 0 : getHistoryItemType().hashCode());
        hashCode = prime * hashCode + ((getHistorySummary() == null) ? 0 : getHistorySummary().hashCode());
        hashCode = prime * hashCode + ((getHistoryData() == null) ? 0 : getHistoryData().hashCode());
        hashCode = prime * hashCode + ((getAlarmContributorAttributes() == null) ? 0 : getAlarmContributorAttributes().hashCode());
        return hashCode;
    }

    @Override
    public AlarmHistoryItem clone() {
        try {
            return (AlarmHistoryItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatch.model.transform.AlarmHistoryItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
