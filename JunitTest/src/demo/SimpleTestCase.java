package demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import demo.Calculator;

/**
 * 简单测试类
 * @version
 */
public class SimpleTestCase {

	private static Calculator cal = new Calculator();
	
	
	/**
	 * 测试加法运算的方法
	 */
	@Test
	public void testAdd() {
		cal.add(2);
		cal.add(5);
		//第一个参数预期值，第二个参数实际值，两值比较相等测试就通过
		assertEquals(7, cal.getResult());
	}
	
	/**
	 * 测试减法运算的方法
	 */
	@Test
	public void testSubstract() {
		cal.clear();
		cal.add(10);
		cal.substract(2);
		assertEquals(8, cal.getResult());
	}
}