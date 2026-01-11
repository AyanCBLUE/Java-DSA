package arrays.searching.binary;

public class SearchRotatedArray02 {
    static void main(String[] args) {
        int[] nums = {2,2,2,5,6,6,6,0,0,1,2,2};
        boolean ans = search(nums,2);
        System.out.println(ans);
    }
     static boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(nums[mid]==target) return true;
            if(nums[start]==nums[mid]){
                start++;
                continue;
            }
            if(nums[mid]>=nums[start]){
                if(target>=nums[start] && target<=nums[mid]){
                    end = mid-1;
                }
                else start = mid+1;
            }
            else{
                if(target>nums[mid] && target<=nums[end]){
                    start = mid+1;
                }
                else end = mid-1;
            }
        }
        return false;
    }
}
