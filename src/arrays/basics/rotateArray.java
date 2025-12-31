package arrays.basics;

import java.util.Scanner;
public class rotateArray {
    public static void print(int[] arr){
        for(int x : arr) System.out.print(x + " ");
        System.out.println();
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
    public static void main(String[] args){
        int[] arr = {2,3,5,7,11,13,17};
        print(arr);
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the steps for rotaion: ");
        int k = sc.nextInt();
        k=k%10;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        print(arr);
    }
}

