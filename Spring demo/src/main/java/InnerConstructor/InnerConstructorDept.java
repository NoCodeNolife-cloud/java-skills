package InnerConstructor;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 12 星期六 上午 1:09
 * 描述:
 */
public class InnerConstructorDept {
	//部门编号
	private String deptNo;
	//部门名称
	private String deptName;

	public InnerConstructorDept(String deptNo, String deptName) {
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Dept{" +
				"deptNo='" + deptNo + '\'' +
				", deptName='" + deptName + '\'' +
				'}';
	}
}
