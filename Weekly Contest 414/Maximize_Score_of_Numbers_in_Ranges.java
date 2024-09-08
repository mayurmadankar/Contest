import java.util.Arrays;

class Solution {
    public int maxPossibleScore(int[] start, int d) {
        Arrays.sort(start);
        
        int left = 0;
        int right = Integer.MAX_VALUE;
        int answer = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (canAchieveScore(start, d, mid)) {
                answer = mid;  
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        
        return answer;
    }
    private boolean canAchieveScore(int[] start, int d, int score) {
        int n = start.length;
        int lastPicked = start[0];
        
        for (int i = 1; i < n; i++) {
            int candidate = Math.max(start[i], lastPicked + score);
            
            if (candidate > start[i] + d) {
                return false;  
            }
            lastPicked = candidate;  
        }  
        return true; 
    }
}
