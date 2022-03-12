package CascadingAttributeAssignment;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 12 星期六 下午 9:49
 * 描述:
 */
public class DependBean {
	private String dependProperty;

	public void setDependProperty(String dependProperty) {
		this.dependProperty = dependProperty;
	}

	@Override
	public String toString() {
		return "DependBean{" +
				"dependProperty='" + dependProperty + '\'' +
				'}';
	}
}
