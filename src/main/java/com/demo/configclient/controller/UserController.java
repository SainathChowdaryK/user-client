package com.demo.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserController {

	@Value("${user.client}")
	public String userName;
	
	@GetMapping("/user")
	public String getUserName() {
		return userName;
	}
}