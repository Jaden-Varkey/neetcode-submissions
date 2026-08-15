class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for (int num : set) {
            if (!set.contains(num-1)) {
                int length = 0;
                for (int i = num;; i++) {
                    if (!set.contains(i)) break;
                    length++;
                }
                if (length > max) {
                    max = length;
                }
            }
        }

        return max;
    }
}
