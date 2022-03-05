import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
import org.junit.Test;

/**
 * 项目名:  JUnit TestResult
 * 开发者:  Administrator
 * 创建于:  2022 三月 04 星期五 21:38
 * 描述:
 */
public class TestJunit extends TestResult {

	// add the error
	public synchronized void addError(Test test, Throwable t) {

		super.addError((junit.framework.Test) test, t);
	}

	// add the failure
	public synchronized void addFailure(Test test, AssertionFailedError t) {

		super.addFailure((junit.framework.Test) test, t);
	}

	@Test
	public void testAdd() {
		// add any test
	}

	// Marks that the test run should stop.
	public synchronized void stop() {
		//stop the test here
	}
}
