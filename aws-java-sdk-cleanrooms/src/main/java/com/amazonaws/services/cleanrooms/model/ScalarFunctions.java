/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ScalarFunctions {

    TRUNC("TRUNC"),
    ABS("ABS"),
    CEILING("CEILING"),
    FLOOR("FLOOR"),
    LN("LN"),
    LOG("LOG"),
    ROUND("ROUND"),
    SQRT("SQRT"),
    CAST("CAST"),
    LOWER("LOWER"),
    RTRIM("RTRIM"),
    UPPER("UPPER"),
    COALESCE("COALESCE");

    private String value;

    private ScalarFunctions(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ScalarFunctions corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ScalarFunctions fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ScalarFunctions enumEntry : ScalarFunctions.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
