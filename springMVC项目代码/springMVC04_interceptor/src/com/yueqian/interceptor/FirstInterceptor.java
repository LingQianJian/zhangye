package com.yueqian.interceptor;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/*
 * ������������Ҫʵ��HandlerInterceptor�ӿ�
 * spring��HandlerInterceptor֧��������Ӧ�ã�
 * 	 ����ҪΪĳЩ���⹦��ʱ��������û����У��ͷǳ��ʺϡ�
 */
public class FirstInterceptor implements HandlerInterceptor{
	
	/*
	 * ǰ�ο������յ����󣬻��ȵ���preHandle������
	 * ��÷�������true������Լ���������һ������������controller���
	 * ��÷�������false�����ж����̡�
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("������preHandle����.....");
		return true;
	}
	
	/*
	 *��controller�������ִ����ϣ�����ͼ����������ǰ�����ʱ��ִ��postHandle������
	 *���磺����ͨ��ModelAndView�����װ�����ݽ��д�������ͼ������
	 *
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		
		modelAndView.setViewName("hello2");
		System.out.println("������postHandle����.....");
		
	}
	
	
	/*
	 *������������Ϻ���á�
	 *�磺���ܼ�أ����ǿ����ڽ�����������ĵ�ʱ�䡣
	 *Ҳ���Խ���һЩ��Դ����....
	 **/
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
		System.out.println("������afterCompletion����.....");
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String nowTime =sdf.format(date);
		
		System.out.println("�������ʱ�䣺"+nowTime);
	}
}
