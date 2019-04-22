package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/study")
//��תҳ��Ĭ��ת��
public class HelloController {
	
	/*
	 * ��ҳ�洫ֵһ��
	 * ����ʹ������������session��������ݣ�ת����ҳ����ȥ
	 */
	@RequestMapping("/toIndex.do")
	public String toIndex(HttpServletRequest req,HttpSession session) {
		
		//�����ݰ󶨵��������
		req.setAttribute("chlName", "������");
		
		//�����ݰ󶨵�sesion����
		List<String> list=new ArrayList<String>();
		list.add("����");
		list.add("�Ϻ�");
		
		session.setAttribute("city", list);
		
		//ת����WEB-INF/index2.jsp
		return "index2";
		
	}
	
	/*
	 * ��ҳ�洫ֵ����
	 * ʹ��ModleAndView������Ϊ�����ķ���ֵ
	 */
	@RequestMapping("/toIndex2.do")
	public ModelAndView toIndex2() {
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("score", 87);
		map.put("stuName", "����");
		
		/*
		 * ModelAndView �����а���model��view����
		 * model����ʵ��һ��ModelMap����
		 * view����ͼ
		 * ��ͼ��������model�е�ÿ��Ԫ��ͨ��request.setAttribute(name,value),
		 * ��ӵ�request�������С�
		 * ����jspҳ���У���ͨ��EL���ʽ��ȡ��Ӧ��ֵ
		 */
		ModelAndView mav=new ModelAndView("index2", map);
		
		return mav;
	}
	
	/*
	 * ��ҳ�洫ֵ����
	 * ʹ��ModelMap��Ϊ��������
	 */
	@RequestMapping("/toIndex3.do")
	public String toIndex2(ModelMap data) {
		//��ͬ�� request.setAttribute()
		data.addAttribute("subWay","��ͷ��");
		return "index2";
		
	}
	
	
}
