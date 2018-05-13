package linjie.springmvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author LinJie E-mail:xulinjie0105@gmail.com
* @version ����ʱ�䣺2018��5��13�� ����2:09:31
* ��˵��
*/
@Controller
public class HomeController {
	
	//�������ҳ������
	//@RequestMapping("/helloworld")��������
	//1������showHomePage()��һ����������
	//2��ָ���������Ҫ����"/helloworld"·��������
	@RequestMapping("/helloworld")
	public String showHomePage() {
		System.out.println("hello world");
		return "hello";
	}
}
