/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PutStorageConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutStorageConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of storage that you specified for your data. The storage type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and saves a
     * copy of your raw data and metadata in an Amazon S3 object that you specified.
     * </p>
     * </li>
     * </ul>
     */
    private String storageType;
    /**
     * <p>
     * Identifies a storage destination. If you specified <code>MULTI_LAYER_STORAGE</code> for the storage type, you
     * must specify a <code>MultiLayerStorage</code> object.
     * </p>
     */
    private MultiLayerStorage multiLayerStorage;
    /**
     * <p>
     * Contains the storage configuration for time series (data streams) that aren't associated with asset properties.
     * The <code>disassociatedDataStorage</code> can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     * </p>
     * <important>
     * <p>
     * After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with asset
     * properties.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the <i>IoT
     * SiteWise User Guide</i>.
     * </p>
     */
    private String disassociatedDataStorage;

    /**
     * <p>
     * The type of storage that you specified for your data. The storage type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and saves a
     * copy of your raw data and metadata in an Amazon S3 object that you specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageType
     *        The type of storage that you specified for your data. The storage type can be one of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and
     *        saves a copy of your raw data and metadata in an Amazon S3 object that you specified.
     *        </p>
     *        </li>
     * @see StorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The type of storage that you specified for your data. The storage type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and saves a
     * copy of your raw data and metadata in an Amazon S3 object that you specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of storage that you specified for your data. The storage type can be one of the following
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed
     *         database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and
     *         saves a copy of your raw data and metadata in an Amazon S3 object that you specified.
     *         </p>
     *         </li>
     * @see StorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The type of storage that you specified for your data. The storage type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and saves a
     * copy of your raw data and metadata in an Amazon S3 object that you specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageType
     *        The type of storage that you specified for your data. The storage type can be one of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and
     *        saves a copy of your raw data and metadata in an Amazon S3 object that you specified.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public PutStorageConfigurationRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The type of storage that you specified for your data. The storage type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and saves a
     * copy of your raw data and metadata in an Amazon S3 object that you specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageType
     *        The type of storage that you specified for your data. The storage type can be one of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SITEWISE_DEFAULT_STORAGE</code> – IoT SiteWise replicates your data into a service managed database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTI_LAYER_STORAGE</code> – IoT SiteWise replicates your data into a service managed database and
     *        saves a copy of your raw data and metadata in an Amazon S3 object that you specified.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public PutStorageConfigurationRequest withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
        return this;
    }

    /**
     * <p>
     * Identifies a storage destination. If you specified <code>MULTI_LAYER_STORAGE</code> for the storage type, you
     * must specify a <code>MultiLayerStorage</code> object.
     * </p>
     * 
     * @param multiLayerStorage
     *        Identifies a storage destination. If you specified <code>MULTI_LAYER_STORAGE</code> for the storage type,
     *        you must specify a <code>MultiLayerStorage</code> object.
     */

    public void setMultiLayerStorage(MultiLayerStorage multiLayerStorage) {
        this.multiLayerStorage = multiLayerStorage;
    }

    /**
     * <p>
     * Identifies a storage destination. If you specified <code>MULTI_LAYER_STORAGE</code> for the storage type, you
     * must specify a <code>MultiLayerStorage</code> object.
     * </p>
     * 
     * @return Identifies a storage destination. If you specified <code>MULTI_LAYER_STORAGE</code> for the storage type,
     *         you must specify a <code>MultiLayerStorage</code> object.
     */

    public MultiLayerStorage getMultiLayerStorage() {
        return this.multiLayerStorage;
    }

    /**
     * <p>
     * Identifies a storage destination. If you specified <code>MULTI_LAYER_STORAGE</code> for the storage type, you
     * must specify a <code>MultiLayerStorage</code> object.
     * </p>
     * 
     * @param multiLayerStorage
     *        Identifies a storage destination. If you specified <code>MULTI_LAYER_STORAGE</code> for the storage type,
     *        you must specify a <code>MultiLayerStorage</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStorageConfigurationRequest withMultiLayerStorage(MultiLayerStorage multiLayerStorage) {
        setMultiLayerStorage(multiLayerStorage);
        return this;
    }

    /**
     * <p>
     * Contains the storage configuration for time series (data streams) that aren't associated with asset properties.
     * The <code>disassociatedDataStorage</code> can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     * </p>
     * <important>
     * <p>
     * After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with asset
     * properties.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the <i>IoT
     * SiteWise User Guide</i>.
     * </p>
     * 
     * @param disassociatedDataStorage
     *        Contains the storage configuration for time series (data streams) that aren't associated with asset
     *        properties. The <code>disassociatedDataStorage</code> can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     *        </p>
     *        <important>
     *        <p>
     *        After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with
     *        asset properties.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the
     *        <i>IoT SiteWise User Guide</i>.
     * @see DisassociatedDataStorageState
     */

    public void setDisassociatedDataStorage(String disassociatedDataStorage) {
        this.disassociatedDataStorage = disassociatedDataStorage;
    }

    /**
     * <p>
     * Contains the storage configuration for time series (data streams) that aren't associated with asset properties.
     * The <code>disassociatedDataStorage</code> can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     * </p>
     * <important>
     * <p>
     * After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with asset
     * properties.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the <i>IoT
     * SiteWise User Guide</i>.
     * </p>
     * 
     * @return Contains the storage configuration for time series (data streams) that aren't associated with asset
     *         properties. The <code>disassociatedDataStorage</code> can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     *         </p>
     *         <important>
     *         <p>
     *         After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated
     *         with asset properties.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in
     *         the <i>IoT SiteWise User Guide</i>.
     * @see DisassociatedDataStorageState
     */

    public String getDisassociatedDataStorage() {
        return this.disassociatedDataStorage;
    }

    /**
     * <p>
     * Contains the storage configuration for time series (data streams) that aren't associated with asset properties.
     * The <code>disassociatedDataStorage</code> can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     * </p>
     * <important>
     * <p>
     * After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with asset
     * properties.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the <i>IoT
     * SiteWise User Guide</i>.
     * </p>
     * 
     * @param disassociatedDataStorage
     *        Contains the storage configuration for time series (data streams) that aren't associated with asset
     *        properties. The <code>disassociatedDataStorage</code> can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     *        </p>
     *        <important>
     *        <p>
     *        After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with
     *        asset properties.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the
     *        <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DisassociatedDataStorageState
     */

    public PutStorageConfigurationRequest withDisassociatedDataStorage(String disassociatedDataStorage) {
        setDisassociatedDataStorage(disassociatedDataStorage);
        return this;
    }

    /**
     * <p>
     * Contains the storage configuration for time series (data streams) that aren't associated with asset properties.
     * The <code>disassociatedDataStorage</code> can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     * </p>
     * <important>
     * <p>
     * After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with asset
     * properties.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the <i>IoT
     * SiteWise User Guide</i>.
     * </p>
     * 
     * @param disassociatedDataStorage
     *        Contains the storage configuration for time series (data streams) that aren't associated with asset
     *        properties. The <code>disassociatedDataStorage</code> can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – IoT SiteWise accepts time series that aren't associated with asset properties.
     *        </p>
     *        <important>
     *        <p>
     *        After the <code>disassociatedDataStorage</code> is enabled, you can't disable it.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – IoT SiteWise doesn't accept time series (data streams) that aren't associated with
     *        asset properties.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-streams.html">Data streams</a> in the
     *        <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DisassociatedDataStorageState
     */

    public PutStorageConfigurationRequest withDisassociatedDataStorage(DisassociatedDataStorageState disassociatedDataStorage) {
        this.disassociatedDataStorage = disassociatedDataStorage.toString();
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
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getMultiLayerStorage() != null)
            sb.append("MultiLayerStorage: ").append(getMultiLayerStorage()).append(",");
        if (getDisassociatedDataStorage() != null)
            sb.append("DisassociatedDataStorage: ").append(getDisassociatedDataStorage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutStorageConfigurationRequest == false)
            return false;
        PutStorageConfigurationRequest other = (PutStorageConfigurationRequest) obj;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getMultiLayerStorage() == null ^ this.getMultiLayerStorage() == null)
            return false;
        if (other.getMultiLayerStorage() != null && other.getMultiLayerStorage().equals(this.getMultiLayerStorage()) == false)
            return false;
        if (other.getDisassociatedDataStorage() == null ^ this.getDisassociatedDataStorage() == null)
            return false;
        if (other.getDisassociatedDataStorage() != null && other.getDisassociatedDataStorage().equals(this.getDisassociatedDataStorage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getMultiLayerStorage() == null) ? 0 : getMultiLayerStorage().hashCode());
        hashCode = prime * hashCode + ((getDisassociatedDataStorage() == null) ? 0 : getDisassociatedDataStorage().hashCode());
        return hashCode;
    }

    @Override
    public PutStorageConfigurationRequest clone() {
        return (PutStorageConfigurationRequest) super.clone();
    }

}
