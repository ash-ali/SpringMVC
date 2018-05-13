package linjie.springmvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author LinJie E-mail:xulinjie0105@gmail.com
* @version 创建时间：2018年5月13日 下午2:09:31
* 类说明
*/
@Controller
public class HomeController {
	
	//处理对首页的请求
	//@RequestMapping("/helloworld")两个作用
	//1、表明showHomePage()是一个请求处理方法
	//2、指明这个方法要处理"/helloworld"路径的请求
	@RequestMapping("/helloworld")
	public String showHomePage() {
		System.out.println("hello world");
		return "hello";
	}
}
