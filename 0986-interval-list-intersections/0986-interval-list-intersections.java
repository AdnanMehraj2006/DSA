class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i=0, j=0;
        List <int []> res=new ArrayList<>();
        while(i<firstList.length && j<secondList.length){
            int s1=firstList[i][0];
            int s2=secondList[j][0];
            int e1=firstList[i][1];
            int e2=secondList[j][1];
            if(s1<=s2){
                if(e1>=s2){
                    int t1=Math.max(s1, s2);
                    int t2=Math.min(e1, e2);
                    res.add(new int[]{t1, t2});
                }
            }else{
                //s2>=s1
                if(e2>=s1){
                    int t1=Math.max(s1, s2);
                    int t2=Math.min(e1, e2);
                    res.add(new int[]{t1, t2});
                }
            }
            if(e1>=e2){
                j++;
            }else{
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}