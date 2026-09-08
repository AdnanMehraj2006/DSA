class Solution {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);

        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int newSum = arr[i] + arr[j] + arr[k];

                if (newSum < sum) {
                    count += k - j;
                    j++;
                } else {
                    k--;
                }
            }
        }

        return count;
    }
}
