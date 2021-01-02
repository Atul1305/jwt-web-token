package com.quest.jwt.model;

public class JwtResponse {
	private String JwtToken;

	public JwtResponse() {
	}

	public JwtResponse(String jwtToken) {
		JwtToken = jwtToken;
	}

	public String getJwtToken() {
		return JwtToken;
	}

	public void setJwtToken(String jwtToken) {
		JwtToken = jwtToken;
	}
}