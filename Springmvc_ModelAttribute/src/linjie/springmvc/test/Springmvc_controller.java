package linjie.springmvc.test;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author 浅然 	xulinjie0105@gmail.com
* @version 创建时间：2018年5月21日 下午12:33:06
* 请求处理的控制器
*/
@Controller
@RequestMapping("/springmvc")
public class Springmvc_controller {
	/*
	 * 利用@ModelAttribute注解的方法,会在此controller每个方法执行
	 * 因此对于一个controller映射多个URL的用法需要谨慎使用
	 * getInitUser()初始化用户信息(模拟)
	 */
	@ModelAttribute
	public void getInitUser(@RequestParam(value="id",required=false) Integer id
			,Map<String, Object> map) {
		System.out.println("执行@ModelAttribute注解的getInitUser方法");
		User user = new User();//创建User对象并设置其相关域
		user.setId(1);
		user.setUsername("浅然");
		user.setPassword("1234");
		user.setEmail("xulinjie0105@gmail.com");
		System.out.println("User 初始化完成："+user);
		//放入map集合中
		map.put("user", user);
	}
	
	/*
	 * 请求处理方法
	 * 将表单修改后的信息交给testmodelattribute()方法处理
	 */
	/*@RequestMapping("testmodelattribute")
	public String testmodelattribute(User user,Model model) {
		System.out.println("用户名和邮箱修改完成："+user);
		//将信息存储到model中
		//key(键)要与POJO成员变量名相等
		model.addAttribute("id", user.getId());
		model.addAttribute("username", user.getUsername());
		model.addAttribute("password", user.getPassword());
		model.addAttribute("email", user.getEmail() );
		return "success";
	}
	
	
	
	
	/*
	 * 这样的注解，首先springmvc,会先去model找有没有user_new这个key
	 * 如果有,注入到string这个参数中
	 */
	
/*	@ModelAttribute
	public void getInitUser2(@RequestParam(value="id",required=false) Integer id
			,Model model) {
		System.out.println("执行@ModelAttribute注解的getInitUser方法");
		User user = new User();//创建User对象并设置其相关域
		user.setUsername("浅然");
		System.out.println("User 初始化完成："+user);
		//放入model集合中
		model.addAttribute("user_new", user.getUsername());
	}
	
	@RequestMapping("testmodelattribute2W")
	public void testmodelattribute(@ModelAttribute("user_new") String username) {
		System.out.println("username : "+username);
	}*/
}
