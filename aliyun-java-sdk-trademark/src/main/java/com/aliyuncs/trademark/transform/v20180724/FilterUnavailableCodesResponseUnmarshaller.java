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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.FilterUnavailableCodesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class FilterUnavailableCodesResponseUnmarshaller {

	public static FilterUnavailableCodesResponse unmarshall(FilterUnavailableCodesResponse filterUnavailableCodesResponse, UnmarshallerContext context) {
		
		filterUnavailableCodesResponse.setRequestId(context.stringValue("FilterUnavailableCodesResponse.RequestId"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("FilterUnavailableCodesResponse.Data.Length"); i++) {
			data.add(context.stringValue("FilterUnavailableCodesResponse.Data["+ i +"]"));
		}
		filterUnavailableCodesResponse.setData(data);
	 
	 	return filterUnavailableCodesResponse;
	}
}