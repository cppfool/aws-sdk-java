/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#deregisterInstance(DeregisterInstanceRequest) DeregisterInstance operation}.
 * <p>
 * Deregister a registered Amazon EC2 or on-premises instance. This
 * action removes the instance from the stack and returns it to your
 * control. This action can not be used with instances that were created
 * with AWS OpsWorks.
 * </p>
 * <p>
 * <b>Required Permissions</b> : To use this action, an IAM user must
 * have a Manage permissions level for the stack or an attached policy
 * that explicitly grants permissions. For more information on user
 * permissions, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#deregisterInstance(DeregisterInstanceRequest)
 */
public class DeregisterInstanceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * The instance ID.
     *
     * @return The instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID.
     *
     * @param instanceId The instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeregisterInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeregisterInstanceRequest == false) return false;
        DeregisterInstanceRequest other = (DeregisterInstanceRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        return true;
    }
    
}
    