package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Doctor {

	public static void main(String[] args) {

		int[][] schedule = { { 1, 1, 5, 2, 3 }, { 4, 5, 6, 4, 3 }, { 9, 4, 4, 1, 5 } };
		int result = solution(schedule);
		System.out.println(result);
	}

	public static int solution(int[][] A) {

		int row = A.length;
		int col = A[0].length;
		int result = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int doctorID = A[i][j];
				if (map.containsKey(doctorID)) {
					int hospitalNum = map.get(doctorID);
					hospitalNum++;
					map.put(doctorID, hospitalNum);
				} else {
					map.put(doctorID, 1);
				}
			}
		}
		for (Entry<Integer, Integer> val : map.entrySet()) {
			if (val.getValue() > 1) {
				result++;
			}
		}

		return result;

	}
}
