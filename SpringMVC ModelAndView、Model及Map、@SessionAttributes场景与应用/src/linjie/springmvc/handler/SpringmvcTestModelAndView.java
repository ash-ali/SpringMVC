package linjie.springmvc.handler;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
* @author 浅然 	xulinjie0105@gmail.com
* @version 创建时间：2018年5月19日 上午10:50:05
* ModelAndView
*/
@Controller
@RequestMapping("/springmvc")
/*
 * types：根据指定参数的类型，将模型中对应类型的参数存储到session中
 * values:要保存到session中的参数名称
 */
@SessionAttributes(value= {"name"},types= {Integer.class})//将Model中属性名为name的属性放到Session属性列表中，以便这个属性可以跨请求访问  
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
