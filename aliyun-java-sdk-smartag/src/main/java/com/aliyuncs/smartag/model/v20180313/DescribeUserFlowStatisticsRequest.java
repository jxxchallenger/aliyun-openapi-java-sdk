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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserFlowStatisticsRequest extends RpcAcsRequest<DescribeUserFlowStatisticsResponse> {
	
	public DescribeUserFlowStatisticsRequest() {
		super("Smartag", "2018-03-13", "DescribeUserFlowStatistics", "smartag");
	}

	private Long resourceOwnerId;

	private List<String> userNamess;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String statisticsDate;

	private Long ownerId;

	private String smartAGId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<String> getUserNamess() {
		return this.userNamess;
	}

	public void setUserNamess(List<String> userNamess) {
		this.userNamess = userNamess;	
		if (userNamess != null) {
			for (int i = 0; i < userNamess.size(); i++) {
				putQueryParameter("UserNames." + (i + 1) , userNamess.get(i));
			}
		}	
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getStatisticsDate() {
		return this.statisticsDate;
	}

	public void setStatisticsDate(String statisticsDate) {
		this.statisticsDate = statisticsDate;
		if(statisticsDate != null){
			putQueryParameter("StatisticsDate", statisticsDate);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
		if(smartAGId != null){
			putQueryParameter("SmartAGId", smartAGId);
		}
	}

	@Override
	public Class<DescribeUserFlowStatisticsResponse> getResponseClass() {
		return DescribeUserFlowStatisticsResponse.class;
	}

}
