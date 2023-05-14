package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayCake {
	public static void main(String[] args) {
		List<Integer> mylist=Arrays.asList(3,2,1,3);
		System.out.println(birthdayCake(mylist));
	}
	
	public static int birthdayCake(List<Integer> candles) {
		int maximum = Collections.max(candles);
		int occurrences = Collections.frequency(candles, maximum);
		return occurrences ;

	}
}
