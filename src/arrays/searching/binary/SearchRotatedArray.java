package arrays.searching.binary;

public class SearchRotatedArray {
    static void main(String[] args) {
        int[] nums = {7,8,9,1,2,3,4,5,6}; //rotated array
        int ans = search(nums,9);
        System.out.println(ans);
    }
    static int search(int[] nums, int target){
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
         if(nums[mid]==target) return mid;
         if(nums[mid]>=nums[low]){
             if(target>=nums[low] && target<=nums[mid])  high = mid-1;
             else low=mid+1;
         }
         else{
             if(target<=nums[high] && target>=nums[mid])  low=mid+1;
             else high = mid-1;
         }
        }
        return -1;
    }
}
