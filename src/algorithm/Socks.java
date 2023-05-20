package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Socks {
	
	public static void main(String[] args) {
		List<Integer> ar1 = Arrays.asList(1,2,1,2,1,3,2);
		System.out.println(sockMerchant(ar1));
		List<Integer> ar2 = Arrays.asList(10,20,20,10,10,30,50,10,20);
		System.out.println(sockMerchant(ar2));
	}
	
	
	
	public static int sockMerchant(List<Integer> ar) {
		int result =0;
		Map<Integer, Integer> countMap = new HashMap <Integer, Integer>();
		for (int  i =0; i < ar.size(); i++) {
			int key = ar.get(i);
			if (countMap.containsKey(key)) {
				int count = countMap.get(key);
				count++;
				countMap.put(key, count);
			}
			else {
				countMap.put(key, 1);
			}
			
		}
		for (Entry <Integer, Integer> val : countMap.entrySet()) {
			
			int pairs = (int) Math.floor(val.getValue()/2);
			result = result +pairs;
			
		}
		return result;
		
	}

}
