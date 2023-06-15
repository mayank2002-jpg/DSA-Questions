import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
	public static void pushZerosAtEnd(ArrayList<Integer> arr) {
		int nonZeroesIndex = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) != 0) {
				// int temp = arr.get(nonZeroesIndex);
				// arr.get(nonZeroesIndex) = arr.get(i);
				// arr.get(i) = temp;

				Collections.swap(arr, i, nonZeroesIndex);
				nonZeroesIndex++;
			}
		}
	}
}