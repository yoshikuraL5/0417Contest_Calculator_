package jp.leve_five.careerup.CalculatorTest;

import static org.junit.Assert.*;
import jp.leve_five.careerup.CalculatorMain.NumericalFormula;

import org.junit.Before;
import org.junit.Test;

public class InputNumericalFormulaTest {
	NumericalFormula inputNumericalFomula;
	@Before
	public void before() {
		inputNumericalFomula = new NumericalFormula();
	}

	@Test
	public void test1たす１は２が返る() {
		assertTrue(2 == inputNumericalFomula.calculate("1+1"));
	}

	@Test
	public void testマイナス１足す５００は499が返る() {
		assertTrue(499 == inputNumericalFomula.calculate("-1+500"));
	}

	@Test
	public void test0点１足す1点4は1点5が返る() {
		assertTrue(1.5 == inputNumericalFomula.calculate("0.1+1.4"));
	}

	@Test
	public void test２引く１は１が返る() {
		assertTrue(1 == inputNumericalFomula.calculate("2-1"));
	}

	@Test
	public void test２２引く８は１４が返る() {
		assertTrue(14 == inputNumericalFomula.calculate("22-8"));
	}

	@Test
	public void test1304引く1111は193が返る() {
		assertTrue(193 == inputNumericalFomula.calculate("1304-1111"));
	}

	@Test
	public void test２とマイナス１００をminusメソッドに渡すとが102返る() {
		assertTrue(102 == inputNumericalFomula.calculate("2-(-100)"));
	}

	@Test
	public void test3点4と2点2をminusメソッドに渡すとが1点2返る() {
		assertTrue(1.2 == inputNumericalFomula.calculate("3.4-2.2"));
	}
	
	@Test
	public void test１掛ける１は１が返る(){
		assertTrue(1 == inputNumericalFomula.calculate("1*1"));
	}
	@Test
	public void test４掛ける５は20が返る(){
		assertTrue(20 == inputNumericalFomula.calculate("4*5"));
	}
	@Test
	public void testマイナス80掛ける５はマイナス400が返る(){
		assertTrue(-400 == inputNumericalFomula.calculate("-80*5"));
	}
	@Test
	public void test0点5掛けるマイナス10はマイナス5が返る(){
		assertTrue(-5 == inputNumericalFomula.calculate("0.5*(-10)"));
	}
	@Test
	public void test2割る2は1が返る(){
		assertTrue(1 == inputNumericalFomula.calculate("2/2"));
	}
	@Test
	public void testマイナス100割る5はマイナス20が返る(){
		assertTrue(-20 == inputNumericalFomula.calculate("-100/5"));
	}
	@Test
	public void test5割る3は1点67が返る(){
		assertTrue(1.67 == inputNumericalFomula.calculate("5/3"));
	}
	@Test
	public void test１と３は0点33が返る(){
		assertTrue(0.33 == inputNumericalFomula.calculate("1/3"));
	}
	@Test(expected = RuntimeException.class)
	public void test10割る0は例外が発生する(){
		inputNumericalFomula.calculate("10/0");
	}
	
	@Test
	public void testカッコ１引く５閉じる掛ける９はマイナス３６が返る() {
		assertTrue(-36 == inputNumericalFomula.calculate("(1-5)*9"));
	}

	@Test
	public void testカッコ8引く5閉じるカッコ3掛ける5は45が返る() {
		assertTrue(45 == inputNumericalFomula.calculate("(8-5)*(3*5)"));
	}

	@Test(expected = RuntimeException.class)
	public void test１足す足す１は例外が発生する() {
		inputNumericalFomula.calculate("1++1");
	}

}
