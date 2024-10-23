package com.example.demo_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class CollectionTest {
	@Test
	public void listTest() {
		Bank bank = new Bank();

		// List是介面(interface),只是用來定義方法，無任何實作，因此無法使用new建立實例
		// ArrayList 是用來實現定義在 List 中方法的實作類別
		List<Bank> list = new ArrayList<>();

		// List 中的資料型態不能放8種資料型態，意思就是只能放類別
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(2);
		intList.add(3);

		for (Integer item : intList) {
			System.out.println(item);
		}
	}

	@Test
	public void listTest1() {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(2);
		intList.add(3);

		// 要對List內容做增刪，建議使用forloop
		for (int i = 0; i < intList.size(); i++) {
			if (intList.get(i) == 2) {
				intList.remove(intList.get(i));
			}
			System.out.println(intList.get(i));
		}

		// 用 foreach 迴圈不能對 list 做增刪，因為長度已經被決定，不能改變原本長度
		for (Integer item : intList) {
			System.out.println(item);
			if (item == 2) {
				intList.remove(item);
			}
			System.out.println(item);
		}
	}

	@Test
	public void listTest2() {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		System.out.println(list.getFirst());
	}

	@Test
	public void hashSetTest() {
		// Set
		// 1.相同的元素只會保留一個(不允許重複)
		// 2.無序(不會依照新增的順序排列)
		Set<String> strSet = new HashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void linkedHashSetTest() {
		// linkedHashSet
		// 1.相同的元素只會保留一個(不允許重複)
		// 2.有序(會依照新增的順序排列)
		Set<String> strSet = new LinkedHashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}

	}

	@Test
	public void treeSetTest() {
		// TreeSet
		// 1.相同的元素只會保留一個(不允許重複)
		// 2.由小到大排序
		Set<String> strSet = new TreeSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void setTest() {
		Set<Integer> intTreeSet = new TreeSet<>();

		while (intTreeSet.size() < 5) {
			int randNum = (int) (Math.random() * 10) + 1;
			intTreeSet.add(randNum);
		}

		// 印出小到大
		for (Integer item : intTreeSet) {
			System.out.println(item);
		}

		// 印出大到小(要轉成list)
		List<Integer> intList = new ArrayList<>(intTreeSet);
		for (int i = intList.size() - 1; i >= 0; i--) {
			System.out.println(intList.get(i));
		}

		int minNum = intList.get(0);
		int maxNum = intList.get(intList.size() - 1);

		// 印出最大和最小
		System.out.println(minNum);
		System.out.println(maxNum);

	}

	@Test
	public void setTest2() {
		Set<Integer> set = new TreeSet<>();
		Random ran = new Random();

		for (; set.size() < 5;) {
			// 匿名方式
			set.add(ran.nextInt(1, 11));
		}

		// 轉型:將值的資料型態轉換成另一種
		// 1.被轉型的資料型態要有小括號(TreeSet<Integer>)set
		// 2.使用小括號將轉換的資料型態要和值框一起，才能使用轉換型態後的方法
		System.out.println("min: " + ((TreeSet<Integer>) set).first());
		System.out.println("max: " + ((TreeSet<Integer>) set).last());
	}

	@Test
	public void mapTest() {
		// Map<key type, value type>
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");

		// Get value through key
		String str = map.get(2);
		System.out.println(str);

		// use forEach to get all items in the map
		// Convert map to entrySet, item includes key and value
		for (Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}

		// Covert map to keySet, every item represents a key
		for (Integer item : map.keySet()) {
			System.out.println(map.get(item));
		}

		// "A" will be replaced by "D"
		map.put(1, "D");

		// value can be duplicated
		map.put(4, "D");

		for (Integer item : map.keySet()) {
			System.out.println(map.get(item));
		}
	}

	@Test
	public void mapTest2() {
		// key-value is an 1on1 pair
		Map<Integer, String> map = new HashMap();

		// key-value is an 1 on Many
		Map<Integer, String[]> map2 = new HashMap();
		Map<Integer, List<String>> map3 = new HashMap();
		Map<Integer, Set<String>> map4 = new HashMap();
		Map<Integer, Map<String, String>> map5 = new HashMap();
	}

	@Test
	public void testEmpty() {
		// isEmpty: Check if collections or Map's size are 0(empty
		List<String> list = new ArrayList<>();
		System.out.println(list.isEmpty());

		Set<String> set = new HashSet<>();
		System.out.println(set.isEmpty());

		Map<String, String> map = new HashMap<>();
		System.out.println(map.isEmpty());

		System.out.println("============");

		// because list2 is null, you can't call method on null
		List<String> list2 = null;
		System.out.println(list2.isEmpty());
	}

	@Test
	public void twoSum() {
		Map<Integer, List<Integer>> integerMap = new HashMap<>();

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				integerMap.put(nums[i] + nums[j], Arrays.asList(i, j));
			}
		}

		if (integerMap.containsKey(target)) {
			System.out.println(integerMap.get(target));
		} else {
			System.out.println("Not included");
		}
	}

	@Test
	public int[] twoSumHashTable(int[] nums, int target) {
		int[] res = new int[2];
		if (nums == null || nums.length == 0) {
			return res;
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			if (map.containsKey(temp)) {
				res[1] = i;
				res[0] = map.get(temp);
				break;
			}
			map.put(nums[i], i);
		}

		return res;
	}

	@Test
	public void showResult() {
		Bank2 bank = new Bank2("玉山", 1000);
		PersonInfo info = new PersonInfo("D12345678", "家銓", 25, "台南", bank);
		System.out.println(info.getName());
		System.out.println(info.getBank().getBranchTitle());
		System.out.println(info.getCity());
		System.out.println(info.getAge());
		System.out.println(info.getId());
	}
}
