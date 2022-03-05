import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * 项目名:  JUnit TestSuite
 * 开发者:  Administrator
 * 创建于:  2022 三月 04 星期五 22:05
 * 描述:
 */
public class JunitTestSuite {

	public static void main(String[] a) {

		// add the test's in the suite
		TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestJunit3.class);
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("Number of test cases = " + result.runCount());
	}
}
