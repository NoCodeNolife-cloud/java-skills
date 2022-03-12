package Setter;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 10 星期四 下午 5:27
 * 描述:
 */
public class SetterGrade {
	private Integer gradeId;
	private String gradeName;

	/**
	 * 无参构造函数
	 * 若该类中不存在其他的带参构造函数，则这个默认的无参构造函数可以省略
	 */
	public SetterGrade() {
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	@Override
	public String toString() {
		return "Grade{" +
				"gradeId=" + gradeId +
				", gradeName='" + gradeName + '\'' +
				'}';
	}
}
