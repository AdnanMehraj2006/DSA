## 01. Aggressive Cows

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/aggressive-cows/1)

### Problem Description

**Task:** Given an integer array arr[], which denotes the positions of stalls. All the positions are distinct. There are k aggressive cows.Assign the cows to the stalls such that the minimum distance between any two cows is maximized.Examples:Input: arr[] = [1, 2, 4, 8, 9], k = 3

#### Examples

##### Example 1

- **Output:**
```text
4
```
- **Explanation:** The first cow can be placed at arr[0], the second at arr[1], and the third at arr[4]. In this arrangement, the minimum distance between any two cows is 4 (between arr[1] and arr[4]), which is the maximum possible among all valid arrangements.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n log m)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (3)

#### Solution 1 (Java)

- **Submitted:** 2026-09-26 22:54:03
- **Status:** Correct
- **Marks:** 0

```java
import java.util.Arrays;
class Solution {
    public boolean gap(int[] arr, int k, int mid){
        int n=arr.length;
        int cows=1;
        int prev=arr[0];//a[0]=cow 1
        for(int i=1; i<n; i++){
            int dist=arr[i]-prev;
            if(dist>=mid){
                cows++;
                prev=arr[i];
            }
            //continue to next iteration.
        }
        if(cows>=k){
            //found
            return true;
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        int n=arr.length;
        if(n==0 || n<k) return -1;
        Arrays.sort(arr);
        int low=1;
        int high=arr[n-1]-arr[0];
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2; //guessed gap
            if(gap(arr, k, mid)==true){
                res=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-09-26 22:51:00
- **Status:** Correct
- **Marks:** 0

```java
import java.util.Arrays;
class Solution {
    public boolean gap(int[] arr, int k, int mid){
        int n=arr.length;
        int cows=1;
        int prev=arr[0];//a[0]=cow 1
        for(int i=1; i<n; i++){
            int dist=arr[i]-prev;
            if(dist>=mid){
                cows++;
                prev=arr[i];
            }
            //continue to next iteration.
        }
        if(cows>=k){
            //found
            return true;
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        int n=arr.length;
        if(n==0 || n<k) return -1;
        Arrays.sort(arr);
        int low=1;
        int high=arr[n-1]-arr[0];
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2; //guessed gap
            if(gap(arr, k, mid)==true){
                res=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
}
```

#### Solution 3 (Java)

- **Submitted:** 2026-09-24 22:12:37
- **Status:** Correct
- **Marks:** 4

```java
import java.util.Arrays;
class Solution {
    public boolean gap(int[] arr, int k, int mid){
        int n=arr.length;
        int cows=1;
        int prev=arr[0];//a[0]=cow 1
        for(int i=1; i<n; i++){
            int dist=arr[i]-prev;
            if(dist>=mid){
                cows++;
                prev=arr[i];
            }
            //continue to next iteration.
        }
        if(cows>=k){
            //found
            return true;
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        int n=arr.length;
        if(n==0) return -1;
        if(n<k) return -1;
        Arrays.sort(arr);
        int low=1;
        int high=arr[n-1]-arr[0];
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2; //guessed gap
            if(gap(arr, k, mid)==true){
                res=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
}
```

*Generated on: 9/26/2026, 11:01:49 PM*