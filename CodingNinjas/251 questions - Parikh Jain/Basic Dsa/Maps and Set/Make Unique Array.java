import java.util.*;
import java.io.*;

public class Solution {

	public static int minElementsToRemove(ArrayList<Integer> arr) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (map.containsKey(arr.get(i))) {
				count++;
			} else {
				map.put(arr.get(i), 1);
			}
		}
		return count;
	}
}