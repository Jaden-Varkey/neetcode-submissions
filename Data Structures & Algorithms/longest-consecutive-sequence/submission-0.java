class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : set) {
            if (!set.contains(num - 1)) list.add(num);
        }
        
        int[] freq = new int[list.size()];
        Arrays.fill(freq, 1);
        for (int a = 0; a < list.size(); a++) {
            for (int i = list.get(a) + 1;; i++) {
                if (!set.contains(i)) break;
                freq[a]++;
            }
        }

        int max = 0;
        for (int num : freq) {
            if (num > max) max = num;
        }

        return max;
    }
}
