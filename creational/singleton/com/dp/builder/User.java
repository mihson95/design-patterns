package com.dp.builder;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {

	private String username;
	private String password;
	private String email;
}
