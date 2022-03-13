package SpringBeanInheritance;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 13 星期日 下午 5:37
 * 描述:
 */
public class Dog extends Animal {
	private String call;

	public void setCall(String call) {
		System.out.println("Dog setCall：" + call);
		this.call = call;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + getName() + '\'' +
				", age=" + getAge() +
				", call='" + call + '\'' +
				'}';
	}
}
