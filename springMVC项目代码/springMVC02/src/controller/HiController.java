package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.User;


@Controller
@RequestMapping("/study")
public class HiController{
	
	@RequestMapping("/login1.do")
	public String checkLogin(HttpServletRequest req) {
		/*
		 * 获取请求参数一：
		 * 使用HttpServletRequest的请求对象。
		 * 前段控制器会将req请求对象作为参数传进来
		 * 
		 */
		String username = req.getParameter("username");
		String password =req.getParameter("pwd");
		
		System.out.println(username+" | "+password);
		
		return "index1";
	}
	
	/*
	 * 获取请求参数二：
	 * 使用页面传来的name 作为方法的参数名。
	 * 注意：如果两者不一致，可以使用@RequestParam注解
	 */
	
	@RequestMapping("/login2.do")
	public String checkLogin2(String username,@RequestParam("pwd") String pwd01) {
		System.out.println(username+" | "+pwd01);
		return "index1";
	}
	
	/*
	 * 获取请求参数三：
	 * 定义User实体类，属性名与<form>表单组件的name相同
	 */
	
	public String checkLogin3(User user) {
		
		System.out.println(user.getUsername()+" | "+user.getPwd());
		return "index1";
	}
}
