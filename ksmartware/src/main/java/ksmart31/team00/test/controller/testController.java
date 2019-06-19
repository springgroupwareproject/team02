package ksmart31.team00.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
	@GetMapping(value = { "/", "/index" })
	public String index() {
		System.out.println("IndexController.index()");
		return "test";
	}
}
