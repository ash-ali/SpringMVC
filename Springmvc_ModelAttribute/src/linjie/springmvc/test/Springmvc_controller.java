package linjie.springmvc.test;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author ǳȻ 	xulinjie0105@gmail.com
* @version ����ʱ�䣺2018��5��21�� ����12:33:06
* ������Ŀ�����
*/
@Controller
@RequestMapping("/springmvc")
public class Springmvc_controller {
	/*
	 * ����@ModelAttributeע��ķ���,���ڴ�controllerÿ������ִ��
	 * ��˶���һ��controllerӳ����URL���÷���Ҫ����ʹ��
	 * getInitUser()��ʼ���û���Ϣ(ģ��)
	 */
	@ModelAttribute
	public void getInitUser(@RequestParam(value="id",required=false) Integer id
			,Map<String, Object> map) {
		System.out.println("ִ��@ModelAttributeע���getInitUser����");
		User user = new User();//����User���������������
		user.setId(1);
		user.setUsername("ǳȻ");
		user.setPassword("1234");
		user.setEmail("xulinjie0105@gmail.com");
		System.out.println("User ��ʼ����ɣ�"+user);
		//����map������
		map.put("user", user);
	}
	
	/*
	 * ��������
	 * �����޸ĺ����Ϣ����testmodelattribute()��������
	 */
	/*@RequestMapping("testmodelattribute")
	public String testmodelattribute(User user,Model model) {
		System.out.println("�û����������޸���ɣ�"+user);
		//����Ϣ�洢��model��
		//key(��)Ҫ��POJO��Ա���������
		model.addAttribute("id", user.getId());
		model.addAttribute("username", user.getUsername());
		model.addAttribute("password", user.getPassword());
		model.addAttribute("email", user.getEmail() );
		return "success";
	}
	
	
	
	
	/*
	 * ������ע�⣬����springmvc,����ȥmodel����û��user_new���key
	 * �����,ע�뵽string���������
	 */
	
/*	@ModelAttribute
	public void getInitUser2(@RequestParam(value="id",required=false) Integer id
			,Model model) {
		System.out.println("ִ��@ModelAttributeע���getInitUser����");
		User user = new User();//����User���������������
		user.setUsername("ǳȻ");
		System.out.println("User ��ʼ����ɣ�"+user);
		//����model������
		model.addAttribute("user_new", user.getUsername());
	}
	
	@RequestMapping("testmodelattribute2W")
	public void testmodelattribute(@ModelAttribute("user_new") String username) {
		System.out.println("username : "+username);
	}*/
}
