package com.lovetolearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/check")
	public String getData() {
		
		return "container-is-up";
	}
}