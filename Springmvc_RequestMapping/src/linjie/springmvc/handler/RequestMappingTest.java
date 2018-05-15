package linjie.springmvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author LinJie E-mail:xulinjie0105@gmail.com
* @version ����ʱ�䣺2018��5��14�� ����4:35:59
* RequestMapping������Ŀ�����
*/
@Controller
@RequestMapping(value="/springmvc")
public class RequestMappingTest {
	//��ʱӳ�䵽�÷����ϵ�URL:http://Springmvc_RequestMapping/springmvc/test
	//��ֻ��һ������ʱ���Ժ���value
	@RequestMapping(value="/test")
	public String test() {
		System.out.println("test");
		return "hello";
	}
	
	//method����ָʾ�÷�����������ЩHttp����
	//������Http����:method={RequestMethod.POST,RequestMethod.PUT}
	@RequestMapping(value="/test2",method= {RequestMethod.POST,RequestMethod.PUT})
	public String test2() {
		System.out.println("test2");
		return "hello";
	}
	
	//Ant���URL
	//��:ƥ���ļ����е�һ���ַ�
	//*:ƥ���ļ����е������ַ�
	//**:ƥ����·��
	//@RequestMapping(value="/*/test3")
	//@RequestMapping(value="/**/test3")
	@RequestMapping(value="/*/test3")
	public String test3() {
		System.out.println("test3");
		return "hello";
	}
	
	
	//@RequestParam���ԡ���params
	@RequestMapping(value="/testparams" , params="user")
	public String testparams(String user) {
		System.out.println("user :"+user);
		return "hello";
	}
	
	
	//@RequestParam
	//��@RequestParam���ԡ���params����
	//ӳ���������
	//value:��������Ĳ�����
	//required:�ò����Ƿ��Ǳ����,Ĭ��Ϊtrue
	//defaultValue:���������Ĭ��ֵ
	//SpringMVC��ȡ�������������:��Servlet�л�ȡ�������ֵ����鷳:String user = HttpServletRequest.getParameter("user");
	@RequestMapping(value="/test4")
	public String test4(@RequestParam(value="user" , required=false , defaultValue="linjie") String user) {
		System.out.println("user:"+user);
		return "hello";
	}
	
	//@PathVariable
	//ʹ��·������
	//ע�⣺ʹ��·������,������Ҫ��RequestMappingע���ֵ���������һ������,�ñ���������ڻ�����֮��
	//Ȼ��,�ڷ���ǩ�� �����ͬ������,������@PathVariableע��.���÷���������ʱ,����URL��idֵ�������Ƶ�·��������,�������ڷ�����ʹ��
	@RequestMapping(value="test5/{name}/{id}")
	public String test5(@PathVariable String name,@PathVariable int id) {
		System.out.println("name :"+name+" ,id :"+id);
		return "hello";
	}
	
	
}
