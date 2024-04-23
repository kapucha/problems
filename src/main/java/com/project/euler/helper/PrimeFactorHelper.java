package com.project.euler.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimeFactorHelper {

	public static List<Long> findAllPrimeFactorsForANumber(Long number) {
		List<Long> result = new ArrayList<Long>();
		for (Long i = 2L; i < number / 2; i++) {
			if (number % i == 0 && isAPrimeFactor(i)) {
				result.add(i);
			}
		}
		return result;
	}

	private static boolean isAPrimeFactor(Long number) {
		for (Long i = 2L; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static Map<Long, Boolean> eratosthenesSieve(Long number) {
		List<Long> primes = new ArrayList<Long>();
		primes.add(2L);
		for (Long i = 3L; i < number; i++) {
			for (Long prime : primes) {
				if (i % prime == 0)
					;
				else {
					primes.add(i);
				}
			}
		}

		Map<Long, Boolean> numbers = new HashMap<Long, Boolean>();
		for (Long i = 2L; i < number; i++) {
			numbers.put(i, true);
		}

		return numbers;
	}

}
