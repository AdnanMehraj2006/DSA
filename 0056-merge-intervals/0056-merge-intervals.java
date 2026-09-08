class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            //if only one or less entry -> return
            return intervals;
        }
        //Sort by asc starting point
        Arrays.sort(intervals, Comparator.comparingInt(i-> i[0]));
        List<int[]> res=new ArrayList<>();
        int start1=intervals[0][0];
        int end1=intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            if(end1>=start2){
                //merge condition
                start1=start1;
                end1=Math.max(end1, end2);
                continue;
            }else{
                // end1 < start2 (skip merge)
                res.add(new int[]{start1, end1});
                start1=start2;
                end1=end2;
            }
        }
        res.add(new int[]{start1, end1});
        return res.toArray(new int[res.size()][]);//because return type is 2D array
    }
}