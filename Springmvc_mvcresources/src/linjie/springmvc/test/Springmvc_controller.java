package linjie.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 浅然 	xulinjie0105@gmail.com
* @version 创建时间：2018年5月21日 下午12:33:06
* 请求处理的控制器
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
