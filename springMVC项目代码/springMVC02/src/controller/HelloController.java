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
//跳转页面默认转发
public class HelloController {
	
	/*
	 * 向页面传值一：
	 * 可以使用请求对象或者session对象绑定数据，转发到页面上去
	 */
	@RequestMapping("/toIndex.do")
	public String toIndex(HttpServletRequest req,HttpSession session) {
		
		//将数据绑定到请求对象
		req.setAttribute("chlName", "狗二蛋");
		
		//将数据绑定到sesion对象
		List<String> list=new ArrayList<String>();
		list.add("重庆");
		list.add("上海");
		
		session.setAttribute("city", list);
		
		//转发至WEB-INF/index2.jsp
		return "index2";
		
	}
	
	/*
	 * 向页面传值二：
	 * 使用ModleAndView对象作为方法的返回值
	 */
	@RequestMapping("/toIndex2.do")
	public ModelAndView toIndex2() {
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("score", 87);
		map.put("stuName", "张三");
		
		/*
		 * ModelAndView 对象中包含model和view属性
		 * model，其实是一个ModelMap类型
		 * view：视图
		 * 视图解析器将model中的每个元素通过request.setAttribute(name,value),
		 * 添加到request请求域中。
		 * 这样jsp页面中，可通过EL表达式获取对应的值
		 */
		ModelAndView mav=new ModelAndView("index2", map);
		
		return mav;
	}
	
	/*
	 * 向页面传值三：
	 * 使用ModelMap作为方法参数
	 */
	@RequestMapping("/toIndex3.do")
	public String toIndex2(ModelMap data) {
		//等同于 request.setAttribute()
		data.addAttribute("subWay","龙头寺");
		return "index2";
		
	}
	
	
}
