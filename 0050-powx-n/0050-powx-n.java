class Solution {
    public double myPow(double x, int n) {
        long N = n;
        
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        
        double base = x;
        double result = 1.0;

        while(N > 0){
            if (N % 2 != 0) {
                result *= base;
            }
            base *= base;
            N /= 2;
        }
        return result;
    }
}