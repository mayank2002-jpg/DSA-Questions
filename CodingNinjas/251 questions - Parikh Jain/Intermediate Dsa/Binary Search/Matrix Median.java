import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<matrix.size();i++){
			for(int j = 0;j<matrix.get(0).size();j++){
				list.add(matrix.get(i).get(j));
			}
		}
		Collections.sort(list);
		int mid = (0+list.size())/2;
		int ans = list.get(mid);

		return ans;
	}
}