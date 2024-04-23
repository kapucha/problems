package com.project.euler.helper;

import java.util.ArrayList;
import java.util.List;

public class FibonacciHelper {

	public static List<Long> getFibNumbersBelowNumber(Long number) {
		List<Long> fibonacciList = new ArrayList<Long>();
		Long fstFib = 1L;
		Long sndFib = 2L;

		fibonacciList.add(fstFib);
		fibonacciList.add(sndFib);

		for (Long i = 3L; i < number;) {
			fstFib = i;
			sndFib = fstFib + sndFib;

			fibonacciList.add(fstFib);
			fibonacciList.add(sndFib);

			i = fstFib + sndFib;
		}

		return fibonacciList;
	}

}
