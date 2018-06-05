package linjie.springmvc.pojo;
/**
* @author ǳȻ 	xulinjie0105@gmail.com
* @version ����ʱ�䣺2018��6��4�� ����7:59:41
* �û�ʵ����
*/

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class User implements Serializable{
	private static final long serialVersionUID = -8091594509781201303L;

	//@NotEmpty ���ڼ���������
	//@NotBlank ����String����
	//@NotNull  ���ڻ���������
	@NotBlank(message="�û�������Ϊ��")
	private String username;										//�û���
	@Length(min=6,max=18,message="���볤�ȱ�����6~18λ")
	private String password;										//�û�����
	@Email(message="�����ʽ����ȷ")
	private String email;											//�û�����
	@Pattern(regexp="[1][3|4|5|7|8][0-9]{9}",message="�ֻ������ʽ����ȷ")
	private String phone;											//�û��绰
	
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
