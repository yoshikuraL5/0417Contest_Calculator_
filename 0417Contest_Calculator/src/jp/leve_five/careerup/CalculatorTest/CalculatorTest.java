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
		assertTrue(2 == calculator.plus(1, 1));
	}
	@Test
	public void test数字の１と２をplusメソッドに渡すと３が返る() {
		assertTrue(3 == calculator.plus(1, 2));
	}	
	@Test
	public void test数字の３と７をplusメソッドに渡すと１０が返る(){
		assertTrue(10 == calculator.plus(3, 7));
	}
	
	@Test
	public void test数字の６０と９４０をplusメソッドに渡すと１０００が返る(){
		assertTrue(1000 == calculator.plus(60, 940));
	}
	@Test
	public void test数字のマイナス１と５００をplusメソッドに渡すと499が返る(){
		assertTrue(499 == calculator.plus(-1, 500));
	}
	
	@Test
	public void test数字の0点１と1点4をplusメソッドに渡すと1点50が返る(){
		assertTrue(1.5 == calculator.plus(0.1, 1.4));
	}
	@Test
	public void test数字の２と１をminusメソッドに渡すと１が返る(){
		assertTrue(1 == calculator.minus(2, 1));
	}
	@Test
	public void test数字の３と１をminusメソッドに渡すと２が返る(){
		assertTrue(2 == calculator.minus(3, 1));
	}
	@Test
	public void test数字の２２と８をminusメソッドに渡すと１４が返る(){
		assertTrue(14 == calculator.minus(22, 8));
	}
	@Test
	public void test数字の150と44をminusメソッドに渡すと106が返る(){
		assertTrue(106 == calculator.minus(150, 44));
	}
	@Test
	public void test数字の1304と1111をminusメソッドに渡すと193が返る(){
		assertTrue(193 == calculator.minus(1304, 1111));
	}
	@Test
	public void test数字の２とマイナス１００をminusメソッドに渡すとが102返る(){
		assertTrue(102 == calculator.minus(2, -100));
	}
	@Test
	public void test数字の3点4と2点2をminusメソッドに渡すとが1点2返る(){
		assertTrue(1.2 == calculator.minus(3.4, 2.2));
	}
	@Test
	public void test数字の１と１をmultiplyメソッドに渡すと１が返る(){
		assertTrue(1 == calculator.multiply(1, 1));
	}
	@Test
	public void test数字の１と2をmultiplyメソッドに渡すと2が返る(){
		assertTrue(2 == calculator.multiply(1, 2));
	}
	@Test
	public void test数字の4と5をmultiplyメソッドに渡すと20が返る(){
		assertTrue(20 == calculator.multiply(4, 5));
	}
	@Test
	public void test数字の20と300をmultiplyメソッドに渡すと6000が返る(){
		assertTrue(6000 == calculator.multiply(20, 300));
	}
	@Test
	public void test数字のマイナス８０と５をmultiplyメソッドに渡すとマイナス４００が返る(){
		assertTrue(-400 == calculator.multiply(-80, 5));
	}
	@Test
	public void test数字のマイナス400とマイナス33をmultiplyメソッドに渡すと13200が返る(){
		assertTrue(13200 == calculator.multiply(-400, -33));
	}
	@Test
	public void test数字の0点5とマイナス10をmultiplyメソッドに渡すとマイナス5が返る(){
		assertTrue(-5 == calculator.multiply(0.5, -10));
	}
	@Test
	public void test数字2と2をdevideメソッドに渡すと1が返る(){
		assertTrue(1 == calculator.devide(2,2));
	}
	@Test
	public void test数字4と1をdevideメソッドに渡すと4が返る(){
		assertTrue(4 == calculator.devide(4,1));
	}
	@Test
	public void test数字10と0をdevideメソッドに渡すと0が返る(){
		assertTrue(0 == calculator.devide(10,0));
	}
	@Test
	public void test数字マイナス100と5をdevideメソッドに渡すとマイナス20が返る(){
		assertTrue(-20 == calculator.devide(-100, 5));
	}
	@Test
	public void test数字5と3をdevideメソッドに渡すと1点67が返る(){
		assertTrue(1.67 == calculator.devide(5, 3));
	}
	@Test
	public void test数字１と３をdevideメソッドに渡すと0点33が返る(){
		assertTrue(0.33 == calculator.devide(1, 3));
	}
			
}
