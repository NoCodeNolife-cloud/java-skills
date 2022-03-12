package Constructor;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 10 星期四 下午 5:22
 * 描述:
 */
public class ConstructorGrade {
	private Integer gradeId;
	private String gradeName;

	public ConstructorGrade(Integer gradeId, String gradeName) {
		this.gradeId = gradeId;
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
