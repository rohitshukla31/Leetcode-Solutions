class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
       
        int st = 60*60*(10*startTime.charAt(0)-'0' + startTime.charAt(1)-'0') + 60*(10*startTime.charAt(3)-'0' + startTime.charAt(4)-'0') + (10*startTime.charAt(6)-'0' + startTime.charAt(7)-'0');

        int et = 60*60*(10*endTime.charAt(0)-'0' + endTime.charAt(1)-'0') + 60*(10*endTime.charAt(3)-'0' + endTime.charAt(4)-'0') + (10*endTime.charAt(6)-'0' + endTime.charAt(7)-'0');
         
         return et-st;
    }
}