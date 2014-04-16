package jp.leve_five.careerup.CalculatorTest;

import static org.junit.Assert.*;
import jp.leve_five.careerup.CalculatorMain.FortuneTeller;

import org.junit.Test;

public class FortuneTellerTest {

	@Test
	public void test8桁の数字を渡すと1の占い結果が返る(){
		FortuneTeller fortune = new FortuneTeller();
		String result = fortune.tellFotune("19880101");
		assertEquals("物事を始めるのに良い時期。一人でも未経験のことにもチャレンジできそうなころ。", result);
	}
	@Test
	public void test8桁の数字を渡すと2の占い結果が返る(){
		FortuneTeller fortune = new FortuneTeller();
		String result = fortune.tellFotune("19890101");
		assertEquals("公私ともに協力者が得られそう。1対1の付き合いが大事にできる時期。", result);
	}
	@Test
	public void test8桁の数字を渡すと3の占い結果が返る(){
		FortuneTeller fortune = new FortuneTeller();
		String result = fortune.tellFotune("19890201");
		assertEquals("目標が定まり仲間が集まる時期。フットワークを軽くしてゆくと良い頃。", result);
	}
	@Test
	public void test8桁の数字を渡すと4の占い結果が返る(){
		FortuneTeller fortune = new FortuneTeller();
		String result = fortune.tellFotune("19890202");
		assertEquals("どっしりと安定し落ち着ける時期。内側の守りに徹するといいことが有りそう。", result);
	}
	@Test
	public void test8桁の数字を渡すと5の占い結果が返る(){
		FortuneTeller fortune = new FortuneTeller();
		String result = fortune.tellFotune("19890212");
		assertEquals("自由な行動と発想が得られる時期。興味を持ったものにはどんどん首を突っ込むのがオススメ。", result);
	}
	@Test
	public void test8桁の数字を渡すと6の占い結果が返る(){
		FortuneTeller fortune = new FortuneTeller();
		String result = fortune.tellFotune("19890312");
		assertEquals("調和・見た目の美しさが問われる時期。今までの行動を見栄え良くまとめるのに吉。", result);
	}
	@Test
	public void test8桁の数字を渡すと7の占い結果が返る(){
		FortuneTeller fortune = new FortuneTeller();
		String result = fortune.tellFotune("19990222");
		assertEquals("学問・研究・開発に最適の時期。多少変わった分野でも没頭することでいい内容を得られそう。", result);
	}
	@Test
	public void test8桁の数字を渡すと8の占い結果が返る(){
		FortuneTeller fortune = new FortuneTeller();
		String result = fortune.tellFotune("19990223");
		assertEquals("周囲に支えられてグループで一定の成果を収められる頃。ピンチの時に頼れる仲間が増える時期。", result);
	}
	@Test
	public void test8桁の数字を渡すと9の占い結果が返る(){
		FortuneTeller fortune = new FortuneTeller();
		String result = fortune.tellFotune("19990323");
		assertEquals("やってきたことに何かしらの成果や結論を求められる時。区切りをつけるには最適の時期。", result);
	}
	

}
