import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 项目名:  JUnit
 * 开发者:  Administrator
 * 创建于:  2022 三月 03 星期四 16:27
 * 描述:
 */
public class TestJunit {

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		assertEquals(message, messageUtil.printMessage());
	}
}
