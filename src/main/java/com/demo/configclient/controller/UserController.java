package com.demo.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RefreshScope
public class UserController {

	@Value("${user.name}")
	public String userName;
	
	@GetMapping("/user")
	public String getUserName() {
		return userName;
	}
}