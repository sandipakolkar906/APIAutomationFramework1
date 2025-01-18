package com.qa.payloads;

public class GenerateTokenPayload {

	public String userName;
	public String password;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public GenerateTokenPayload() {
	}

	public GenerateTokenPayload(String userName, String password) {

		this.userName = userName;
		this.password = password;
	}

}
