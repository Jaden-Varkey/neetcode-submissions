class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, zero = 0;
        for (int num : nums) {
            if (num == 0) {
                if (zero++ == 1) {
                    return new int[nums.length];
                }
            } else {
                product *= num;
            }
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = product;
            } else if (zero == 1) {
                res[i] = 0;
            } else {
                res[i] = product / nums[i];
            }
        }
        return res;
    }
}  
