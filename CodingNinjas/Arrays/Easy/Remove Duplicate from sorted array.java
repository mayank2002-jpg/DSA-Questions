import java.util.*;

public class Solution {

	public static int removeDuplicates(ArrayList<Integer> arr, int n) {

		HashSet<Integer> uni = new HashSet<>();

		for (int a : arr) {

			uni.add(a);

		}

		return uni.size();

	}

}