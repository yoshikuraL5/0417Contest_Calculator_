package jp.leve_five.careerup.CalculatorMain;

import java.math.BigDecimal;

public class Calculator {

	public double plus(double a, double b) {
		return new BigDecimal(a + b).setScale(2, BigDecimal.ROUND_HALF_UP)
				.doubleValue();//小数点2以下は四捨五入。
	}

	public double minus(double a, double b) {
		return new BigDecimal(a - b).setScale(2, BigDecimal.ROUND_HALF_UP)
				.doubleValue();
	}

	public double multiply(double a, double b) {
		return new BigDecimal(a * b).setScale(2, BigDecimal.ROUND_HALF_UP)
				.doubleValue();
	}

	public double devide(double a, double b) {
		if (b == 0) {
			return 0;
		}
		return new BigDecimal(a / b).setScale(2, BigDecimal.ROUND_HALF_UP)
				.doubleValue();
	}

}
