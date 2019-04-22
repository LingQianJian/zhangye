package com.yueqian.interceptor;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/*
 * 创建拦截器需要实现HandlerInterceptor接口
 * spring的HandlerInterceptor支持拦截器应用：
 * 	 当需要为某些特殊功能时，比如对用户身份校验就非常适合。
 */
public class FirstInterceptor implements HandlerInterceptor{
	
	/*
	 * 前段控制器收到请求，会先调用preHandle方法。
	 * 如该方法返回true，则可以继续调用下一个拦截器或者controller组件
	 * 如该方法返回false，则中断流程。
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("调用了preHandle方法.....");
		return true;
	}
	
	/*
	 *在controller组件方法执行完毕，到视图解析器处理前，这段时间执行postHandle方法。
	 *比如：可以通过ModelAndView对象封装的数据进行处理，或视图名处理。
	 *
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		
		modelAndView.setViewName("hello2");
		System.out.println("调用了postHandle方法.....");
		
	}
	
	
	/*
	 *整个请求处理完毕后调用。
	 *如：性能监控，我们可以在结束后输出消耗的时间。
	 *也可以进行一些资源清理....
	 **/
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
		System.out.println("调用了afterCompletion方法.....");
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String nowTime =sdf.format(date);
		
		System.out.println("请求结束时间："+nowTime);
	}
}
