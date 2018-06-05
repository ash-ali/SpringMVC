package linjie.springmvc.pojo;
/**
* @author 浅然 	xulinjie0105@gmail.com
* @version 创建时间：2018年6月4日 上午7:59:41
* 用户实体类
*/

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class User implements Serializable{
	private static final long serialVersionUID = -8091594509781201303L;

	//@NotEmpty 用在集合类上面
	//@NotBlank 用在String上面
	//@NotNull  用在基本类型上
	@NotBlank(message="用户名不能为空")
	private String username;										//用户名
	@Length(min=6,max=18,message="密码长度必须在6~18位")
	private String password;										//用户密码
	@Email(message="邮箱格式不正确")
	private String email;											//用户邮箱
	@Pattern(regexp="[1][3|4|5|7|8][0-9]{9}",message="手机号码格式不正确")
	private String phone;											//用户电话
	
	public User() {}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [username=" + username + 
				", password=" + password + ", email=" +
				email + ", phone=" + phone + "]";
	}
	
	
	
}
