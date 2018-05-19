package linjie.springmvc.handler;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
* @author ǳȻ 	xulinjie0105@gmail.com
* @version ����ʱ�䣺2018��5��19�� ����10:50:05
* ModelAndView
*/
@Controller
@RequestMapping("/springmvc")
/*
 * types������ָ�����������ͣ���ģ���ж�Ӧ���͵Ĳ����洢��session��
 * values:Ҫ���浽session�еĲ�������
 */
@SessionAttributes(value= {"name"},types= {Integer.class})//��Model��������Ϊname�����Էŵ�Session�����б��У��Ա�������Կ��Կ��������  
public class SpringmvcTestModelAndView {
	/*
	 * ModelAndView
	 */
	@RequestMapping("TestModelAndView")
	public ModelAndView testmodelandview() {
		ModelAndView modelandview = new ModelAndView("hello");
		modelandview.addObject("now",new Date());
		return modelandview;
	}
	/*
	 * model
	 */
	@RequestMapping("testmodel")
	public String testmodel(Model model,User user) {
		model.addAttribute("time", new Date());
		model.addAttribute("name", user.getUsername());
		model.addAttribute("age",user.getAge());
		return "hello";
	}
	/*
	 * map
	 */
	@RequestMapping("testmap")
	public String testmap(Map<String, Object> map,User user) {
		map.put("name", user.getUsername());
		return "hello";
	}
	
	/*
	 * SessionAttributes
	 */
	@RequestMapping("testattributes")
	public String testattributes(Model model) {
		model.addAttribute("name","linjie");
		model.addAttribute("nameasasd","aslinjie");
		model.addAttribute("age",23);
		model.addAttribute("weight",120);
		return "hello";
	}
	
}
