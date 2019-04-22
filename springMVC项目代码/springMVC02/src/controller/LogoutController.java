package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
/*
 * Spring MVCĬ�ϲ���ת����ʽ��λ��ͼ,�����Ҫ�ض���ʽ�ɲ����������ַ�����
 */
@Controller
@RequestMapping("/study")
public class LogoutController {
	
	//��ʽһ��ʹ��RedirectView
	@RequestMapping("/logout1.do")
	public ModelAndView logout1() {
		
		System.out.println("***************");
		RedirectView rv=new RedirectView("../login1.jsp");
		return new ModelAndView(rv);
	}
	
	//��ʽ����ʹ��redirectǰ׺���Ƽ���
	@RequestMapping("/logout2.do")
	public String logout2() {
		
		return "redirect:../login1.jsp";
	}

}
