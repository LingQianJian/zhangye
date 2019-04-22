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
		 * ��ȡ�������һ��
		 * ʹ��HttpServletRequest���������
		 * ǰ�ο������Ὣreq���������Ϊ����������
		 * 
		 */
		String username = req.getParameter("username");
		String password =req.getParameter("pwd");
		
		System.out.println(username+" | "+password);
		
		return "index1";
	}
	
	/*
	 * ��ȡ�����������
	 * ʹ��ҳ�洫����name ��Ϊ�����Ĳ�������
	 * ע�⣺������߲�һ�£�����ʹ��@RequestParamע��
	 */
	
	@RequestMapping("/login2.do")
	public String checkLogin2(String username,@RequestParam("pwd") String pwd01) {
		System.out.println(username+" | "+pwd01);
		return "index1";
	}
	
	/*
	 * ��ȡ�����������
	 * ����Userʵ���࣬��������<form>�������name��ͬ
	 */
	
	public String checkLogin3(User user) {
		
		System.out.println(user.getUsername()+" | "+user.getPwd());
		return "index1";
	}
}
