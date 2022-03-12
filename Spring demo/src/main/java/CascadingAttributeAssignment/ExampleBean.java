package CascadingAttributeAssignment;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 12 星期六 下午 9:50
 * 描述:
 */
public class ExampleBean {
	//Null值
	private String propertyNull;
	//空字符串
	private String propertyEmpty;
	//包含特殊符号的字面量
	private String propertyLiteral;
	//依赖的 Bean(对象属性)
	private DependBean dependBean;

	public void setPropertyEmpty(String propertyEmpty) {
		this.propertyEmpty = propertyEmpty;
	}

	public void setPropertyNull(String propertyNull) {
		this.propertyNull = propertyNull;
	}

	public void setPropertyLiteral(String propertyLiteral) {
		this.propertyLiteral = propertyLiteral;
	}

	//使用级联属性赋值时，需提供一个依赖对象的 getXxx() 方法
	public DependBean getDependBean() {
		return dependBean;
	}

	public void setDependBean(DependBean dependBean) {
		this.dependBean = dependBean;
	}

	@Override
	public String toString() {
		return "ExampleBean{" +
				"propertyNull='" + propertyNull + '\'' +
				", propertyEmpty='" + propertyEmpty + '\'' +
				", propertyLiteral='" + propertyLiteral + '\'' +
				", dependBean=" + dependBean +
				'}';
	}
}
