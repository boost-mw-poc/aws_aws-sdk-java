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

/**
 * <p>
 * Represents the output of a CreateScraper operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateScraper" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScraperResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The generated ID of the scraper that was just created.
     * </p>
     */
    private String scraperId;
    /**
     * <p>
     * The ARN of the scraper that was just created.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the scraper that was just created (usually CREATING).
     * </p>
     */
    private ScraperStatus status;
    /**
     * <p>
     * The tags of this scraper.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The generated ID of the scraper that was just created.
     * </p>
     * 
     * @param scraperId
     *        The generated ID of the scraper that was just created.
     */

    public void setScraperId(String scraperId) {
        this.scraperId = scraperId;
    }

    /**
     * <p>
     * The generated ID of the scraper that was just created.
     * </p>
     * 
     * @return The generated ID of the scraper that was just created.
     */

    public String getScraperId() {
        return this.scraperId;
    }

    /**
     * <p>
     * The generated ID of the scraper that was just created.
     * </p>
     * 
     * @param scraperId
     *        The generated ID of the scraper that was just created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperResult withScraperId(String scraperId) {
        setScraperId(scraperId);
        return this;
    }

    /**
     * <p>
     * The ARN of the scraper that was just created.
     * </p>
     * 
     * @param arn
     *        The ARN of the scraper that was just created.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the scraper that was just created.
     * </p>
     * 
     * @return The ARN of the scraper that was just created.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the scraper that was just created.
     * </p>
     * 
     * @param arn
     *        The ARN of the scraper that was just created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the scraper that was just created (usually CREATING).
     * </p>
     * 
     * @param status
     *        The status of the scraper that was just created (usually CREATING).
     */

    public void setStatus(ScraperStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the scraper that was just created (usually CREATING).
     * </p>
     * 
     * @return The status of the scraper that was just created (usually CREATING).
     */

    public ScraperStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the scraper that was just created (usually CREATING).
     * </p>
     * 
     * @param status
     *        The status of the scraper that was just created (usually CREATING).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperResult withStatus(ScraperStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The tags of this scraper.
     * </p>
     * 
     * @return The tags of this scraper.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of this scraper.
     * </p>
     * 
     * @param tags
     *        The tags of this scraper.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of this scraper.
     * </p>
     * 
     * @param tags
     *        The tags of this scraper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateScraperResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperResult clearTagsEntries() {
        this.tags = null;
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
        if (getScraperId() != null)
            sb.append("ScraperId: ").append(getScraperId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateScraperResult == false)
            return false;
        CreateScraperResult other = (CreateScraperResult) obj;
        if (other.getScraperId() == null ^ this.getScraperId() == null)
            return false;
        if (other.getScraperId() != null && other.getScraperId().equals(this.getScraperId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScraperId() == null) ? 0 : getScraperId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateScraperResult clone() {
        try {
            return (CreateScraperResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
