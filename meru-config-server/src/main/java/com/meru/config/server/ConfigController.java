package com.meru.config.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@GetMapping("/get")
	public String get() {
		return "GET";
	}
}
