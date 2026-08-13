class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1 + map.getOrDefault(num, 0));
        }
        
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int num : map.keySet()) {
            int freq = map.get(num);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        int[] res = new int[k];
        int j = 0;

        for (int i = nums.length; (i > 0) && (j < k); i--) {
            if (bucket[i] == null) {
                continue;
            }
            for (int num : bucket[i]) {
                if (j == k) {
                    break;
                }
                res[j++] = num;
            }
        }

        return res;
    }
}
