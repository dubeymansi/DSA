class Solution {
    public static int mod = 1000000007;
    public double myPow(double x, int n) {
        if(x==0 || x==1){
            return x;
        }
        if(x==-1){
            if(n%2==0){
                return x*(-1);
            }
            else{
                return x;
            }
        }
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n>=1){
        double v = myPow(x,n/2)%mod;
        if(n%2==0){
            return (v*v)%mod;
        }
        else{
            return (x*v*v)%mod;
        }
        }
        if(n<0){
            if(n<=-(int)(1e9)){
                return x*0;
            }
            n=-n;
            double val = myPow(x,n)%mod;
            return (1/val)%mod;
        }
        return -1;
    }
}