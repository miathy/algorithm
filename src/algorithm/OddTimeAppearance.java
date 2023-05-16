package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OddTimeAppearance {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,1,2,3,4,5,15,15,15};
		
		System.out.println(findOddTime(arr));
	}
	public static int findOddTime(int[] input) {
		int result = 0;
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < input.length; i++) {
			int key = input[i];
			if (countMap.containsKey(key)) {
				int count = countMap.get(key);
				count++;
				countMap.put(key, count);
			} else {
				countMap.put(key, 1);
			}
		}
		
		for (Entry<Integer, Integer> val : countMap.entrySet()) {

			if (val.getValue()% 2 != 0) {
				result++;
			}
		}
		return result;
	}
}
