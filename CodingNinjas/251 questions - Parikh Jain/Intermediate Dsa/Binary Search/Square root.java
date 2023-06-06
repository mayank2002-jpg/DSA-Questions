import java.util.*;
import java.io.*;

public class Solution {

	public static int sqrtN(long N) {
		long low = 0;
		long high = N;
		long result = -1;

		while (low <= high) {
			long mid = low + (high - low) / 2;
			if (mid == N / mid) {
				return (int) mid;
			} else if (mid < N / mid) {
				result = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return (int) result;
	}
}
