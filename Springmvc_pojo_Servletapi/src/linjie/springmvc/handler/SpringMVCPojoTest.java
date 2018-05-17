package linjie.springmvc.handler;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author LinJie E-mail:xulinjie0105@gmail.com
* @version 创建时间：2018年5月17日 下午2:37:08
* 以POJO为参数的控制器方法类
*/
@Controller
@RequestMapping("/springmvc")
public class SpringMVCPojoTest {
	@RequestMapping("/test")
	public String test(Student student) {
		System.out.println("student:"+student+" "+"studnet teacher or course:"+student.getTeacher());
		return "hello";
	}
	
	
	@RequestMapping("/test2")
	public void test2(HttpServletRequest request,HttpServletResponse response ,Writer out) throws IOException {
		System.out.println(request+" "+response);
		out.write("hello");
		out.write("world");
	}
}
