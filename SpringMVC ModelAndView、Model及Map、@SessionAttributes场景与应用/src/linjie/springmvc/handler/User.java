package linjie.springmvc.handler;
/**
* @author ǳȻ 	xulinjie0105@gmail.com
* @version ����ʱ�䣺2018��5��19�� ����11:46:28
* UserPOJO
*/
public class User {
	private String username;
	private int age;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + "]";
	}
	
}
