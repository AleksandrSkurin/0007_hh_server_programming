package com.example.friendlist.domain;

public class Friend {
	private String name;
	
	public Friend() {}
	
	public Friend(String name) {
		this.name = name;
	}

	// GETTERS ANS SETTERS
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
