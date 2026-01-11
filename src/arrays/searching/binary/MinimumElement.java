package arrays.searching.binary;

public class MinimumElement {
    static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        int[] nums={3,1,3};
        System.out.println(minimum(arr));
        System.out.println(minimum(nums));
    }
    public static int minimum(int[] arr){
        int n=arr.length, low=0, high=n-1, ans=Integer.MAX_VALUE, index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(n==1) return arr[0];
            //for duplicates:-
            if(arr[low]==arr[high]){
                ans=Math.min(ans, arr[low]);
                index=low;
                low++;
                high--;
                continue;
            }
            //if both right and left is sorted then:-
            if(arr[low]<=arr[high]){
                ans=Math.min(ans, arr[low]);
                index=low;
                break;
            }
            //left part sorted:-
            else if(arr[mid]>=arr[low]){
                ans=Math.min(ans, arr[low]);
                index=low;
                low=mid+1;
            }
            //right part sorted:-
            else{
                ans=Math.min(ans, arr[mid]);
                index=mid;
                high=mid-1;
            }
        }
        return ans; //return index :- will tell you how many times the array has been rotated.
    }
}
