package algorithm;


public class MinMove {
//	public static int minMove( String s) {
//		char[] charArr = s.toCharArray();
//	
//		int count = 0;
//		int result =0;
//		for(int i = 1;i<charArr.length;i++){
//			char ch = charArr[i];
//			if (ch == charArr[i - 1]) {
//				count++;
//			}
//			if (count == 3) {
//				count = 0; // reset count value
//				if (ch == 'a') {
//					charArr[i - 1] = 'b';
//				} else {
//					charArr[i - 1] = 'a';
//				}
//	
//				result++;
//			}
//		}
//
//		return result;
//	}
		public static int minMove(String S) {
			int count = 0;

			for (int i = 2; i < S.length(); i++) {
				if (S.charAt(i) == S.charAt(i - 1) && S.charAt(i - 1) == S.charAt(i - 2)) {
					count++;
					i++;
				}
			}
			return count;
		}

	public static void main(String[] args) {
        String s = "baaabbaabbba";
        System.out.println(minMove(s));
    }
}
