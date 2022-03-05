import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * 项目名:  JUnit TestCase
 * 开发者:  Administrator
 * 创建于:  2022 三月 04 星期五 18:37
 * 描述:
 */
public class TestJunit extends TestCase {

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
		System.out.println("Test Case Name = " + this.getName());

		//test setName
		this.setName("testNewAdd");
		System.out.println("Updated Test Case Name = " + this.getName());
	}

	//tearDown used to close the connection or clean up activities
	public void tearDown() {
	}
}
