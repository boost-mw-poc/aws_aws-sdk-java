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
package com.amazonaws.services.chimesdkmediapipelines;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmediapipelines.model.*;

/**
 * Interface for accessing Amazon Chime SDK Media Pipelines asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkmediapipelines.AbstractAmazonChimeSDKMediaPipelinesAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Chime SDK media pipeline APIs in this section allow software developers to create Amazon Chime SDK media
 * pipelines that capture, concatenate, or stream your Amazon Chime SDK meetings. For more information about media
 * pipelines, see <a href=
 * "https://docs.aws.amazon.com/chime-sdk/latest/APIReference/API_Operations_Amazon_Chime_SDK_Media_Pipelines.html"
 * >Amazon Chime SDK media pipelines</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonChimeSDKMediaPipelinesAsync extends AmazonChimeSDKMediaPipelines {

    /**
     * <p>
     * Creates a media pipeline.
     * </p>
     * 
     * @param createMediaCapturePipelineRequest
     * @return A Java Future containing the result of the CreateMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaCapturePipelineResult> createMediaCapturePipelineAsync(
            CreateMediaCapturePipelineRequest createMediaCapturePipelineRequest);

    /**
     * <p>
     * Creates a media pipeline.
     * </p>
     * 
     * @param createMediaCapturePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaCapturePipelineResult> createMediaCapturePipelineAsync(
            CreateMediaCapturePipelineRequest createMediaCapturePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaCapturePipelineRequest, CreateMediaCapturePipelineResult> asyncHandler);

    /**
     * <p>
     * Creates a media concatenation pipeline.
     * </p>
     * 
     * @param createMediaConcatenationPipelineRequest
     * @return A Java Future containing the result of the CreateMediaConcatenationPipeline operation returned by the
     *         service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaConcatenationPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaConcatenationPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaConcatenationPipelineResult> createMediaConcatenationPipelineAsync(
            CreateMediaConcatenationPipelineRequest createMediaConcatenationPipelineRequest);

    /**
     * <p>
     * Creates a media concatenation pipeline.
     * </p>
     * 
     * @param createMediaConcatenationPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaConcatenationPipeline operation returned by the
     *         service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaConcatenationPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaConcatenationPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaConcatenationPipelineResult> createMediaConcatenationPipelineAsync(
            CreateMediaConcatenationPipelineRequest createMediaConcatenationPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaConcatenationPipelineRequest, CreateMediaConcatenationPipelineResult> asyncHandler);

    /**
     * <p>
     * Creates a media insights pipeline.
     * </p>
     * 
     * @param createMediaInsightsPipelineRequest
     * @return A Java Future containing the result of the CreateMediaInsightsPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaInsightsPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaInsightsPipelineResult> createMediaInsightsPipelineAsync(
            CreateMediaInsightsPipelineRequest createMediaInsightsPipelineRequest);

    /**
     * <p>
     * Creates a media insights pipeline.
     * </p>
     * 
     * @param createMediaInsightsPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaInsightsPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaInsightsPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaInsightsPipelineResult> createMediaInsightsPipelineAsync(
            CreateMediaInsightsPipelineRequest createMediaInsightsPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaInsightsPipelineRequest, CreateMediaInsightsPipelineResult> asyncHandler);

    /**
     * <p>
     * A structure that contains the static configurations for a media insights pipeline.
     * </p>
     * 
     * @param createMediaInsightsPipelineConfigurationRequest
     * @return A Java Future containing the result of the CreateMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaInsightsPipelineConfigurationResult> createMediaInsightsPipelineConfigurationAsync(
            CreateMediaInsightsPipelineConfigurationRequest createMediaInsightsPipelineConfigurationRequest);

    /**
     * <p>
     * A structure that contains the static configurations for a media insights pipeline.
     * </p>
     * 
     * @param createMediaInsightsPipelineConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaInsightsPipelineConfigurationResult> createMediaInsightsPipelineConfigurationAsync(
            CreateMediaInsightsPipelineConfigurationRequest createMediaInsightsPipelineConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaInsightsPipelineConfigurationRequest, CreateMediaInsightsPipelineConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a media live connector pipeline in an Amazon Chime SDK meeting.
     * </p>
     * 
     * @param createMediaLiveConnectorPipelineRequest
     * @return A Java Future containing the result of the CreateMediaLiveConnectorPipeline operation returned by the
     *         service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaLiveConnectorPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaLiveConnectorPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaLiveConnectorPipelineResult> createMediaLiveConnectorPipelineAsync(
            CreateMediaLiveConnectorPipelineRequest createMediaLiveConnectorPipelineRequest);

    /**
     * <p>
     * Creates a media live connector pipeline in an Amazon Chime SDK meeting.
     * </p>
     * 
     * @param createMediaLiveConnectorPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaLiveConnectorPipeline operation returned by the
     *         service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaLiveConnectorPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaLiveConnectorPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaLiveConnectorPipelineResult> createMediaLiveConnectorPipelineAsync(
            CreateMediaLiveConnectorPipelineRequest createMediaLiveConnectorPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaLiveConnectorPipelineRequest, CreateMediaLiveConnectorPipelineResult> asyncHandler);

    /**
     * <p>
     * Deletes the media pipeline.
     * </p>
     * 
     * @param deleteMediaCapturePipelineRequest
     * @return A Java Future containing the result of the DeleteMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.DeleteMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaCapturePipelineResult> deleteMediaCapturePipelineAsync(
            DeleteMediaCapturePipelineRequest deleteMediaCapturePipelineRequest);

    /**
     * <p>
     * Deletes the media pipeline.
     * </p>
     * 
     * @param deleteMediaCapturePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.DeleteMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaCapturePipelineResult> deleteMediaCapturePipelineAsync(
            DeleteMediaCapturePipelineRequest deleteMediaCapturePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMediaCapturePipelineRequest, DeleteMediaCapturePipelineResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified configuration settings.
     * </p>
     * 
     * @param deleteMediaInsightsPipelineConfigurationRequest
     * @return A Java Future containing the result of the DeleteMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.DeleteMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaInsightsPipelineConfigurationResult> deleteMediaInsightsPipelineConfigurationAsync(
            DeleteMediaInsightsPipelineConfigurationRequest deleteMediaInsightsPipelineConfigurationRequest);

    /**
     * <p>
     * Deletes the specified configuration settings.
     * </p>
     * 
     * @param deleteMediaInsightsPipelineConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.DeleteMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaInsightsPipelineConfigurationResult> deleteMediaInsightsPipelineConfigurationAsync(
            DeleteMediaInsightsPipelineConfigurationRequest deleteMediaInsightsPipelineConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMediaInsightsPipelineConfigurationRequest, DeleteMediaInsightsPipelineConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the media pipeline.
     * </p>
     * 
     * @param deleteMediaPipelineRequest
     * @return A Java Future containing the result of the DeleteMediaPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.DeleteMediaPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaPipelineResult> deleteMediaPipelineAsync(DeleteMediaPipelineRequest deleteMediaPipelineRequest);

    /**
     * <p>
     * Deletes the media pipeline.
     * </p>
     * 
     * @param deleteMediaPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMediaPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.DeleteMediaPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaPipelineResult> deleteMediaPipelineAsync(DeleteMediaPipelineRequest deleteMediaPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMediaPipelineRequest, DeleteMediaPipelineResult> asyncHandler);

    /**
     * <p>
     * Gets an existing media pipeline.
     * </p>
     * 
     * @param getMediaCapturePipelineRequest
     * @return A Java Future containing the result of the GetMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.GetMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaCapturePipelineResult> getMediaCapturePipelineAsync(GetMediaCapturePipelineRequest getMediaCapturePipelineRequest);

    /**
     * <p>
     * Gets an existing media pipeline.
     * </p>
     * 
     * @param getMediaCapturePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.GetMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaCapturePipelineResult> getMediaCapturePipelineAsync(GetMediaCapturePipelineRequest getMediaCapturePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<GetMediaCapturePipelineRequest, GetMediaCapturePipelineResult> asyncHandler);

    /**
     * <p>
     * Gets the configuration settings for a media insights pipeline.
     * </p>
     * 
     * @param getMediaInsightsPipelineConfigurationRequest
     * @return A Java Future containing the result of the GetMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.GetMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaInsightsPipelineConfigurationResult> getMediaInsightsPipelineConfigurationAsync(
            GetMediaInsightsPipelineConfigurationRequest getMediaInsightsPipelineConfigurationRequest);

    /**
     * <p>
     * Gets the configuration settings for a media insights pipeline.
     * </p>
     * 
     * @param getMediaInsightsPipelineConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.GetMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaInsightsPipelineConfigurationResult> getMediaInsightsPipelineConfigurationAsync(
            GetMediaInsightsPipelineConfigurationRequest getMediaInsightsPipelineConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetMediaInsightsPipelineConfigurationRequest, GetMediaInsightsPipelineConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets an existing media pipeline.
     * </p>
     * 
     * @param getMediaPipelineRequest
     * @return A Java Future containing the result of the GetMediaPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.GetMediaPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaPipelineResult> getMediaPipelineAsync(GetMediaPipelineRequest getMediaPipelineRequest);

    /**
     * <p>
     * Gets an existing media pipeline.
     * </p>
     * 
     * @param getMediaPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMediaPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.GetMediaPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaPipelineResult> getMediaPipelineAsync(GetMediaPipelineRequest getMediaPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<GetMediaPipelineRequest, GetMediaPipelineResult> asyncHandler);

    /**
     * <p>
     * Returns a list of media pipelines.
     * </p>
     * 
     * @param listMediaCapturePipelinesRequest
     * @return A Java Future containing the result of the ListMediaCapturePipelines operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.ListMediaCapturePipelines
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaCapturePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaCapturePipelinesResult> listMediaCapturePipelinesAsync(
            ListMediaCapturePipelinesRequest listMediaCapturePipelinesRequest);

    /**
     * <p>
     * Returns a list of media pipelines.
     * </p>
     * 
     * @param listMediaCapturePipelinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMediaCapturePipelines operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.ListMediaCapturePipelines
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaCapturePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaCapturePipelinesResult> listMediaCapturePipelinesAsync(
            ListMediaCapturePipelinesRequest listMediaCapturePipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMediaCapturePipelinesRequest, ListMediaCapturePipelinesResult> asyncHandler);

    /**
     * <p>
     * Lists the available media insights pipeline configurations.
     * </p>
     * 
     * @param listMediaInsightsPipelineConfigurationsRequest
     * @return A Java Future containing the result of the ListMediaInsightsPipelineConfigurations operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.ListMediaInsightsPipelineConfigurations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaInsightsPipelineConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaInsightsPipelineConfigurationsResult> listMediaInsightsPipelineConfigurationsAsync(
            ListMediaInsightsPipelineConfigurationsRequest listMediaInsightsPipelineConfigurationsRequest);

    /**
     * <p>
     * Lists the available media insights pipeline configurations.
     * </p>
     * 
     * @param listMediaInsightsPipelineConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMediaInsightsPipelineConfigurations operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.ListMediaInsightsPipelineConfigurations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaInsightsPipelineConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaInsightsPipelineConfigurationsResult> listMediaInsightsPipelineConfigurationsAsync(
            ListMediaInsightsPipelineConfigurationsRequest listMediaInsightsPipelineConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMediaInsightsPipelineConfigurationsRequest, ListMediaInsightsPipelineConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of media pipelines.
     * </p>
     * 
     * @param listMediaPipelinesRequest
     * @return A Java Future containing the result of the ListMediaPipelines operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.ListMediaPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaPipelines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaPipelinesResult> listMediaPipelinesAsync(ListMediaPipelinesRequest listMediaPipelinesRequest);

    /**
     * <p>
     * Returns a list of media pipelines.
     * </p>
     * 
     * @param listMediaPipelinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMediaPipelines operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.ListMediaPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaPipelines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaPipelinesResult> listMediaPipelinesAsync(ListMediaPipelinesRequest listMediaPipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMediaPipelinesRequest, ListMediaPipelinesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags available for a media pipeline.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags available for a media pipeline.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * The ARN of the media pipeline that you want to tag. Consists of the pipeline's endpoint region, resource ID, and
     * pipeline ID.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * The ARN of the media pipeline that you want to tag. Consists of the pipeline's endpoint region, resource ID, and
     * pipeline ID.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes any tags from a media pipeline.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes any tags from a media pipeline.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the media insights pipeline's configuration settings.
     * </p>
     * 
     * @param updateMediaInsightsPipelineConfigurationRequest
     * @return A Java Future containing the result of the UpdateMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.UpdateMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMediaInsightsPipelineConfigurationResult> updateMediaInsightsPipelineConfigurationAsync(
            UpdateMediaInsightsPipelineConfigurationRequest updateMediaInsightsPipelineConfigurationRequest);

    /**
     * <p>
     * Updates the media insights pipeline's configuration settings.
     * </p>
     * 
     * @param updateMediaInsightsPipelineConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.UpdateMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMediaInsightsPipelineConfigurationResult> updateMediaInsightsPipelineConfigurationAsync(
            UpdateMediaInsightsPipelineConfigurationRequest updateMediaInsightsPipelineConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMediaInsightsPipelineConfigurationRequest, UpdateMediaInsightsPipelineConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the status of a media insights pipeline.
     * </p>
     * 
     * @param updateMediaInsightsPipelineStatusRequest
     * @return A Java Future containing the result of the UpdateMediaInsightsPipelineStatus operation returned by the
     *         service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.UpdateMediaInsightsPipelineStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMediaInsightsPipelineStatusResult> updateMediaInsightsPipelineStatusAsync(
            UpdateMediaInsightsPipelineStatusRequest updateMediaInsightsPipelineStatusRequest);

    /**
     * <p>
     * Updates the status of a media insights pipeline.
     * </p>
     * 
     * @param updateMediaInsightsPipelineStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMediaInsightsPipelineStatus operation returned by the
     *         service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.UpdateMediaInsightsPipelineStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMediaInsightsPipelineStatusResult> updateMediaInsightsPipelineStatusAsync(
            UpdateMediaInsightsPipelineStatusRequest updateMediaInsightsPipelineStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMediaInsightsPipelineStatusRequest, UpdateMediaInsightsPipelineStatusResult> asyncHandler);

}
