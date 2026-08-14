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

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = product;
            } else if (zero == 1) {
                nums[i] = 0;
            } else {
                nums[i] = product / nums[i];
            }
        }
        return nums;
    }
}  
