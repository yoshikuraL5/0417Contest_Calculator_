package jp.leve_five.careerup.CalculatorMain;

public class FortuneTeller {

	public String tellFotune(String dateOfBirth) {
		int number = new FortuneTeller().calculate(dateOfBirth);
		String fotuneResult = null;

		switch (number) {
		case 1:
			fotuneResult = "物事を始めるのに良い時期。一人でも未経験のことにもチャレンジできそうなころ。";
			break;
		case 2:
			fotuneResult = "公私ともに協力者が得られそう。1対1の付き合いが大事にできる時期。";
			break;
		case 3:
			fotuneResult = "目標が定まり仲間が集まる時期。フットワークを軽くしてゆくと良い頃。";
			break;
		case 4:
			fotuneResult = "どっしりと安定し落ち着ける時期。内側の守りに徹するといいことが有りそう。";
			break;
		case 5:
			fotuneResult = "自由な行動と発想が得られる時期。興味を持ったものにはどんどん首を突っ込むのがオススメ。";
			break;
		case 6:
			fotuneResult = "調和・見た目の美しさが問われる時期。今までの行動を見栄え良くまとめるのに吉。";
			break;
		case 7:
			fotuneResult = "学問・研究・開発に最適の時期。多少変わった分野でも没頭することでいい内容を得られそう。";
			break;
		case 8:
			fotuneResult = "周囲に支えられてグループで一定の成果を収められる頃。ピンチの時に頼れる仲間が増える時期。";
			break;
		case 9:
			fotuneResult = "やってきたことに何かしらの成果や結論を求められる時。区切りをつけるには最適の時期。";
			break;
		}
		return fotuneResult;
	}

	public int calculate(String dateOfBirth) {
		byte stringBytes[] = dateOfBirth.getBytes();
		int result = 0;

		for (int i = 0; i < stringBytes.length; i++) {
			result += (int) new Calculator().plus(stringBytes[i] - '0',
					stringBytes[++i] - '0');
		}
		while (result / 10 != 0) {
			result = (int) new Calculator().plus(result / 10, result % 10);
		}


		return result;
	}

}
