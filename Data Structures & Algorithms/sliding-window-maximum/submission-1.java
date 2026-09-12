class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxArr = new int[nums.length - k + 1];
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int start = 0, end = 0;
        while (end < k - 1) {
            maxHeap.add(nums[end]);
            end++;
        }
        while (end < nums.length) {
            maxHeap.add(nums[end++]);
            maxArr[end - k] = maxHeap.peek();
            maxHeap.remove(nums[start++]);
        }
        return maxArr;
    }
}
