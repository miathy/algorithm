package algorithm;

public class fibonacci {
	public static void main(String[] args) {
		System.out.println(fibo(5));
	}
	
	public static int fibo(int n) {
		int first =0;
		int second =1;
		int next =0;
		for (int i =1; i<= n; i++) {
			next =first+second;
			first = second;
			second = next;
		}
		return next;
	}
}
