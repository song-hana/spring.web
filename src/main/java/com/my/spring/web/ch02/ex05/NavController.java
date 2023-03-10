package com.my.spring.web.ch02.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/ex05")
public class NavController {
	@GetMapping("forward")
	public String forward() {
		return "forward:target";  //request url
	}
	
	@GetMapping("target")
	public String target() {
		return "ch02/ex05/target"; //view name
	}
	
	@GetMapping("redirect")
	public String redirect() {
		return "redirect:target";
	}
	
	@GetMapping("naver")
	public String naver() {
		return "redirect:https://naver.com";
	}
}
