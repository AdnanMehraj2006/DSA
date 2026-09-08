class Solution {
    public int minSubarraySum(int[] arr) {
        int best_ending = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int c1 = best_ending + arr[i];
            int c2 = arr[i];

            best_ending = Math.min(c1, c2);
            min = Math.min(best_ending, min);
        }

        return min;
    }
}
