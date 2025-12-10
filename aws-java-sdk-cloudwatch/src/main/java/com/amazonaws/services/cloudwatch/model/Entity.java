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
 * An entity associated with metrics, to allow for finding related telemetry. An entity is typically a resource or
 * service within your system. For example, metrics from an Amazon EC2 instance could be associated with that instance
 * as the entity. Similarly, metrics from a service that you own could be associated with that service as the entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/Entity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Entity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attributes of the entity which identify the specific entity, as a list of key-value pairs. Entities with the
     * same <code>KeyAttributes</code> are considered to be the same entity. For an entity to be valid, the
     * <code>KeyAttributes</code> must exist and be formatted correctly.
     * </p>
     * <p>
     * There are five allowed attributes (key names): <code>Type</code>, <code>ResourceType</code>,
     * <code>Identifier</code>, <code>Name</code>, and <code>Environment</code>.
     * </p>
     * <p>
     * For details about how to use the key attributes to specify an entity, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> keyAttributes;
    /**
     * <p>
     * Additional attributes of the entity that are not used to specify the identity of the entity. A list of key-value
     * pairs.
     * </p>
     * <p>
     * For details about how to use the attributes, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The attributes of the entity which identify the specific entity, as a list of key-value pairs. Entities with the
     * same <code>KeyAttributes</code> are considered to be the same entity. For an entity to be valid, the
     * <code>KeyAttributes</code> must exist and be formatted correctly.
     * </p>
     * <p>
     * There are five allowed attributes (key names): <code>Type</code>, <code>ResourceType</code>,
     * <code>Identifier</code>, <code>Name</code>, and <code>Environment</code>.
     * </p>
     * <p>
     * For details about how to use the key attributes to specify an entity, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return The attributes of the entity which identify the specific entity, as a list of key-value pairs. Entities
     *         with the same <code>KeyAttributes</code> are considered to be the same entity. For an entity to be valid,
     *         the <code>KeyAttributes</code> must exist and be formatted correctly.</p>
     *         <p>
     *         There are five allowed attributes (key names): <code>Type</code>, <code>ResourceType</code>,
     *         <code>Identifier</code>, <code>Name</code>, and <code>Environment</code>.
     *         </p>
     *         <p>
     *         For details about how to use the key attributes to specify an entity, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html"
     *         >How to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     */

    public java.util.Map<String, String> getKeyAttributes() {
        return keyAttributes;
    }

    /**
     * <p>
     * The attributes of the entity which identify the specific entity, as a list of key-value pairs. Entities with the
     * same <code>KeyAttributes</code> are considered to be the same entity. For an entity to be valid, the
     * <code>KeyAttributes</code> must exist and be formatted correctly.
     * </p>
     * <p>
     * There are five allowed attributes (key names): <code>Type</code>, <code>ResourceType</code>,
     * <code>Identifier</code>, <code>Name</code>, and <code>Environment</code>.
     * </p>
     * <p>
     * For details about how to use the key attributes to specify an entity, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param keyAttributes
     *        The attributes of the entity which identify the specific entity, as a list of key-value pairs. Entities
     *        with the same <code>KeyAttributes</code> are considered to be the same entity. For an entity to be valid,
     *        the <code>KeyAttributes</code> must exist and be formatted correctly.</p>
     *        <p>
     *        There are five allowed attributes (key names): <code>Type</code>, <code>ResourceType</code>,
     *        <code>Identifier</code>, <code>Name</code>, and <code>Environment</code>.
     *        </p>
     *        <p>
     *        For details about how to use the key attributes to specify an entity, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html"
     *        >How to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     */

    public void setKeyAttributes(java.util.Map<String, String> keyAttributes) {
        this.keyAttributes = keyAttributes;
    }

    /**
     * <p>
     * The attributes of the entity which identify the specific entity, as a list of key-value pairs. Entities with the
     * same <code>KeyAttributes</code> are considered to be the same entity. For an entity to be valid, the
     * <code>KeyAttributes</code> must exist and be formatted correctly.
     * </p>
     * <p>
     * There are five allowed attributes (key names): <code>Type</code>, <code>ResourceType</code>,
     * <code>Identifier</code>, <code>Name</code>, and <code>Environment</code>.
     * </p>
     * <p>
     * For details about how to use the key attributes to specify an entity, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param keyAttributes
     *        The attributes of the entity which identify the specific entity, as a list of key-value pairs. Entities
     *        with the same <code>KeyAttributes</code> are considered to be the same entity. For an entity to be valid,
     *        the <code>KeyAttributes</code> must exist and be formatted correctly.</p>
     *        <p>
     *        There are five allowed attributes (key names): <code>Type</code>, <code>ResourceType</code>,
     *        <code>Identifier</code>, <code>Name</code>, and <code>Environment</code>.
     *        </p>
     *        <p>
     *        For details about how to use the key attributes to specify an entity, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html"
     *        >How to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withKeyAttributes(java.util.Map<String, String> keyAttributes) {
        setKeyAttributes(keyAttributes);
        return this;
    }

    /**
     * Add a single KeyAttributes entry
     *
     * @see Entity#withKeyAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Entity addKeyAttributesEntry(String key, String value) {
        if (null == this.keyAttributes) {
            this.keyAttributes = new java.util.HashMap<String, String>();
        }
        if (this.keyAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.keyAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into KeyAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity clearKeyAttributesEntries() {
        this.keyAttributes = null;
        return this;
    }

    /**
     * <p>
     * Additional attributes of the entity that are not used to specify the identity of the entity. A list of key-value
     * pairs.
     * </p>
     * <p>
     * For details about how to use the attributes, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return Additional attributes of the entity that are not used to specify the identity of the entity. A list of
     *         key-value pairs.</p>
     *         <p>
     *         For details about how to use the attributes, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html"
     *         >How to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Additional attributes of the entity that are not used to specify the identity of the entity. A list of key-value
     * pairs.
     * </p>
     * <p>
     * For details about how to use the attributes, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param attributes
     *        Additional attributes of the entity that are not used to specify the identity of the entity. A list of
     *        key-value pairs.</p>
     *        <p>
     *        For details about how to use the attributes, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html"
     *        >How to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Additional attributes of the entity that are not used to specify the identity of the entity. A list of key-value
     * pairs.
     * </p>
     * <p>
     * For details about how to use the attributes, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html">How
     * to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param attributes
     *        Additional attributes of the entity that are not used to specify the identity of the entity. A list of
     *        key-value pairs.</p>
     *        <p>
     *        For details about how to use the attributes, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/adding-your-own-related-telemetry.html"
     *        >How to add related information to telemetry</a> in the <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see Entity#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Entity addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity clearAttributesEntries() {
        this.attributes = null;
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
        if (getKeyAttributes() != null)
            sb.append("KeyAttributes: ").append(getKeyAttributes()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Entity == false)
            return false;
        Entity other = (Entity) obj;
        if (other.getKeyAttributes() == null ^ this.getKeyAttributes() == null)
            return false;
        if (other.getKeyAttributes() != null && other.getKeyAttributes().equals(this.getKeyAttributes()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyAttributes() == null) ? 0 : getKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public Entity clone() {
        try {
            return (Entity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatch.model.transform.EntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
