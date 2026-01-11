package arrays.searching.binary;

public class BinarySearch {
    static int binarySearch(int[] arr, int target){
        int start=0, end=arr.length;
        while(start<end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]) {
                end=mid-1;
            } else if (target>arr[mid]) {
                start= mid+1;
            } else return mid;
        }
        return -1;
    }
    static void main(String[] args) {
        int[] arr = {1,2,3,4,10,11,12,23,24};
        int ans = binarySearch(arr,23);
        System.out.println(ans);
    }
}
