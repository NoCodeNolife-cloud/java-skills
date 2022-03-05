import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * 项目名:  JUnit TestCase
 * 开发者:  Administrator
 * 创建于:  2022 三月 04 星期五 18:42
 * 描述:
 */
public class TestRunner {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(TestJunit.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
