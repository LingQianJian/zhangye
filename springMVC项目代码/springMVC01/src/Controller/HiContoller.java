package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//通过这个注解标记，不仅将一个普通类实例化了，而且将之变成了一个Controller组件
public class HiContoller{
	
	@RequestMapping("/hi.do")
	public String execute() {
		System.out.println("HiContoller的执行execute方法中.....");
		//调用Modle层，最终返回一个处理结果。并且跳转到某个页面
		
		return "hello";	//返回一个视图名字
		
		
	}

}
