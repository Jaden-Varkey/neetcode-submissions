class Solution {
    public int trap(int[] height) {
        if (height.length <= 2) return 0;
        int totalWater = 0;
        int[] left = new int[height.length], right = new int[height.length];
        left[0] = 0; right[height.length - 1] = 0;
        for (int i = 0, j = height.length - 1; i < height.length - 1; i++, j--) {
            left[i + 1] = Math.max(height[i], left[i]);
            right[j - 1] = Math.max(height[j], right[j]);
        }
        for (int i = 1; i < height.length - 1; i++) {
            int water = Math.min(left[i], right[i]) - height[i];
            totalWater += (water > 0) ? water : 0;
        }
        return totalWater;
    }
}
