package linjie.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author ǳȻ 	xulinjie0105@gmail.com
* @version ����ʱ�䣺2018��5��21�� ����12:33:06
* ������Ŀ�����
*/
@Controller
@RequestMapping("/springmvc")
public class Springmvc_controller {
	@RequestMapping("/mvcresources")
	public String test() {
		System.out.println("success");
		return "success";
	}
}
