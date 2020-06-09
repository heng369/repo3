package demo;

import org.junit.Assert;
import org.junit.Test;
import demo.Calculator;

/**
 * 限时测试
 * @version
 */
public class TimeoutTestCase {

	private Calculator cal = new Calculator();
	
	/**
	 * 测试求平方根
	 */
	@Test(timeout=1000)
	public void testSquareRoot() {
		cal.squareRoot(4);
		Assert.assertEquals(2, cal.getResult());
	}
}

