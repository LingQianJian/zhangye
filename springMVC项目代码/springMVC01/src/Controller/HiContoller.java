package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//ͨ�����ע���ǣ�������һ����ͨ��ʵ�����ˣ����ҽ�֮�����һ��Controller���
public class HiContoller{
	
	@RequestMapping("/hi.do")
	public String execute() {
		System.out.println("HiContoller��ִ��execute������.....");
		//����Modle�㣬���շ���һ����������������ת��ĳ��ҳ��
		
		return "hello";	//����һ����ͼ����
		
		
	}

}
