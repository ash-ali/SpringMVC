package linjie.springmvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author LinJie E-mail:xulinjie0105@gmail.com
* @version 创建时间：2018年5月14日 下午4:35:59
* RequestMapping修饰类的控制器
*/
@Controller
@RequestMapping(value="/springmvc")
public class RequestMappingTest {
	//此时映射到该方法上的URL:http://Springmvc_RequestMapping/springmvc/test
	//当只有一个属性时可以忽略value
	@RequestMapping(value="/test")
	public String test() {
		System.out.println("test");
		return "hello";
	}
	
	//method属性指示该方法仅处理哪些Http请求
	//处理多个Http请求:method={RequestMethod.POST,RequestMethod.PUT}
	@RequestMapping(value="/test2",method= {RequestMethod.POST,RequestMethod.PUT})
	public String test2() {
		System.out.println("test2");
		return "hello";
	}
	
	//Ant风格URL
	//？:匹配文件名中的一个字符
	//*:匹配文件名中的任意字符
	//**:匹配多层路径
	//@RequestMapping(value="/*/test3")
	//@RequestMapping(value="/**/test3")
	@RequestMapping(value="/*/test3")
	public String test3() {
		System.out.println("test3");
		return "hello";
	}
	
	
	//@RequestParam属性——params
	@RequestMapping(value="/testparams" , params="user")
	public String testparams(String user) {
		System.out.println("user :"+user);
		return "hello";
	}
	
	
	//@RequestParam
	//与@RequestParam属性——params类似
	//映射请求参数
	//value:请求参数的参数名
	//required:该参数是否是必须的,默认为true
	//defaultValue:请求参数的默认值
	//SpringMVC获取请求参数的优势:在Servlet中获取请求参数值相对麻烦:String user = HttpServletRequest.getParameter("user");
	@RequestMapping(value="/test4")
	public String test4(@RequestParam(value="user" , required=false , defaultValue="linjie") String user) {
		System.out.println("user:"+user);
		return "hello";
	}
	
	//@PathVariable
	//使用路径变量
	//注意：使用路径变量,首先需要在RequestMapping注解的值属性中添加一个变量,该变量必须放在花括号之间
	//然后,在方法签名 中添加同名变量,并加上@PathVariable注解.当该方法被调用时,请求URL的id值将被复制到路径变量中,并可以在方法中使用
	@RequestMapping(value="test5/{name}/{id}")
	public String test5(@PathVariable String name,@PathVariable int id) {
		System.out.println("name :"+name+" ,id :"+id);
		return "hello";
	}
	
	
}
