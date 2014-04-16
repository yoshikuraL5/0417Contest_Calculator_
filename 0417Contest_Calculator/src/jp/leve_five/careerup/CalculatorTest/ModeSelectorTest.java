package jp.leve_five.careerup.CalculatorTest;

import static org.junit.Assert.*;
import jp.leve_five.careerup.CalculatorMain.InputNumericalFormula;
import jp.leve_five.careerup.CalculatorMain.ModeSelector;

import org.junit.Before;
import org.junit.Test;

public class ModeSelectorTest {
	ModeSelector modeSelector;
	
	@Test
	public void test数式を渡すと計算結果が返ってくる() {
		modeSelector = new ModeSelector("-1+1");
		double result = modeSelector.getComputation();
		assertTrue(0 == result);
	}
	@Test
	public void test数式1かける４足す１を渡すと計算結果が返ってくる() {
		modeSelector = new ModeSelector("1*4+1");
		double result = modeSelector.getComputation();
		assertTrue(5 == result);
	}
	
	@Test
	public void test８桁の数字を渡すと本日の運勢が占える(){
		modeSelector = new ModeSelector("19990101");
		String result = modeSelector.getFortuneTelling();
		assertEquals("目標が定まり仲間が集まる時期。フットワークを軽くしてゆくと良い頃。", result);
	}
	
	@Test(expected = RuntimeException.class)
	public void test８桁の数字でも数字でもない入力を渡すと例外が発生する(){
		modeSelector = new ModeSelector("2828っf");
	}
	

}
