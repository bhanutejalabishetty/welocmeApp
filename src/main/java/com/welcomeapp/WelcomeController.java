package com.welcomeapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/getMessage")
	public String getMessage() {
		return "Welcome to this App";
	}
	
	@PostMapping("/sendStatus")
	@ResponseBody
	public String reteriveMessageByStatus(@RequestParam(name="msg") String msg) {
		return "Welcome to this App with "+msg;
	}
}
