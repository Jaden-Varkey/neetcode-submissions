class Solution {
    public boolean hasDuplicate(int[] nums) {
        // O(n^2) time
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }*/

        // O(nlogn) time
        /*java.util.Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                return true;
            }
        }*/

        // O(n) time
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }

        return false;
    }
}