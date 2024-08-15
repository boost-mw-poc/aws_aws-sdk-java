/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Request object for listing Amazon S3 buckets owned by a user.
 */
public class ListBucketsPaginatedRequest extends AmazonWebServiceRequest implements
                                                                         Serializable, S3AccelerateUnsupported {

    private Integer maxBuckets;
    private String continuationToken;

    /**
     * Returns the maximum number of buckets configured. When the number is more than the count of buckets that
     * are owned by an AWS account, return all the buckets in response.
     */
    public Integer getMaxBuckets() {
        return maxBuckets;
    }

    /**
     * Sets the maximum number of buckets to be returned in response. When the number is more than the count of buckets that
     * are owned by an AWS account, return all the buckets in response.
     *
     * @param maxBuckets The new maxBuckets value.
     * @return This object for method chaining.
     */
    public ListBucketsPaginatedRequest withMaxBuckets(Integer maxBuckets) {
        this.maxBuckets = maxBuckets;
        return this;
    }

    /**
     * Sets the maximum number of buckets to be returned in response. When the number is more than the count of buckets that
     * are owned by an AWS account, return all the buckets in response.
     *
     * @param maxBuckets The new maxBuckets value.
     */
    public void setMaxBuckets(Integer maxBuckets) {
        this.maxBuckets = maxBuckets;
    }

    /**
     * Returns the ContinuationToken. ContinuationToken indicates to Amazon S3 that the list is being continued on this bucket
     * with a token.
     */
    public String getContinuationToken() {
        return continuationToken;
    }

    /**
     * Sets the ContinuationToken. ContinuationToken indicates to Amazon S3 that the list is being continued on this bucket
     * with a token.
     * <p>
     * ContinuationToken is obfuscated and is not a real key. You can use this ContinuationToken for pagination of the list
     * results.
     *
     * @param continuationToken The new ContinuationToken value.
     * @return This object for method chaining.
     */
    public ListBucketsPaginatedRequest withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Sets the ContinuationToken. ContinuationToken indicates to Amazon S3 that the list is being continued on this bucket
     * with a token.
     * <p>
     * ContinuationToken is obfuscated and is not a real key. You can use this ContinuationToken for pagination of the list
     * results.
     *
     * @param continuationToken The new ContinuationToken value.
     */
    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

}
