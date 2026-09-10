class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int i = map.get(key);
            if (buckets[i] == null) {
                buckets[i] = new ArrayList<>();
            }
            buckets[i].add(key);
        }
        int[] res = new int[k];
        int j = 0;
        for (int i = nums.length; (i > 0) && (j < k); i--) {
            if (buckets[i] == null) {
                continue;
            }
            for (int num : buckets[i]) {
                res[j++] = num;
            }
        }
        return res;
    }
}
