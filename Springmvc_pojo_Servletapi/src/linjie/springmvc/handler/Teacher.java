package linjie.springmvc.handler;
/**
* @author LinJie E-mail:xulinjie0105@gmail.com
* @version ����ʱ�䣺2018��5��17�� ����2:35:25
* ��ʦʵ����
*/
public class Teacher {
	public String tname;//����
	public String course;//���ڿγ�
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
