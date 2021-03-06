/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.ModifySmartAccessGatewayClientUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySmartAccessGatewayClientUserResponseUnmarshaller {

	public static ModifySmartAccessGatewayClientUserResponse unmarshall(ModifySmartAccessGatewayClientUserResponse modifySmartAccessGatewayClientUserResponse, UnmarshallerContext context) {
		
		modifySmartAccessGatewayClientUserResponse.setRequestId(context.stringValue("ModifySmartAccessGatewayClientUserResponse.RequestId"));
		modifySmartAccessGatewayClientUserResponse.setSmartAGId(context.stringValue("ModifySmartAccessGatewayClientUserResponse.SmartAGId"));
		modifySmartAccessGatewayClientUserResponse.setClientIp(context.stringValue("ModifySmartAccessGatewayClientUserResponse.ClientIp"));
		modifySmartAccessGatewayClientUserResponse.setUserMail(context.stringValue("ModifySmartAccessGatewayClientUserResponse.UserMail"));
		modifySmartAccessGatewayClientUserResponse.setUserName(context.stringValue("ModifySmartAccessGatewayClientUserResponse.UserName"));
		modifySmartAccessGatewayClientUserResponse.setIsStaticIp(context.booleanValue("ModifySmartAccessGatewayClientUserResponse.IsStaticIp"));
		modifySmartAccessGatewayClientUserResponse.setIsSharedUser(context.booleanValue("ModifySmartAccessGatewayClientUserResponse.IsSharedUser"));
		modifySmartAccessGatewayClientUserResponse.setBandwidth(context.integerValue("ModifySmartAccessGatewayClientUserResponse.Bandwidth"));
	 
	 	return modifySmartAccessGatewayClientUserResponse;
	}
}