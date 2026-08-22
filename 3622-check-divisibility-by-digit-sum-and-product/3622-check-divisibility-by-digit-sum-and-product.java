class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int m=n;
        while(m>0){
            int d=m%10;
            sum +=d;
            prod *=d;
            m=m/10;
        }
        int total=sum+prod;
        if(n%total != 0){
            return false;
        }
        return true;
    }
}