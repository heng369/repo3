package demo;


/**
 * 简单计算类，作为被测试的对象
 * @version
 */
public class Calculator {
	
	private int result; // 静态变量，用于存储运行结果

	/**
	 * 加法运算
	 * @param n
	 */
	public void add(int n) {
		result = result + n;
	}

	/**
	 * 减法运算
	 * @param n
	 */
	public void substract(int n) {
		result = result - n;
	}

	/**
	 * 乘法运算
	 * @param n
	 */
	public void multiply(int n) {
	} // 此方法尚未写好

	/**
	 * 除法运算
	 * @param n
	 */
	public void divide(int n) {
		result = result / n;
	}

	/**
	 * 平方
	 * @param n
	 */
	public void square(int n) {
		result = n * n;
	}

	/**
	 * 平方根
	 * @param n
	 */
	public void squareRoot(int n) {
		for (;;)
			; // Bug : 死循环
	}

	/**
	 * 结果清零
	 */
	public void clear() { // 将结果清零
		result = 0;
	}

	/**
	 *返回结果集
	 * @return
	 */
	public int getResult() {
		return result;
	}
}

