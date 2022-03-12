package Constructor;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 10 星期四 下午 5:22
 * 描述:
 */
public class ContructorStudent {
	private int id;
	private String name;
	private ConstructorGrade grade;

	public ContructorStudent(int id, String name, ConstructorGrade grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", grade=" + grade +
				'}';
	}
}
