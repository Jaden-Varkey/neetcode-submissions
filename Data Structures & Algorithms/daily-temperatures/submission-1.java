class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        Arrays.fill(res, 0);
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && (temperatures[i] > temperatures[stack.peek()])) {
                int days = i - stack.peek();
                res[stack.pop()] = days;
            }
            stack.push(i);
        }
        return res;
    }
}
