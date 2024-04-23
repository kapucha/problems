package com.project.euler.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem001 {

	public static int findSumMultipliesOf3And5BelowNumber(int number) {
		int result = 0;
		List<Integer> multiplies = new ArrayList<>();
		for (int i = 3; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				multiplies.add(i);
			}
		}
		for (Integer integer : multiplies) {
			result += integer;
		}
		return result;
	}
}
