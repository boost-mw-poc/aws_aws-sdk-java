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
package com.amazonaws.services.workspacesthinclient.model;

import javax.annotation.Generated;

/**
 * <p>
 * Request processing failed due to some unknown error, exception, or failure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServiceException extends com.amazonaws.services.workspacesthinclient.model.AmazonWorkSpacesThinClientException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The number of seconds to wait before retrying the next request.
     * </p>
     */
    private Integer retryAfterSeconds;

    /**
     * Constructs a new InternalServiceException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InternalServiceException(String message) {
        super(message);
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the next request.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to wait before retrying the next request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the next request.
     * </p>
     * 
     * @return The number of seconds to wait before retrying the next request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the next request.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to wait before retrying the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalServiceException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
