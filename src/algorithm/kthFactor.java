package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class kthFactor {
	
	public static void main(String[] args) {
		System.out.println(kthFactor(12,6));
	}
	
	
	public static int kthFactor(int n, int k) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i =1; i <= n; i++) {
			if (n % i == 0) {
				ar.add(i);
			}
		}
		int result = ar.get(k-1);
		if (k > ar.size())
			return -1;
		else
			return result;
	}
}
