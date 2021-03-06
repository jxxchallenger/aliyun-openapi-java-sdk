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

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AcceptInvitationRequest extends RpcAcsRequest<AcceptInvitationResponse> {
	
	public AcceptInvitationRequest() {
		super("Baas", "2018-07-31", "AcceptInvitation");
	}

	private String code;

	private Boolean isAccepted;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putBodyParameter("Code", code);
		}
	}

	public Boolean getIsAccepted() {
		return this.isAccepted;
	}

	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
		if(isAccepted != null){
			putBodyParameter("IsAccepted", isAccepted.toString());
		}
	}

	@Override
	public Class<AcceptInvitationResponse> getResponseClass() {
		return AcceptInvitationResponse.class;
	}

}
