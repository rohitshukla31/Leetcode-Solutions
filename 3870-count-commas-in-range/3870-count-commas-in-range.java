class Solution {
    public int countCommas(int n) {
        int m=n;
        int cnt=0;
        while(n>0)
        {
            cnt++;
            int d=n%10;
            n=n/10;
        }
        if(cnt<4)
        {
            return 0;
        } 
        return m-999;
       
    }
}