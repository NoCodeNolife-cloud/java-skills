package C;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 11 星期五 下午 12:55
 * 描述:
 */
public class CEmployee {
	//员工编号
	private String empNo;
	//员工姓名
	private String empName;
	//部门信息
	private CDept dept;

	public CEmployee(String empNo, String empName, CDept dept) {
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
