package InnerSetter;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 11 星期五 下午 10:24
 * 描述:
 */
public class InnerSetterEmployee {
	//员工编号
	private String empNo;
	//员工姓名
	private String empName;
	//部门信息
	private InnerSetterDept dept;

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDept(InnerSetterDept dept) {
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
