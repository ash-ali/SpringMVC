package linjie.springmvc.controller;

/**
* @author 浅然 	xulinjie0105@gmail.com
* @version 创建时间：2018年6月4日 上午8:01:41
* 请求处理的控制器
*/

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import linjie.springmvc.pojo.User;

@Controller
@RequestMapping("/springmvc")
public class UserController {

	//创建用户对象存入model，进入regist.jsp
	@RequestMapping(value="/regist")
	public String Regist(Model model){
		User user = new User();
		model.addAttribute("user",user);
		return "regist";
	}
	
	//用户注册事件触发该控制器,判断是否有error信息
	//如果有则不进入success
	//没有则进入success
	//@Valid作用:当该对象的类中已经定义好了验证规则,利用@Valid在控制器的方法中指定对该对象进行验证
	//BindingResult:传入BindingResult对象，用于获取校验失败情况下的反馈信息
	@RequestMapping(value="/qianran")
	public String GoSuccess(@Valid @ModelAttribute User user,BindingResult bindingResult,
			Errors errors,Model model){
		if(errors.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println("Code:"+fieldError.getCode()+", object:"+fieldError.getObjectName()
					+", field:"+fieldError.getField());
			return "regist";
		}
		model.addAttribute("user",user);
		return "success";
		
	}
}
