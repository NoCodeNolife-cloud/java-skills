package SpringBeanInheritance;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 13 星期日 下午 5:36
 * 描述:
 */
public class Animal {
	private String name;
	private Integer age;

	public void setName(String name) {
		System.out.println("Animal setName：" + name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		System.out.println("Animal setAge：" + age);
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
