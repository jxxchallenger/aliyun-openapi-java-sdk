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

package com.aliyuncs.dbs.model.v20190306;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateBackupPlanRequest extends RpcAcsRequest<CreateBackupPlanResponse> {
	
	public CreateBackupPlanRequest() {
		super("Dbs", "2019-03-06", "CreateBackupPlan", "cbs");
	}

	private String backupMethod;

	private String databaseType;

	private String period;

	private String clientToken;

	private String region;

	private String ownerId;

	private Integer usedTime;

	private String instanceClass;

	public String getBackupMethod() {
		return this.backupMethod;
	}

	public void setBackupMethod(String backupMethod) {
		this.backupMethod = backupMethod;
		if(backupMethod != null){
			putQueryParameter("BackupMethod", backupMethod);
		}
	}

	public String getDatabaseType() {
		return this.databaseType;
	}

	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
		if(databaseType != null){
			putQueryParameter("DatabaseType", databaseType);
		}
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public Integer getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(Integer usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime.toString());
		}
	}

	public String getInstanceClass() {
		return this.instanceClass;
	}

	public void setInstanceClass(String instanceClass) {
		this.instanceClass = instanceClass;
		if(instanceClass != null){
			putQueryParameter("InstanceClass", instanceClass);
		}
	}

	@Override
	public Class<CreateBackupPlanResponse> getResponseClass() {
		return CreateBackupPlanResponse.class;
	}

}
