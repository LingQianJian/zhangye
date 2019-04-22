package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HeightController {
	
	@RequestMapping("/heightResult.do")
	@ResponseBody//返回josn格式输出
	public Map checkResult(String height) {
		
		String result=null;
		System.out.println(height);
		if("160cm".equals(height)) {
			result="矮了";
		}else if("170cm".equals(height)) {
			result="刚好";
		}else if("180cm".equals(height)) {
			result="高了";
		}
		
		Map <String,String> map=new HashMap<String,String>();
		map.put("handleResult", result);
		return map;
		
//		List<String> list=new ArrayList<>();
//		list.add("重庆");
//		list.add("北京");
//		return list;

		
	}

}
