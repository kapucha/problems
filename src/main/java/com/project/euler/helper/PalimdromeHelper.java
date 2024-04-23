package com.project.euler.helper;

public class PalimdromeHelper {

	public static boolean isPamindrome(Long number) {
		int[] elements;
		Long reversed = number.reverse(number);

		if (number.equals(reversed)) {
			return true;
		} else
			return false;
	}

}
