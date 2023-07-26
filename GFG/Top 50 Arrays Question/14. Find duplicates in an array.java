class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
       
       ArrayList<Integer> al = new ArrayList<>();
       
       for(int i = 0; i<n; i++){
           int index = arr[i]%n;
           arr[index] += n;
       }
       
       int count = 0;
       for(int i = 0; i<n; i++){
           if(arr[i]/n >= 2){
               al.add(i);
               count++;
           }
       }
       if(count == 0){
           al.add(-1);
           return al;
       }
       return al;
    }
}