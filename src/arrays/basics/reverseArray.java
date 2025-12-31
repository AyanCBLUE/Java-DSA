package arrays.basics;
import java.util.Scanner;
public class reverseArray {
    public static void print(int[] arr){
        for ( int x : arr) System.out.print(x + " ");
    }
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the Array: ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
       }
       reverse(arr,0,n-1);
       print(arr);
    }
}
