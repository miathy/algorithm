package algorithm;

//import java.util.Calendar;
//
//public class BigO {
//	public static void main(String[] args) {
//		int size = 110000;
//		String []  arr = new String[size];
//		for( int i =0; i < arr.length; i++) {
//			arr[i] = "Dung";		
//		}
//		findDung(arr);
//	}
//    

//    
//	public static void findDung(String[] arr) {
//		long startTime = Calendar.getInstance().getTimeInMillis();
//		for (int i = 0; i < arr.length; i++) {
//			if( arr[i].equals("Dung")){
//				System.out.println("Found");
//			}			
//		}
//		long endTime =Calendar.getInstance().getTimeInMillis();
//		System.out.println("this function took: " + (endTime - startTime));
//	
//	}
//}
public class BigO {
	public static void main(String[] args) {
		// int [] arr = {1,5,12,5,6};
//		System.out.println(findSmallest(arr));
//		System.out.println(findSmallest2(arr));
//		double i = 7.5;
//		System.out.println(squareRoot(i));

//		int[] arr = {0,0,1,2,1,1,2,2,0,0,1};
//		int [] result =sort012(arr);
//	
//		for(int i = 0; i<result.length; i++) {
//			System.out.println(result[i]);
//		}
//		String [] strs = {"flower","flow", "flight"};
//		System.out.println(solution(strs));

		System.out.println(romanToInt("LVIII"));
	}

	public static int findSmallest(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[0];

	}

	public static int findSmallest2(int[] arr) {
		int minValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minValue)
				minValue = arr[i];
		}
		return minValue;
	}

	public static double squareRoot(int num) {
		// Base cases
		if (num == 0 || num == 1)
			return num;

		int i = 1, result = 1;

		while (result <= num) {
			i++;
			result = i * i;
		}
		return i;
	}

	// FORMULAR: sqrtn+1=(sqrtn+(num/sqrtn))/2.0
	// O(logn)
	public static double squareRoot(double num) {

		double t;
		double sqrtroot = num / 2;
		do {
			t = sqrtroot;
			sqrtroot = (t + (num / t)) / 2;
		} while ((t - sqrtroot) != 0);
		return sqrtroot;
	}

	// Sort array
	// O(n)
	public static int[] sort012(int[] arr) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int[] returnArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				count0++;
				
			else if (arr[i] == 1)
				count1++;
			else
				count2++;
		}
		for (int i = 0; i < arr.length; i++) {
			returnArr[i] = 0;
		}
//		for (int i = count0; i < (count0 + count1); i++) {
//			returnArr[i] = 1;
//		}
//		for (int i = count0 + count1; i < arr.length; i++) {
//			returnArr[i] = 2;
//		}
		return returnArr;
	}

	// O(n^2)
	public static String solution(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			while (!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}

		return prefix;
	}

	public static int romanToInt(String str) {

		int len = str.length();

		str = str + " ";
		int result = 0;
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			char next_char = str.charAt(i + 1);

			if (ch == 'M') {
				result += 1000;
			} 
			else if (ch == 'C') {
				if (next_char == 'M') {
					result += 900;
					i++;
				} 
				else if (next_char == 'D') {
					result += 400;
					i++;
				} 
				else {
					result += 100;
				}
			} 
			else if (ch == 'D') {
				result += 500;
			} 
			else if (ch == 'X') {
				if (next_char == 'C') {
					result += 90;
					i++;
				} 
				else if (next_char == 'L') {
					result += 40;
					i++;
				} 
				else {
					result += 10;
				}
			} 
			else if (ch == 'L') {
				result += 50;
			} 
			else if (ch == 'I') {
				if (next_char == 'X') {
					result += 9;
					i++;
				} 
				else if (next_char == 'V') {
					result += 4;
					i++;
				} 
				else {
					result++;
				}
			} 
			else { // if (ch == 'V')
				result += 5;
			}
		}
		return result;

	}

}