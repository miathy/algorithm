package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumGap {
	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 4, 1, 7 };
		System.out.println(minimumGap(arr));
	}

//	public static int minimumGap(int[] arr) {
//		int minGap = arr.length;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j] && i != j) {
//					int gap = Math.abs(j - i);
//					minGap = minGap < gap ? minGap : gap;
//
//				}
//			}
//		}
//		return minGap;
//
//	}
	public static int minimumGap(int[] arr) {
		int minGap = arr.length;
		List<Integer> newArr = new ArrayList<>();
		for (int i =0; i < arr.length; i++) {
			if (newArr.contains(arr[i])) {
				int gap = i - newArr.lastIndexOf(arr[i]);
				minGap = minGap < gap ? minGap : gap;
			}
			newArr.add(arr[i]);
		}
		return minGap;
	}
		
	
}
