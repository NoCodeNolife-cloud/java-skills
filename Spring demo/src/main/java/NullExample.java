/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 12 星期六 下午 12:54
 * 描述:
 */
public class NullExample {
	//Null值
	private String propertyNull;
	//空字符串
	private String propertyEmpty;
	//包含特殊符号的字面量
	private String propertyLiteral;
	//短字符串 <![CDATA[]]>
	private String cdata;

	public void setPropertyEmpty(String propertyEmpty) {
		this.propertyEmpty = propertyEmpty;
	}

	public void setPropertyNull(String propertyNull) {
		this.propertyNull = propertyNull;
	}

	public void setPropertyLiteral(String propertyLiteral) {
		this.propertyLiteral = propertyLiteral;
	}

	public void setCdata(String cdata) {
		this.cdata = cdata;
	}

	@Override
	public String toString() {
		return "NullExample{" +
				"propertyNull='" + propertyNull + '\'' +
				", propertyEmpty='" + propertyEmpty + '\'' +
				", propertyLiteral='" + propertyLiteral + '\'' +
				", cdata='" + cdata + '\'' +
				'}';
	}
}
