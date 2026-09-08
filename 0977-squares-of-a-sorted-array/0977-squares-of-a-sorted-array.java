class Solution {
    public int[] sortedSquares(int[] nums) {
        int splitposition=0;
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length; i++){
            if(nums[i]<0){
                splitposition++;//2
            }
        }
        int neg[]=new int[splitposition];//2->neg[2]
        int pos[]=new int[(nums.length-splitposition)];//3->pos[3]
        for(int i=0;i<neg.length;i++){//square and sort of negative numbers
            neg[i]=(nums[((neg.length-1)-i)]*nums[((neg.length-1)-i)]);
        }
        for(int i=splitposition;i<nums.length;i++){//square of positive numbers
            pos[i-splitposition]=(nums[i]*nums[i]);
        }
        int i=0,j=0,k=0;
        while(i<neg.length && j<pos.length){
            if(neg[i]<=pos[j]){
                result[k]=neg[i];
                i++;
                k++;
            }else{
                result[k]=pos[j];
                j++;
                k++;
            }
        }
        while(i==neg.length && j<pos.length){
            result[k]=pos[j];
            j++;
            k++;
        }
        while(j==pos.length && i<neg.length){
            result[k]=neg[i];
            i++;
            k++;
        }
        return result;
    }
}