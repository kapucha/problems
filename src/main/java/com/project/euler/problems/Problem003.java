package com.project.euler.problems;

import java.util.List;

import com.project.euler.helper.PrimeFactorHelper;

public class Problem003 {

	public static Long findTheLargestPrimeFactorForNumber(Long number) {
		List<Long> primeFactors = PrimeFactorHelper.findAllPrimeFactorsForANumber(number);
		return primeFactors.get(primeFactors.size() - 1);
	}
}
