public class Main{
    static int countPrime(int n){

        if(n<=1) return 0;
        int count = 0;
        for(int i=2;i<=n;i++){
            boolean  isPrime = true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0)
                    isPrime = false;
            }
            if(isPrime){
                count++;
            }
        }
        return count;
    }

    static void main(String[] args) {
        int result = countPrime(10);
        System.out.println(result);
    }
}