package com.example.demo_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Lec4Test {
	@Test
	public void arrayTest() {
		// 宣告陣列
		int[] arr1 = new int[5];
		int arr2[] = new int[7];
		double[] weathers = { 1, 2, 3, 4, 5, 6, 7 };
		Integer[] arrClass = new Integer[7];
		System.out.println(arr1[0]); // 剛宣告的陣列內容直都會是null或預設值
		System.out.println(arrClass[0]); // 用類別宣告不會有預設值，會是null
		System.out.println(this.avgWeather(weathers));

	}

	public double avgWeather(double[] weathers) {
		double sum = 0;
		for (int i = 0; i < weathers.length; i++) {
			sum += weathers[i];
		}
		return sum / weathers.length;
	}

	@Test
	public void arrayPractice() {
		double[] scores = { 1, 2, 3, 4, 5 };
		this.getScore(scores);
	}

	public void getScore(double[] scores) {
		System.out.println(Arrays.toString(scores));
		double highest = scores[0];
		double lowest = scores[0];
		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > highest) {
				highest = scores[i];
			}
			if (scores[i] < lowest) {
				lowest = scores[i];
			}
			sum += scores[i];

		}

		System.out.println(highest);
		System.out.println(lowest);
		double validScores = sum - highest - lowest;
		System.out.println(validScores);
		double validAvg = validScores / (scores.length - 2);
		System.out.println(validAvg);
	}

	public double avgScoreBySort(double[] scores) {
		// 無回傳直，只要呼叫這個方法，記憶體內的陣列就排序好了
		Arrays.sort(scores);
		double sum = 0;
		for (int i = 0; i < scores.length - 1; i++) {
			sum += scores[i];
		}
		return sum;

	}

	@Test
	public void listTest() {
		// 宣告
		List<Integer> list1 = Arrays.asList(1, 2); // 無法增刪
		List<String> list2 = List.of("1", "2"); // 無法增刪
		List<Character> list3 = new ArrayList<>();
		List<String> list7 = new ArrayList<String>(); // 後面腳括號依樣可以填資料型態，通常不寫
		List<String> list8 = new ArrayList<>(list2); // 宣告同時給值

		// 使用 ArrayList才能夠修改List內容
		list8.add("3");
		System.out.println(list8.get(2));

		// 為什麼是 new ArrayList?
		// List<Character> list5 = new List<>();
		// (1)因為list是interface的資料格式，故其沒有任何實作(實際的操作步驟)，無法被創建
		// 如果試圖new List會導致錯誤

		// list3 = new LinkedList<Character>();

		// 為什麼不使用ArrayList來裝new ArrayList的結果?
		ArrayList<Character> list4 = new ArrayList<>();
		// (1)因為ArrayList是實作List裡面定義好的方法，顧ArrayList可以被視為List的一種
		// 故List不會對ArrayList有排斥反應，可以裝進ArrayList
		// ==>只要是實作interface的類別，都可用interface作為其容易的資料型態
		// (2)因為interface可以被多個類別實作，對於interface來說，不同實作都是他的一種
		// 而對不同實作(class)來說，彼此互不相通，故無法裝進彼此
		// 因此採用 interface作為容器的資料型態，可以盛裝各式各樣的實作類別(class)

		// 例子
		double[] weather = { 30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9 };
		List<Double> weatherList1 = new ArrayList<>();
		weatherList1.add(30.0);
		weatherList1.add(26.5);
		weatherList1.add(27.5);
		weatherList1.add(23.3);
		weatherList1.add(21.8);
		weatherList1.add(28.5);
		weatherList1.add(35.9);

		List<Double> tempList = Arrays.asList(30.0, 36.5, 27.5, 23.3, 21.8, 28.5, 35.5);
		List<Double> weatherList2 = new ArrayList<>(tempList);

		List<Double> weatherList3 = new ArrayList<>(List.of(30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9));
		for (int i = 0; i < weatherList3.size(); i++) {
			System.out.print(weatherList3.get(i) + " ");
		}
	}

	public double avgWeatherByList(List<Double> weatherList) {
		double sum = 0;
//		for (int i = 0; i < weatherList.size(); i++) {
//			sum += weatherList.get(i);
//		}
//		return sum / weatherList.size();

		for (Double item : weatherList) {
			// item = weatherList.get(i)
			System.out.println(item);
		}

		weatherList.forEach(item -> {
			System.out.println(item);
		});
		return 0.0;
	}

	@Test
	public void generateDigit() {
		List<Integer> digitList = new ArrayList<>();
		int digitLength = 4;

		for (int i = 0; i < digitLength; i++) {
			int randomNumber = (int) (Math.random() * 10);
			if (digitList.contains(randomNumber)) {
				i = i - 1;
				continue;
			}
			digitList.add(randomNumber);
		}

		String output = "";

		for (int i = 0; i < digitList.size(); i++) {
			String currentDigit = String.valueOf(digitList.get(i));
			output += currentDigit;
		}

		System.out.print(output);

	}
}
