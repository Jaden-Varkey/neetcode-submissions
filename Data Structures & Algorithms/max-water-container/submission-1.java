class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        for (int i = 0, j = heights.length - 1; i < j;) {
            int breadth = j - i;
            int height = Math.min(heights[i], heights[j]);
            int water = breadth * height;
            if (water > max) {
                max = water;
            }
            if (heights[i] < heights[j]) {
                i++;
            } else if (heights[i] > heights[j]) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return max;
    }
}
