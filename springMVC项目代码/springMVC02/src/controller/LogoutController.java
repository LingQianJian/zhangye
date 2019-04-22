package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
/*
 * Spring MVC默认采用转发方式定位视图,如果需要重定向方式可采用下面两种方法：
 */
@Controller
@RequestMapping("/study")
public class LogoutController {
	
	//方式一：使用RedirectView
	@RequestMapping("/logout1.do")
	public ModelAndView logout1() {
		
		System.out.println("***************");
		RedirectView rv=new RedirectView("../login1.jsp");
		return new ModelAndView(rv);
	}
	
	//方式二：使用redirect前缀（推荐）
	@RequestMapping("/logout2.do")
	public String logout2() {
		
		return "redirect:../login1.jsp";
	}

}
