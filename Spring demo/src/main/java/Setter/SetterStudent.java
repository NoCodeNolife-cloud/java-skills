package Setter;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 10 星期四 下午 5:26
 * 描述:
 */
public class SetterStudent {
	private int id;
	private String name;
	private SetterGrade grade;

	//无参构造方法，在没有其他带参构造方法的情况下，可以省略
	public SetterStudent() {
	}

	//id 属性的 setter 方法
	public void setId(int id) {
		this.id = id;
	}

	//name 属性的 setter 方法
	public void setName(String name) {
		this.name = name;
	}

	public void setGrade(SetterGrade grade) {
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
