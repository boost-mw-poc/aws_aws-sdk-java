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
package com.amazonaws.services.controltower;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.controltower.model.*;

/**
 * Interface for accessing AWS Control Tower.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.controltower.AbstractAWSControlTower} instead.
 * </p>
 * <p>
 * <p>
 * These interfaces allow you to apply the Amazon Web Services library of pre-defined <i>controls</i> to your
 * organizational units, programmatically. In Amazon Web Services Control Tower, the terms "control" and "guardrail" are
 * synonyms.
 * </p>
 * <p>
 * To call these APIs, you'll need to know:
 * </p>
 * <ul>
 * <li>
 * <p>
 * the <code>controlIdentifier</code> for the control--or guardrail--you are targeting.
 * </p>
 * </li>
 * <li>
 * <p>
 * the ARN associated with the target organizational unit (OU), which we call the <code>targetIdentifier</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * the ARN associated with a resource that you wish to tag or untag.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>To get the <code>controlIdentifier</code> for your AWS Control Tower control:</b>
 * </p>
 * <p>
 * The <code>controlIdentifier</code> is an ARN that is specified for each control. You can view the
 * <code>controlIdentifier</code> in the console on the <b>Control details</b> page, as well as in the documentation.
 * </p>
 * <p>
 * The <code>controlIdentifier</code> is unique in each Amazon Web Services Region for each control. You can find the
 * <code>controlIdentifier</code> for each Region and control in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-metadata-tables.html">Tables of control
 * metadata</a> in the <i>Amazon Web Services Control Tower User Guide.</i>
 * </p>
 * <p>
 * A quick-reference list of control identifers for the Amazon Web Services Control Tower legacy <i>Strongly
 * recommended</i> and <i>Elective</i> controls is given in <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html.html">Resource identifiers
 * for APIs and controls</a> in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">Controls reference guide
 * section</a> of the <i>Amazon Web Services Control Tower User Guide</i>. Remember that <i>Mandatory</i> controls
 * cannot be added or removed.
 * </p>
 * <note>
 * <p>
 * <b>ARN format:</b> <code>arn:aws:controltower:{REGION}::control/{CONTROL_NAME}</code>
 * </p>
 * <p>
 * <b>Example:</b>
 * </p>
 * <p>
 * <code>arn:aws:controltower:us-west-2::control/AWS-GR_AUTOSCALING_LAUNCH_CONFIG_PUBLIC_IP_DISABLED</code>
 * </p>
 * </note>
 * <p>
 * <b>To get the <code>targetIdentifier</code>:</b>
 * </p>
 * <p>
 * The <code>targetIdentifier</code> is the ARN for an OU.
 * </p>
 * <p>
 * In the Amazon Web Services Organizations console, you can find the ARN for the OU on the <b>Organizational unit
 * details</b> page associated with that OU.
 * </p>
 * <note>
 * <p>
 * <b>OU ARN format:</b>
 * </p>
 * <p>
 * <code>arn:${Partition}:organizations::${MasterAccountId}:ou/o-${OrganizationId}/ou-${OrganizationalUnitId}</code>
 * </p>
 * </note>
 * <p class="title">
 * <b>Details and examples</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html">Control API input
 * and output examples with CLI</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/enable-controls.html">Enable controls with
 * CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-metadata-tables.html">Control metadata
 * tables</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">List of identifiers for
 * legacy controls</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls.html">Controls reference guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls-reference.html">Controls library
 * groupings</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/creating-resources-with-cloudformation.html">
 * Creating Amazon Web Services Control Tower resources with Amazon Web Services CloudFormation</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * To view the open source resource repository on GitHub, see <a
 * href="https://github.com/aws-cloudformation/aws-cloudformation-resource-providers-controltower"
 * >aws-cloudformation/aws-cloudformation-resource-providers-controltower</a>
 * </p>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * Amazon Web Services Control Tower supports Amazon Web Services CloudTrail, a service that records Amazon Web Services
 * API calls for your Amazon Web Services account and delivers log files to an Amazon S3 bucket. By using information
 * collected by CloudTrail, you can determine which requests the Amazon Web Services Control Tower service received, who
 * made the request and when, and so on. For more about Amazon Web Services Control Tower and its support for
 * CloudTrail, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/logging-using-cloudtrail.html">Logging Amazon Web
 * Services Control Tower Actions with Amazon Web Services CloudTrail</a> in the Amazon Web Services Control Tower User
 * Guide. To learn more about CloudTrail, including how to turn it on and find your log files, see the Amazon Web
 * Services CloudTrail User Guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSControlTower {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "controltower";

    /**
     * <p>
     * This decommissions a landing zone. This starts an asynchronous operation that deletes Amazon Web Services Control
     * Tower resources deployed in Amazon Web Services Control Tower managed accounts.
     * </p>
     * 
     * @param deleteLandingZoneRequest
     * @return Result of the DeleteLandingZone operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.DeleteLandingZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/DeleteLandingZone" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteLandingZoneResult deleteLandingZone(DeleteLandingZoneRequest deleteLandingZoneRequest);

    /**
     * <p>
     * This API call turns off a control. It starts an asynchronous operation that deletes Amazon Web Services resources
     * on the specified organizational unit and the accounts it contains. The resources will vary according to the
     * control that you specify. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param disableControlRequest
     * @return Result of the DisableControl operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.DisableControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/DisableControl" target="_top">AWS
     *      API Documentation</a>
     */
    DisableControlResult disableControl(DisableControlRequest disableControlRequest);

    /**
     * <p>
     * This API call activates a control. It starts an asynchronous operation that creates Amazon Web Services resources
     * on the specified organizational unit and the accounts it contains. The resources created will vary according to
     * the control that you specify. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param enableControlRequest
     * @return Result of the EnableControl operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.EnableControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnableControl" target="_top">AWS API
     *      Documentation</a>
     */
    EnableControlResult enableControl(EnableControlRequest enableControlRequest);

    /**
     * <p>
     * Returns the status of a particular <code>EnableControl</code> or <code>DisableControl</code> operation. Displays
     * a message in case of error. Details for an operation are available for 90 days. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param getControlOperationRequest
     * @return Result of the GetControlOperation operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.GetControlOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetControlOperation"
     *      target="_top">AWS API Documentation</a>
     */
    GetControlOperationResult getControlOperation(GetControlOperationRequest getControlOperationRequest);

    /**
     * <p>
     * Retrieves details about an enabled control. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param getEnabledControlRequest
     * @return Result of the GetEnabledControl operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.GetEnabledControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetEnabledControl" target="_top">AWS
     *      API Documentation</a>
     */
    GetEnabledControlResult getEnabledControl(GetEnabledControlRequest getEnabledControlRequest);

    /**
     * <p>
     * Returns the status of the specified landing zone operation. Details for an operation are available for X days.
     * </p>
     * 
     * @param getLandingZoneOperationRequest
     * @return Result of the GetLandingZoneOperation operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.GetLandingZoneOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetLandingZoneOperation"
     *      target="_top">AWS API Documentation</a>
     */
    GetLandingZoneOperationResult getLandingZoneOperation(GetLandingZoneOperationRequest getLandingZoneOperationRequest);

    /**
     * <p>
     * Lists the controls enabled by Amazon Web Services Control Tower on the specified organizational unit and the
     * accounts it contains. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param listEnabledControlsRequest
     * @return Result of the ListEnabledControls operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.ListEnabledControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListEnabledControls"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnabledControlsResult listEnabledControls(ListEnabledControlsRequest listEnabledControlsRequest);

    /**
     * <p>
     * Returns the landing zone ARN for the landing zone deployed in your managed account. This API also creates an ARN
     * for existing accounts that do not yet have a landing zone ARN.
     * </p>
     * <p>
     * The return limit is one landing zone ARN.
     * </p>
     * 
     * @param listLandingZonesRequest
     * @return Result of the ListLandingZones operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSControlTower.ListLandingZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListLandingZones" target="_top">AWS
     *      API Documentation</a>
     */
    ListLandingZonesResult listLandingZones(ListLandingZonesRequest listLandingZonesRequest);

    /**
     * <p>
     * Returns a list of tags associated with the resource. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * This API call resets a landing zone. It starts an asynchronous operation that resets the landing zone to the
     * parameters specified in its original configuration.
     * </p>
     * 
     * @param resetLandingZoneRequest
     * @return Result of the ResetLandingZone operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.ResetLandingZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ResetLandingZone" target="_top">AWS
     *      API Documentation</a>
     */
    ResetLandingZoneResult resetLandingZone(ResetLandingZoneRequest resetLandingZoneRequest);

    /**
     * <p>
     * Applies tags to a resource. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
