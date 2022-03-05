import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 项目名:  JUnit TestSuite
 * 开发者:  Administrator
 * 创建于:  2022 三月 04 星期五 22:10
 * 描述:
 */
public class TestJunit1 {

	@Test
	public void testAdd() {
		//test data
		int num = 5;
		String temp = null;
		String str = "Junit is working fine";

		//check for equality
		assertEquals("Junit is working fine", str);

		//check for false condition
		assertFalse(num > 6);

		//check for not null value
		assertNotNull(str);
	}
}
