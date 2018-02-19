package com.sr.logacc.swag.domain;

import java.util.List;

public class Resource {
	
	private String id;
	private String name;
	private List<String> role;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getRole() {
		return role;
	}
	public void setRole(List<String> role) {
		this.role = role;
	}
	
	
}
