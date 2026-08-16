class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int max = 0;
        while (i < j) {
            int vol = Math.min(heights[i], heights[j]) * (j - i);
            if (vol > max) {
                max = vol;
            }
            if (heights[i] == heights[j]) {
                i++;
                j--;
            } else if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
