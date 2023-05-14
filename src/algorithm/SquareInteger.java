package algorithm;

public class SquareInteger {
	
	public static void main(String[] args) {
		System.out.println(squareInterger(16,25));
	}
	
	
	public static int squareInterger(int a, int b) {
		int count = 0;
		for (int i =a; i <=b; i++) {
			double z =Math.sqrt(i);
			double y = Math.ceil(z);
			
			if(z == y) {
				count++;
			}
			
		}
		return count;
	}
}
