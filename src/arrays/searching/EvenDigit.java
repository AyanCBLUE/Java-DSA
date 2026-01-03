package arrays.searching;

public class EvenDigit {
    static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
            int result = findNumber(arr);
        System.out.println(result);
    }
    static int findNumber(int[] arr){
        int count = 0;
      for(int element : arr){
          if(even(element)) count++;
      }
      return count;
    }

    static boolean even(int n) {
        int number = countDigit(n);
        return number%2==0;
    }

    public static int countDigit(int n){
        int count = 0;
        if(n<0){
            n*=-1;
        }
        if(n==0){
            return 1;
        }
        while (n>0){
            count++;
            n/=10;
        }
        return count;
    }

}
