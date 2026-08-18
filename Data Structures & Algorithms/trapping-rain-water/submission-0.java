class Solution {
    public int trap(int[] height) {
        int vol = 0;
        if (height.length <= 2) return 0;
        int[] left = new int[height.length], right = new int[height.length];
        left[0] = 0; right[height.length - 1] = 0;
        for (int i = 0; i < height.length - 1; i++) {
            left[i + 1] = Math.max(height[i], left[i]);
        }
        for (int i = height.length - 1; i > 0; i--) {
            right[i - 1] = Math.max(height[i], right[i]);
        }
        for (int i = 0; i < height.length; i++) {
            int added_vol = Math.min(left[i], right[i]) - height[i];
            vol += ((added_vol >= 0) ? added_vol : 0);
        }
        return vol;
    }
}
