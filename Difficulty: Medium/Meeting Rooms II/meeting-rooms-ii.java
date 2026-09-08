class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);
        int count=0;
        int ans=0;
        int i=0,j=0;
        while(i< start.length && j<end.length){
            if(start[i]<end[j]){
                count++;
                i++;
                ans=Math.max(ans, count);
            }else{
                count--;
                j++;
            }
        }
        return ans;
    }
}