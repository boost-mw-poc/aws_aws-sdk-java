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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a ListScrapers operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListScrapers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScrapersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of scraper filters.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> filters;
    /**
     * <p>
     * Pagination token to request the next page in a paginated list. This token is obtained from the output of the
     * previous ListScrapers request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum results to return in response (default=100, maximum=1000).
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A list of scraper filters.
     * </p>
     * 
     * @return A list of scraper filters.
     */

    public java.util.Map<String, java.util.List<String>> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of scraper filters.
     * </p>
     * 
     * @param filters
     *        A list of scraper filters.
     */

    public void setFilters(java.util.Map<String, java.util.List<String>> filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A list of scraper filters.
     * </p>
     * 
     * @param filters
     *        A list of scraper filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScrapersRequest withFilters(java.util.Map<String, java.util.List<String>> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * Add a single Filters entry
     *
     * @see ListScrapersRequest#withFilters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListScrapersRequest addFiltersEntry(String key, java.util.List<String> value) {
        if (null == this.filters) {
            this.filters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.filters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScrapersRequest clearFiltersEntries() {
        this.filters = null;
        return this;
    }

    /**
     * <p>
     * Pagination token to request the next page in a paginated list. This token is obtained from the output of the
     * previous ListScrapers request.
     * </p>
     * 
     * @param nextToken
     *        Pagination token to request the next page in a paginated list. This token is obtained from the output of
     *        the previous ListScrapers request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token to request the next page in a paginated list. This token is obtained from the output of the
     * previous ListScrapers request.
     * </p>
     * 
     * @return Pagination token to request the next page in a paginated list. This token is obtained from the output of
     *         the previous ListScrapers request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token to request the next page in a paginated list. This token is obtained from the output of the
     * previous ListScrapers request.
     * </p>
     * 
     * @param nextToken
     *        Pagination token to request the next page in a paginated list. This token is obtained from the output of
     *        the previous ListScrapers request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScrapersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum results to return in response (default=100, maximum=1000).
     * </p>
     * 
     * @param maxResults
     *        Maximum results to return in response (default=100, maximum=1000).
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum results to return in response (default=100, maximum=1000).
     * </p>
     * 
     * @return Maximum results to return in response (default=100, maximum=1000).
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum results to return in response (default=100, maximum=1000).
     * </p>
     * 
     * @param maxResults
     *        Maximum results to return in response (default=100, maximum=1000).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScrapersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListScrapersRequest == false)
            return false;
        ListScrapersRequest other = (ListScrapersRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListScrapersRequest clone() {
        return (ListScrapersRequest) super.clone();
    }

}
