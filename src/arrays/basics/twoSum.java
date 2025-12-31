package arrays.basics;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2, 11, 11, 7};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
   public static int[] twoSum(int[] arr, int target) {
       int n = arr.length;
       int[] ans = new int[2];
       for (int i = 0; i < n; i++) {
           for (int j = i + 1; j < n; j++) {
               if(arr[i]+arr[j]==target){
                    ans[0] = i; ans[1]= j;
                    break;
               }
           }
       }
       return ans;
    }
}
