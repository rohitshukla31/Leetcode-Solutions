class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 1;
        for(int i=0; i<piles.length; i++){
            maxPile = Math.max(maxPile, piles[i]);
        }
        int low = 1;
        int high = maxPile;
        int ans = maxPile;
        while(low <= high){
            int mid = low + (high - low)/2;
            long count = 0;
                
            for(int i=0; i<piles.length; i++){
                if(piles[i] % mid == 0){
                    count += piles[i]/mid;
                }
                else{
                    count += 1+piles[i]/mid;
                }
            }        
            if(count <= h){
                // current speed valid hai
                ans = mid;
                // aur chhoti speed se try krenge
                high = mid - 1;
            }
    
            else{
                // current speed slow hai, isliye speed increase krenge
                low = mid + 1;
            }
        
        }
        return ans;
    }
}