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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListEksAnywhereSubscriptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEksAnywhereSubscriptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of cluster results returned by ListEksAnywhereSubscriptions in paginated output. When you use
     * this parameter, ListEksAnywhereSubscriptions returns only maxResults results in a single page along with a
     * nextToken response element. You can see the remaining results of the initial request by sending another
     * ListEksAnywhereSubscriptions request with the returned nextToken value. This value can be between 1 and 100. If
     * you don't use this parameter, ListEksAnywhereSubscriptions returns up to 10 results and a nextToken value if
     * applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     * ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page of
     * results. This value is null when there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of subscription statuses to filter on.
     * </p>
     */
    private java.util.List<String> includeStatus;

    /**
     * <p>
     * The maximum number of cluster results returned by ListEksAnywhereSubscriptions in paginated output. When you use
     * this parameter, ListEksAnywhereSubscriptions returns only maxResults results in a single page along with a
     * nextToken response element. You can see the remaining results of the initial request by sending another
     * ListEksAnywhereSubscriptions request with the returned nextToken value. This value can be between 1 and 100. If
     * you don't use this parameter, ListEksAnywhereSubscriptions returns up to 10 results and a nextToken value if
     * applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of cluster results returned by ListEksAnywhereSubscriptions in paginated output. When
     *        you use this parameter, ListEksAnywhereSubscriptions returns only maxResults results in a single page
     *        along with a nextToken response element. You can see the remaining results of the initial request by
     *        sending another ListEksAnywhereSubscriptions request with the returned nextToken value. This value can be
     *        between 1 and 100. If you don't use this parameter, ListEksAnywhereSubscriptions returns up to 10 results
     *        and a nextToken value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by ListEksAnywhereSubscriptions in paginated output. When you use
     * this parameter, ListEksAnywhereSubscriptions returns only maxResults results in a single page along with a
     * nextToken response element. You can see the remaining results of the initial request by sending another
     * ListEksAnywhereSubscriptions request with the returned nextToken value. This value can be between 1 and 100. If
     * you don't use this parameter, ListEksAnywhereSubscriptions returns up to 10 results and a nextToken value if
     * applicable.
     * </p>
     * 
     * @return The maximum number of cluster results returned by ListEksAnywhereSubscriptions in paginated output. When
     *         you use this parameter, ListEksAnywhereSubscriptions returns only maxResults results in a single page
     *         along with a nextToken response element. You can see the remaining results of the initial request by
     *         sending another ListEksAnywhereSubscriptions request with the returned nextToken value. This value can be
     *         between 1 and 100. If you don't use this parameter, ListEksAnywhereSubscriptions returns up to 10 results
     *         and a nextToken value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by ListEksAnywhereSubscriptions in paginated output. When you use
     * this parameter, ListEksAnywhereSubscriptions returns only maxResults results in a single page along with a
     * nextToken response element. You can see the remaining results of the initial request by sending another
     * ListEksAnywhereSubscriptions request with the returned nextToken value. This value can be between 1 and 100. If
     * you don't use this parameter, ListEksAnywhereSubscriptions returns up to 10 results and a nextToken value if
     * applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of cluster results returned by ListEksAnywhereSubscriptions in paginated output. When
     *        you use this parameter, ListEksAnywhereSubscriptions returns only maxResults results in a single page
     *        along with a nextToken response element. You can see the remaining results of the initial request by
     *        sending another ListEksAnywhereSubscriptions request with the returned nextToken value. This value can be
     *        between 1 and 100. If you don't use this parameter, ListEksAnywhereSubscriptions returns up to 10 results
     *        and a nextToken value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEksAnywhereSubscriptionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     * ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page of
     * results. This value is null when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     *        ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page
     *        of results. This value is null when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     * ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page of
     * results. This value is null when there are no more results to return.
     * </p>
     * 
     * @return The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     *         ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page
     *         of results. This value is null when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     * ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page of
     * results. This value is null when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     *        ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page
     *        of results. This value is null when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEksAnywhereSubscriptionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of subscription statuses to filter on.
     * </p>
     * 
     * @return An array of subscription statuses to filter on.
     * @see EksAnywhereSubscriptionStatus
     */

    public java.util.List<String> getIncludeStatus() {
        return includeStatus;
    }

    /**
     * <p>
     * An array of subscription statuses to filter on.
     * </p>
     * 
     * @param includeStatus
     *        An array of subscription statuses to filter on.
     * @see EksAnywhereSubscriptionStatus
     */

    public void setIncludeStatus(java.util.Collection<String> includeStatus) {
        if (includeStatus == null) {
            this.includeStatus = null;
            return;
        }

        this.includeStatus = new java.util.ArrayList<String>(includeStatus);
    }

    /**
     * <p>
     * An array of subscription statuses to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeStatus(java.util.Collection)} or {@link #withIncludeStatus(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param includeStatus
     *        An array of subscription statuses to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EksAnywhereSubscriptionStatus
     */

    public ListEksAnywhereSubscriptionsRequest withIncludeStatus(String... includeStatus) {
        if (this.includeStatus == null) {
            setIncludeStatus(new java.util.ArrayList<String>(includeStatus.length));
        }
        for (String ele : includeStatus) {
            this.includeStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of subscription statuses to filter on.
     * </p>
     * 
     * @param includeStatus
     *        An array of subscription statuses to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EksAnywhereSubscriptionStatus
     */

    public ListEksAnywhereSubscriptionsRequest withIncludeStatus(java.util.Collection<String> includeStatus) {
        setIncludeStatus(includeStatus);
        return this;
    }

    /**
     * <p>
     * An array of subscription statuses to filter on.
     * </p>
     * 
     * @param includeStatus
     *        An array of subscription statuses to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EksAnywhereSubscriptionStatus
     */

    public ListEksAnywhereSubscriptionsRequest withIncludeStatus(EksAnywhereSubscriptionStatus... includeStatus) {
        java.util.ArrayList<String> includeStatusCopy = new java.util.ArrayList<String>(includeStatus.length);
        for (EksAnywhereSubscriptionStatus value : includeStatus) {
            includeStatusCopy.add(value.toString());
        }
        if (getIncludeStatus() == null) {
            setIncludeStatus(includeStatusCopy);
        } else {
            getIncludeStatus().addAll(includeStatusCopy);
        }
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getIncludeStatus() != null)
            sb.append("IncludeStatus: ").append(getIncludeStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEksAnywhereSubscriptionsRequest == false)
            return false;
        ListEksAnywhereSubscriptionsRequest other = (ListEksAnywhereSubscriptionsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getIncludeStatus() == null ^ this.getIncludeStatus() == null)
            return false;
        if (other.getIncludeStatus() != null && other.getIncludeStatus().equals(this.getIncludeStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getIncludeStatus() == null) ? 0 : getIncludeStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListEksAnywhereSubscriptionsRequest clone() {
        return (ListEksAnywhereSubscriptionsRequest) super.clone();
    }

}
