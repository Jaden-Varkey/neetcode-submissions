class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                for (;; num++) {
                    if (set.contains(num + 1)) {
                        count++;
                        continue;
                  }
                    if (count > longest) longest = count;
                    break;
                }
            }
        }
        return longest;
    }
}
