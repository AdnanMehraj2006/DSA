class Solution {
    static boolean isIntersect(int[][] intervals) {
         Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
         boolean result=false;
             int s1=intervals[0][0];
             int e1=intervals[0][1];
             for(int i=1; i<intervals.length; i++){
                 int s2=intervals[i][0];
                 int e2=intervals[i][1];
                 if(e1>=s2){
                     return true;
                 }else{
                     s1=s2;
                     e1=e2;
                 }
            }
            return false;
         }
    }