package jp.leve_five.careerup.CalculatorMain;

public class InputMain {
	public static void main(String[]args){
		//文字列の入力　数式　または　生年月日8桁を文字列として入力する。
		String inputData = "19880301"; //19800101　など
		new ModeSelector(inputData);
	}
}
