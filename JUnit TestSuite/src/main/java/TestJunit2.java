import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * 项目名:  JUnit TestSuite
 * 开发者:  Administrator
 * 创建于:  2022 三月 04 星期五 22:12
 * 描述:
 */
public class TestJunit2 extends TestCase {
	protected double fValue1;
	protected double fValue2;

	@Before
	public void setUp() {
		fValue1 = 2.0;
		fValue2 = 3.0;
	}

	@Test
	public void testAdd() {
		//count the number of test cases
		System.out.println("No of Test Case = " + this.countTestCases());

		//test getName
		String name = this.getName();
		System.out.println("Test Case Name = " + name);

		//test setName
		this.setName("testNewAdd");
		String newName = this.getName();
		System.out.println("Updated Test Case Name = " + newName);
	}

	//tearDown used to close the connection or clean up activities
	public void tearDown() {
	}
}