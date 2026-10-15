class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x=matrix.length; //row
        int y=matrix[0].length; //column
        int total=x*y; //row x column
        int low=0, high=total-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int r=mid/y; // divide by column to get row
            int c=mid%y;// modulo by column to get column
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna