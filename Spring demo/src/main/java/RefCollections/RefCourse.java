package RefCollections;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 12 星期六 上午 11:02
 * 描述:
 */
public class RefCourse {
	//课程编号
	private Integer courseId;
	//课程名称
	private String courseName;

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String toString() {
		return "Course{" +
				"courseId=" + courseId +
				", courseName='" + courseName + '\'' +
				'}';
	}
}
