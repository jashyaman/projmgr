package com.sr.logacc.swag.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	
		String resourceJson = "[\n" + 
				"  {\n" + 
				"    \"id\" : \"111\",\n" + 
				"    \"name\" : \"/payments/\",\n" + 
				"    \"role\" : [\"11\", \"22\"]\n" + 
				"  },\n" + 
				"  {\n" + 
				"    \"id\" : \"112\",\n" + 
				"    \"name\" : \"/people/\",\n" + 
				"    \"role\" : [\"11\"]\n" + 
				"  },\n" + 
				"  {\n" + 
				"    \"id\" : \"113\",\n" + 
				"    \"name\" : \"/orders/\",\n" + 
				"    \"role\" : [\"11\", \"22\"]\n" + 
				"  },\n" + 
				"  {\n" + 
				"    \"id\" : \"114\",\n" + 
				"    \"name\" : \"/tracer/\",\n" + 
				"    \"role\" : [\"11\"]\n" + 
				"  },\n" + 
				"  {\n" + 
				"    \"id\" : \"105\",\n" + 
				"    \"name\" : \"/addresses/\",\n" + 
				"    \"role\" : [\"11\"]\n" + 
				"  }\n" + 
				"]\n" + 
				"";
		String userJson = "[\n" + 
				"  {\n" + 
				"    \"id\" : \"1\",\n" + 
				"    \"name\" : \"shyam\",\n" + 
				"    \"role\" : [\"11\", \"22\"]\n" + 
				"  },\n" + 
				"  {\n" + 
				"    \"id\" : \"2\",\n" + 
				"    \"name\" : \"ram\",\n" + 
				"    \"role\" : [\"11\"]\n" + 
				"  },\n" + 
				"  {\n" + 
				"    \"id\" : \"3\",\n" + 
				"    \"name\" : \"ravi\",\n" + 
				"    \"role\" : [\"11\", \"22\"]\n" + 
				"  },\n" + 
				"  {\n" + 
				"    \"id\" : \"4\",\n" + 
				"    \"name\" : \"raj\",\n" + 
				"    \"role\" : [\"11\"]\n" + 
				"  },\n" + 
				"  {\n" + 
				"    \"id\" : \"5\",\n" + 
				"    \"name\" : \"ron\",\n" + 
				"    \"role\" : [\"11\"]\n" + 
				"  }\n" + 
				"]\n" + 
				"";
		
		String roleJson = "[\n" + 
				"  {\n" + 
				"    \"id\" : \"11\",\n" + 
				"    \"name\" : \"user\"\n" + 
				"  },\n" + 
				"  {\n" + 
				"    \"id\" : \"12\",\n" + 
				"    \"name\" : \"admin\"\n" + 
				"  }\n" + 
				"]\n" + 
				"";
		public String getUserListJsonString() {
			return userJson;
		}

		public String getResourceListJsonString() {
			return resourceJson;
		}
		
		public String getRoleListJsonString() {
			return roleJson;
		}
}
