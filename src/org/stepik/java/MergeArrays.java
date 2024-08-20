package org.stepik.java;

public class MergeArrays {
	/**
	 * Merges two given sorted arrays into one
	 *
	 * @param a1 first sorted array
	 * @param a2 second sorted array
	 * @return new array containing all elements from a1 and a2, sorted
	 */
	public static int[] mergeArrays(int[] a1, int[] a2) {
		int[] result = new int[a1.length + a2.length];
		int c1 = 0;
		int c2 = 0;
		while (c1 < a1.length || c2 < a2.length) {
			int v1 = c1 < a1.length ? a1[c1] : Integer.MAX_VALUE;
			int v2 = c2 < a2.length ? a2[c2] : Integer.MAX_VALUE;
			result[c1 + c2] = Integer.min(v1, v2);
			if (v1 < v2) {
				c1++;
			} else {
				c2++;
			}
		}
		return result;
	}
}
