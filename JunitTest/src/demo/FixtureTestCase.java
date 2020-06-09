package demo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import demo.Calculator;

/**
 * 固件测试
 * @version
 */
public class FixtureTestCase {
	
	private static Calculator cal = new Calculator();
	
	/**
	 * 测试用例初始化时，执行方法
	 */
	@BeforeClass
	public static void setUpClass() {
		System.out.println("执行setUpClass方法!");
	}
	
	/**
	 * 所有测试方法执行完毕后，执行方法
	 */
	@AfterClass
	public static void tearDownClass() {
		System.out.println("执行tearDownClass方法!");
	}

	/**
	 * 每个方法执行前
	 */
	@Before
	public void setUp() {
		System.out.println("执行setUp方法!");
		cal.clear();
	}
	
	/**
	 * 每个方法执行后
	 */
	@After
	public void tearDown() {
		System.out.println("执行tearDown方法!");
		//cal.clear();
	}
	
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
		//cal.clear();
		cal.add(10);
		cal.substract(2);
		assertEquals(8, cal.getResult());
	}
}
