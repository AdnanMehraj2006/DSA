import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // List to store intervals after inserting newInterval in correct position
        List<int[]> temp = new ArrayList<>();
        // Final merged intervals list
        List<int[]> merged = new ArrayList<>();
        // Flag to check if newInterval is already inserted
        boolean insert = false;
        // Edge case: if no intervals, return only newInterval
        if (intervals.length == 0) {
            merged.add(newInterval);
            return merged.toArray(new int[merged.size()][]);
        }
        // STEP 1: Insert newInterval in correct sorted position
        for (int i = 0; i < intervals.length; i++) {
            // If current interval starts after newInterval and we haven't      inserted yet
            if (intervals[i][0] >= newInterval[0] && insert == false) {
                temp.add(newInterval);  // insert newInterval
                insert = true;          // mark as inserted
            }
            // Always add current interval
            temp.add(intervals[i]);
        }
        // If newInterval belongs at the end
        if (!insert) {
            temp.add(newInterval);
        }
        // Convert list to array for merging
        int[][] res = temp.toArray(new int[temp.size()][]);
        // STEP 2: Merge overlapping intervals
        // Initialize with first interval
        int start1 = res[0][0];
        int end1 = res[0][1];
        for (int i = 1; i < res.length; i++) {
            int start2 = res[i][0];
            int end2 = res[i][1];
            // If intervals overlap
            if (end1 >= start2) {
                // Merge by updating end
                end1 = Math.max(end1, end2);
            } else {
                // No overlap → add previous interval to result
                merged.add(new int[]{start1, end1});
                // Move to next interval
                start1 = start2;
                end1 = end2;
            }
        }
        // Add last interval
        merged.add(new int[]{start1, end1});
        // Convert result list to array
        return merged.toArray(new int[merged.size()][]);
    }
}