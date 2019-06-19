package ksmart31.team02.document.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/calendar")
	public String calendar() {
		System.out.println("calendar실행");
		return "/pages/calendar";
	}
	
	@GetMapping("/charts-amcharts")
	public String chartsAmcharts() {
		System.out.println("chartsAmcharts실행");
		return "/pages/charts-amcharts";
	}
	
	@GetMapping("/charts-chartist")
	public String chartsChartist() {
		System.out.println("chartsChartist실행");
		return "/pages/charts-chartist";
	}
	
	@GetMapping("/charts-flot")
	public String chartsFlot() {
		System.out.println("chartsFlot실행");
		return "/pages/charts-flot";
	}
	
	@GetMapping("/charts-knob")
	public String chartsKnob() {
		System.out.println("chartsKnob실행");
		return "/pages/charts-knob";
	}
	
	@GetMapping("/forgot-password")
	public String forgotPassword() {
		System.out.println("forgotPassword실행");
		return "/pages/forgot-password";
	}
	
	@GetMapping("/profile")
	public String profile() {
		System.out.println("profile실행");
		return "/pages/profile";
	}
	
	@GetMapping({"/","/index"})
	public String index() {
		System.out.println("index실행");
		return "index";
	}
}
