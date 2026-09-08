class Solution {
    public int totalFruit(int[] fruits) {
        int max=Integer.MIN_VALUE;
        int low=0, basket=2;//k
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int high=0; high<fruits.length; high++){//map.size()<=basket/  distinct_count)
            int temp1=fruits[high];
            if(map.containsKey(temp1)){
                map.put(temp1, map.get(temp1)+1);
            }else{
                map.put(temp1, 1);
            }
            while(map.size()>basket){//map.size()>basket/distinct_count)
                low++;
                int temp2=fruits[low-1];
                if(map.containsKey(temp2)){
                    map.put(temp2, map.get(temp2)-1);
                }
                if(map.get(temp2)==0){
                    map.remove(temp2);
                }
            }
            max=Math.max(max, (high-low+1));
        }
        return max;
    }
}