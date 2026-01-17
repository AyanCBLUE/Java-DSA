package arrays.searching.binary;
import java.util.Arrays;
public class AggresiveCows {
    public static boolean fnc(int[] arr, int k, int distance){
        int n=arr.length, count=1, last=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-last>=distance){
                count++;
                last=arr[i];
            }
        }
        return count>=k;
    }
    public static int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int low=1, high=nums[n-1]-nums[0];
        while(low<=high){
            int mid=low+(high-low)/2; // low+high/2;
            boolean condition = fnc(nums, k, mid);
            if(condition==true){
                low=mid+1;
            }
            else high=mid-1;
        }
        return high;
    }

    static void main(String[] args) {
        int[] arr={0, 3, 4, 7, 10, 9};
        int k=4;
        System.out.println(aggressiveCows(arr, k));
    }
}
