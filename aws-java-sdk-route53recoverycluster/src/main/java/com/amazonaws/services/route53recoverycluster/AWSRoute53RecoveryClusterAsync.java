/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53recoverycluster;

import javax.annotation.Generated;

import com.amazonaws.services.route53recoverycluster.model.*;

/**
 * Interface for accessing Route53 Recovery Cluster asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53recoverycluster.AbstractAWSRoute53RecoveryClusterAsync} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the Routing Control (Recovery Cluster) API Reference Guide for Amazon Route 53 Application Recovery
 * Controller.
 * </p>
 * <p>
 * With Amazon Route 53 Application Recovery Controller, you can use routing control with extreme reliability to recover
 * applications by rerouting traffic across Availability Zones or AWS Regions. Routing controls are simple on/off
 * switches hosted on a highly available cluster in Application Recovery Controller. A cluster provides a set of five
 * redundant Regional endpoints against which you can run API calls to get or update the state of routing controls. To
 * implement failover, you set one routing control on and another one off, to reroute traffic from one Availability Zone
 * or Amazon Web Services Region to another.
 * </p>
 * <p>
 * <i>Be aware that you must specify the Regional endpoints for a cluster when you work with API cluster operations to
 * get or update routing control states in Application Recovery Controller.</i> In addition, you must specify the US
 * West (Oregon) Region for Application Recovery Controller API calls. For example, use the parameter
 * <code>region us-west-2</code> with AWS CLI commands. For more information, see <a
 * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.update.api.html"> Get and update routing
 * control states using the API</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
 * </p>
 * <p>
 * This API guide includes information about the API operations for how to get and update routing control states in
 * Application Recovery Controller. You also must set up the structures to support routing controls: clusters and
 * control panels.
 * </p>
 * <p>
 * For more information about working with routing control in Application Recovery Controller, see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * To create clusters, routing controls, and control panels by using the control plane API for routing control, see the
 * <a href="https://docs.aws.amazon.com/recovery-cluster/latest/api/">Recovery Control Configuration API Reference Guide
 * for Amazon Route 53 Application Recovery Controller</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Learn about the components in recovery control configuration, including clusters, routing controls, and control
 * panels. For more information, see <a href=
 * "https://docs.aws.amazon.com/r53recovery/latest/dg/introduction-components.html#introduction-components-routing">
 * Recovery control components</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
 * </p>
 * </li>
 * <li>
 * <p>
 * Application Recovery Controller also provides readiness checks that run continually to help make sure that your
 * applications are scaled and ready to handle failover traffic. For more information about the related API actions, see
 * the <a href="https://docs.aws.amazon.com/recovery-readiness/latest/api/">Recovery Readiness API Reference Guide for
 * Amazon Route 53 Application Recovery Controller</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about creating resilient applications and preparing for recovery readiness with Application
 * Recovery Controller, see the <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/">Amazon Route 53 Application
 * Recovery Controller Developer Guide</a>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoute53RecoveryClusterAsync extends AWSRoute53RecoveryCluster {

    /**
     * <p>
     * Get the state for a routing control. A routing control is a simple on/off switch that you can use to route
     * traffic to cells. When the state is On, traffic flows to a cell. When it's Off, traffic does not flow.
     * </p>
     * <p>
     * Before you can create a routing control, you must first create a cluster to host the control in a control panel.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.create.html"> Create routing control
     * structures</a> in the Amazon Route 53 Application Recovery Controller Developer Guide. Then you access one of the
     * endpoints for the cluster to get or update the routing control state to redirect traffic.
     * </p>
     * <p>
     * <i>You must specify Regional endpoints when you work with API cluster operations to get or update routing control
     * states in Application Recovery Controller.</i>
     * </p>
     * <p>
     * To see a code example for getting a routing control state, including accessing Regional cluster endpoints in
     * sequence, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples_actions.html">API
     * examples</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <p>
     * Learn more about working with routing controls in the following topics in the Amazon Route 53 Application
     * Recovery Controller Developer Guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.update.html"> Viewing and updating
     * routing control states</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Working with routing controls
     * overall</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getRoutingControlStateRequest
     * @return A Java Future containing the result of the GetRoutingControlState operation returned by the service.
     * @sample AWSRoute53RecoveryClusterAsync.GetRoutingControlState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/GetRoutingControlState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRoutingControlStateResult> getRoutingControlStateAsync(GetRoutingControlStateRequest getRoutingControlStateRequest);

    /**
     * <p>
     * Get the state for a routing control. A routing control is a simple on/off switch that you can use to route
     * traffic to cells. When the state is On, traffic flows to a cell. When it's Off, traffic does not flow.
     * </p>
     * <p>
     * Before you can create a routing control, you must first create a cluster to host the control in a control panel.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.create.html"> Create routing control
     * structures</a> in the Amazon Route 53 Application Recovery Controller Developer Guide. Then you access one of the
     * endpoints for the cluster to get or update the routing control state to redirect traffic.
     * </p>
     * <p>
     * <i>You must specify Regional endpoints when you work with API cluster operations to get or update routing control
     * states in Application Recovery Controller.</i>
     * </p>
     * <p>
     * To see a code example for getting a routing control state, including accessing Regional cluster endpoints in
     * sequence, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples_actions.html">API
     * examples</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <p>
     * Learn more about working with routing controls in the following topics in the Amazon Route 53 Application
     * Recovery Controller Developer Guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.update.html"> Viewing and updating
     * routing control states</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Working with routing controls
     * overall</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getRoutingControlStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRoutingControlState operation returned by the service.
     * @sample AWSRoute53RecoveryClusterAsyncHandler.GetRoutingControlState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/GetRoutingControlState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRoutingControlStateResult> getRoutingControlStateAsync(GetRoutingControlStateRequest getRoutingControlStateRequest,
            com.amazonaws.handlers.AsyncHandler<GetRoutingControlStateRequest, GetRoutingControlStateResult> asyncHandler);

    /**
     * <p>
     * Set the state of the routing control to reroute traffic. You can set the value to be On or Off. When the state is
     * On, traffic flows to a cell. When it's Off, traffic does not flow.
     * </p>
     * <p>
     * With Application Recovery Controller, you can add safety rules for routing controls, which are safeguards for
     * routing control state updates that help prevent unexpected outcomes, like fail open traffic routing. However,
     * there are scenarios when you might want to bypass the routing control safeguards that are enforced with safety
     * rules that you've configured. For example, you might want to fail over quickly for disaster recovery, and one or
     * more safety rules might be unexpectedly preventing you from updating a routing control state to reroute traffic.
     * In a "break glass" scenario like this, you can override one or more safety rules to change a routing control
     * state and fail over your application.
     * </p>
     * <p>
     * The <code>SafetyRulesToOverride</code> property enables you override one or more safety rules and update routing
     * control states. For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <p>
     * <i>You must specify Regional endpoints when you work with API cluster operations to get or update routing control
     * states in Application Recovery Controller.</i>
     * </p>
     * <p>
     * To see a code example for getting a routing control state, including accessing Regional cluster endpoints in
     * sequence, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples_actions.html">API
     * examples</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.update.html"> Viewing and updating
     * routing control states</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Working with routing controls
     * overall</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRoutingControlStateRequest
     * @return A Java Future containing the result of the UpdateRoutingControlState operation returned by the service.
     * @sample AWSRoute53RecoveryClusterAsync.UpdateRoutingControlState
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingControlStateResult> updateRoutingControlStateAsync(
            UpdateRoutingControlStateRequest updateRoutingControlStateRequest);

    /**
     * <p>
     * Set the state of the routing control to reroute traffic. You can set the value to be On or Off. When the state is
     * On, traffic flows to a cell. When it's Off, traffic does not flow.
     * </p>
     * <p>
     * With Application Recovery Controller, you can add safety rules for routing controls, which are safeguards for
     * routing control state updates that help prevent unexpected outcomes, like fail open traffic routing. However,
     * there are scenarios when you might want to bypass the routing control safeguards that are enforced with safety
     * rules that you've configured. For example, you might want to fail over quickly for disaster recovery, and one or
     * more safety rules might be unexpectedly preventing you from updating a routing control state to reroute traffic.
     * In a "break glass" scenario like this, you can override one or more safety rules to change a routing control
     * state and fail over your application.
     * </p>
     * <p>
     * The <code>SafetyRulesToOverride</code> property enables you override one or more safety rules and update routing
     * control states. For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <p>
     * <i>You must specify Regional endpoints when you work with API cluster operations to get or update routing control
     * states in Application Recovery Controller.</i>
     * </p>
     * <p>
     * To see a code example for getting a routing control state, including accessing Regional cluster endpoints in
     * sequence, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples_actions.html">API
     * examples</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.update.html"> Viewing and updating
     * routing control states</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Working with routing controls
     * overall</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRoutingControlStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoutingControlState operation returned by the service.
     * @sample AWSRoute53RecoveryClusterAsyncHandler.UpdateRoutingControlState
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingControlStateResult> updateRoutingControlStateAsync(
            UpdateRoutingControlStateRequest updateRoutingControlStateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoutingControlStateRequest, UpdateRoutingControlStateResult> asyncHandler);

    /**
     * <p>
     * Set multiple routing control states. You can set the value for each state to be On or Off. When the state is On,
     * traffic flows to a cell. When it's Off, traffic does not flow.
     * </p>
     * <p>
     * With Application Recovery Controller, you can add safety rules for routing controls, which are safeguards for
     * routing control state updates that help prevent unexpected outcomes, like fail open traffic routing. However,
     * there are scenarios when you might want to bypass the routing control safeguards that are enforced with safety
     * rules that you've configured. For example, you might want to fail over quickly for disaster recovery, and one or
     * more safety rules might be unexpectedly preventing you from updating a routing control state to reroute traffic.
     * In a "break glass" scenario like this, you can override one or more safety rules to change a routing control
     * state and fail over your application.
     * </p>
     * <p>
     * The <code>SafetyRulesToOverride</code> property enables you override one or more safety rules and update routing
     * control states. For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <p>
     * <i>You must specify Regional endpoints when you work with API cluster operations to get or update routing control
     * states in Application Recovery Controller.</i>
     * </p>
     * <p>
     * To see a code example for getting a routing control state, including accessing Regional cluster endpoints in
     * sequence, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples_actions.html">API
     * examples</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.update.html"> Viewing and updating
     * routing control states</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Working with routing controls
     * overall</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRoutingControlStatesRequest
     * @return A Java Future containing the result of the UpdateRoutingControlStates operation returned by the service.
     * @sample AWSRoute53RecoveryClusterAsync.UpdateRoutingControlStates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlStates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingControlStatesResult> updateRoutingControlStatesAsync(
            UpdateRoutingControlStatesRequest updateRoutingControlStatesRequest);

    /**
     * <p>
     * Set multiple routing control states. You can set the value for each state to be On or Off. When the state is On,
     * traffic flows to a cell. When it's Off, traffic does not flow.
     * </p>
     * <p>
     * With Application Recovery Controller, you can add safety rules for routing controls, which are safeguards for
     * routing control state updates that help prevent unexpected outcomes, like fail open traffic routing. However,
     * there are scenarios when you might want to bypass the routing control safeguards that are enforced with safety
     * rules that you've configured. For example, you might want to fail over quickly for disaster recovery, and one or
     * more safety rules might be unexpectedly preventing you from updating a routing control state to reroute traffic.
     * In a "break glass" scenario like this, you can override one or more safety rules to change a routing control
     * state and fail over your application.
     * </p>
     * <p>
     * The <code>SafetyRulesToOverride</code> property enables you override one or more safety rules and update routing
     * control states. For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <p>
     * <i>You must specify Regional endpoints when you work with API cluster operations to get or update routing control
     * states in Application Recovery Controller.</i>
     * </p>
     * <p>
     * To see a code example for getting a routing control state, including accessing Regional cluster endpoints in
     * sequence, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples_actions.html">API
     * examples</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.update.html"> Viewing and updating
     * routing control states</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Working with routing controls
     * overall</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRoutingControlStatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoutingControlStates operation returned by the service.
     * @sample AWSRoute53RecoveryClusterAsyncHandler.UpdateRoutingControlStates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlStates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingControlStatesResult> updateRoutingControlStatesAsync(
            UpdateRoutingControlStatesRequest updateRoutingControlStatesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoutingControlStatesRequest, UpdateRoutingControlStatesResult> asyncHandler);

}
