package jp.leve_five.careerup.CalculatorTest;

import static org.junit.Assert.*;
import jp.leve_five.careerup.CalculatorMain.Calculator;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator;

	@Before
	public void before() {
		calculator = new Calculator();
	}

	@Test
	public void test数字の１と１をplusメソッドに渡すと２が返る() {
		assertEquals(2, calculator.plus(1, 1));
	}
	@Test
	public void test数字の１と２をplusメソッドに渡すと３が返る() {
		assertEquals(3, calculator.plus(1, 2));
	}	
	@Test
	public void test数字の３と７をplusメソッドに渡すと１０が返る(){
		assertEquals(10, calculator.plus(3, 7));
	}
	
	@Test
	public void test数字の６０と９４０をplusメソッドに渡すと１０００が返る(){
		assertEquals(1000, calculator.plus(60, 940));
	}
	@Test
	public void test数字のマイナス１と５００をplusメソッドに渡すと499が返る(){
		assertEquals(499, calculator.plus(-1, 500));
	}
	@Test
	public void test数字の２と１をminusメソッドに渡すと１が返る(){
		assertEquals(1, calculator.minus(2, 1));
	}
	@Test
	public void test数字の３と１をminusメソッドに渡すと２が返る(){
		assertEquals(2, calculator.minus(3, 1));
	}
	@Test
	public void test数字の２２と８をminusメソッドに渡すと１４が返る(){
		assertEquals(14, calculator.minus(22, 8));
	}
	@Test
	public void test数字の150と44をminusメソッドに渡すと106が返る(){
		assertEquals(106, calculator.minus(150, 44));
	}
	@Test
	public void test数字の1304と1111をminusメソッドに渡すと193が返る(){
		assertEquals(193, calculator.minus(1304, 1111));
	}
	@Test
	public void test数字の２とマイナス１００をminusメソッドに渡すとが102返る(){
		assertEquals(102, calculator.minus(2, -100));
	}
	@Test
	public void test数字の１と１をmultiplyメソッドに渡すと１が返る(){
		assertEquals(1, calculator.multiply(1, 1));
	}
	@Test
	public void test数字の１と2をmultiplyメソッドに渡すと2が返る(){
		assertEquals(2, calculator.multiply(1, 2));
	}
	@Test
	public void test数字の4と5をmultiplyメソッドに渡すと20が返る(){
		assertEquals(20, calculator.multiply(4, 5));
	}
	@Test
	public void test数字の20と300をmultiplyメソッドに渡すと6000が返る(){
		assertEquals(6000, calculator.multiply(20, 300));
	}
	@Test
	public void test数字のマイナス８０と５をmultiplyメソッドに渡すとマイナス４００が返る(){
		assertEquals(-400, calculator.multiply(-80, 5));
	}
	
	
	
}
