package jp.leve_five.careerup.CalculatorMain;

import java.math.BigDecimal;

import javax.script.*;

public class NumericalFormula {

	public double calculate(String inputFomula) {
		double result = 0;
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		try {
			result = (Double) engine.eval(inputFomula);
			result = new BigDecimal(result).setScale(2, BigDecimal.ROUND_HALF_UP)
			.doubleValue();//小数点2以下は四捨五入。
		} catch (ScriptException e) {
			throw new RuntimeException("不正な数式が含まれています。");
		}
		return result;
	}
}