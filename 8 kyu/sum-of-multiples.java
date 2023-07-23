/*
Your Job
Find the sum of all multiples of n below m

Keep in Mind
n and m are natural numbers (positive integers)
m is excluded from the multiples
*/ 

//My Solution

public class Kata {
    public static long sumMul(int n, int m) {
      long sum = 0;
       if(m <= 0 || n <= 0) {
         throw new IllegalArgumentException("m must be positive");
        } else {
         for(int i = 0; i < m; i += n) {
           sum+=i;
         }
         return sum;
       }
      
    }
}