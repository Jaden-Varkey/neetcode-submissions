class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            map.putIfAbsent(numbers[i], i);
            if (map.containsKey(complement) && (map.get(complement) != i)) {
                if (map.get(complement) == map.get(numbers[i])) {
                    return new int[] {map.get(complement) + 1, i + 1};
                }
                return new int[] {map.get(complement) + 1, map.get(numbers[i]) + 1};
            }
        }
        return null;
    }
}
