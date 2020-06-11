class Solution {
    public int[] shuffle(final int[] nums, final int n) {
        /*
         * ID: 1470 Given the array nums consisting of 2n elements in the form
         * [x1,x2,...,xn,y1,y2,...,yn].
         * 
         * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
         * 
         * Complexity: Time: O(n)
         * 
         * Space: O(n)
         */

        final int[] output = new int[n * 2];
        
        int index = 0;
        
        for (int i = 0; i < n; i++) {
             output[index] = nums[i];
             output[index + 1] = nums[i+n];
             index += 2;
        }
        
        return output;
    }
}