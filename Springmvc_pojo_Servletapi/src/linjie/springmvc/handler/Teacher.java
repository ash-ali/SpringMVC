package linjie.springmvc.handler;
/**
* @author LinJie E-mail:xulinjie0105@gmail.com
* @version 创建时间：2018年5月17日 下午2:35:25
* 教师实体类
*/
public class Teacher {
	public String tname;//姓名
	public String course;//教授课程
	/**
	 * @return the tname
	 */
	public String getTname() {
		return tname;
	}
	/**
	 * @param tname the tname to set
	 */
	public void setTname(String tname) {
		this.tname = tname;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [tname=" + tname + ", course=" + course + "]";
	}
	
}
