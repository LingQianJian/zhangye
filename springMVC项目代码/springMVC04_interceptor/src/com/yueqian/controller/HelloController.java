package com.yueqian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello.do")
	public String execute() {
		System.out.println("HelloController��execute����ִ����.....");
		return "hello1";
	}
	
	@RequestMapping("/study.do")
	public String execute2() {
		System.out.println("HelloController��execute����ִ����.....");
		return "hello1";
	}

}
