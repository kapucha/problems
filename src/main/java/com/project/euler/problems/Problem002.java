package com.project.euler.problems;

import java.util.List;

import com.project.euler.helper.FibonacciHelper;

public class Problem002 {

	public static Long findSumOfEvenValuedFibBelowNumber(Long number) {
		Long result = 0L;

		List<Long> fibonacciList = FibonacciHelper.getFibNumbersBelowNumber(number);

		for (Long fib : fibonacciList) {
			if (fib % 2 == 0) {
				result += fib;
			}
		}
		return result;
	}
}
