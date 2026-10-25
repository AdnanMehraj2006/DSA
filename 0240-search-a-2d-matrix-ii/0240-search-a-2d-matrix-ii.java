class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length; //row
        int m=matrix[0].length;//column
        int i=n-1, j=0;
        while(i>=0 && j<m){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                //el row
                i--;
            }else{
                //el column
                j++;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna