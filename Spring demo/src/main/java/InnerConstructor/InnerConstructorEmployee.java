package InnerConstructor;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 12 星期六 上午 1:10
 * 描述:
 */
public class InnerConstructorEmployee {
	//员工编号
	private String empNo;
	//员工姓名
	private String empName;
	//部门信息
	private InnerConstructorDept dept;

	public InnerConstructorEmployee(String empNo, String empName, InnerConstructorDept dept) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"empNo='" + empNo + '\'' +
				", empName='" + empName + '\'' +
				", dept=" + dept +
				'}';
	}
}
