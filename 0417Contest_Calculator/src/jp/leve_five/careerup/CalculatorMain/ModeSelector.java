package jp.leve_five.careerup.CalculatorMain;

import java.util.regex.Pattern;

public class ModeSelector {
	private double result = 0;
	private String divinationResult = null;

	public ModeSelector(String inputData) {
		if (Pattern.matches("[1-2][0-9]{3}[0-1][1-9][0-3][0-9]", inputData)) {
			divinationResult = new FortuneTeller().tellFotune(inputData);
			System.out.println("今月の運勢は、\n【" + divinationResult + "】");
		} else if (Pattern.matches(
				"[\\-*[1-9]+[\\+\\-\\*\\/\\(\\)]+\\-[1-9]+]+", inputData)) {
			result = new NumericalFormula().calculate(inputData);
			System.out.println("数式の結果は：【" + result + "】です！");
		} else {
			throw new RuntimeException("計算も占いもできません！入力値を見なおしてください");
		}

	}

	public double getComputation() {
		return result;
	}

	public String getFortuneTelling() {
		return divinationResult;
	}
}
