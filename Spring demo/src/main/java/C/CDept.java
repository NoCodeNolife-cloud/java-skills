package C;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 11 星期五 下午 12:52
 * 描述:
 */
public class CDept {
	//部门编号
	private String deptNo;
	//部门名称
	private String deptName;

	public CDept(String deptNo, String deptName) {
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
