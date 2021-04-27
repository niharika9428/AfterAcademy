package com.questions.maths;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("MMMCMXCIX"));
	}

	public static int romanToInt(String roman) {
		int num = 0;
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		for (int i = 0; i < roman.length(); i++) {
			if (i > 0 && map.get(roman.charAt(i)) > map.get(roman.charAt(i - 1))) {
				num += (map.get(roman.charAt(i)) - (2 * map.get(roman.charAt(i - 1))));
			} else {
				num += map.get(roman.charAt(i));
			}
		}

		return num;
	}
}
