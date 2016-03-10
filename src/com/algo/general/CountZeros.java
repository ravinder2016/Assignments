package com.algo.general;

public class CountZeros {

	public static void main(String[] args) {

		int[] in = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 5, 7, 10 };
		int len = in.length;
		int result = countZeros(in, len);
		System.out.println("Total Number of zeros in array " + result);
	//	System.out.println("Zeros in array : "+ countZeros(in, len));
	}

	private static int countZeros(int[] in, int len) {
		int low = 0;
		int high = len - 1;
		int mid;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (in[mid] == 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		if (in[high] == 0)
			return high + 1;
		if (in[low] == 0)
			return low + 1;
		return -1;
	}

}
