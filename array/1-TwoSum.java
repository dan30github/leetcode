class Solution {
    public int[] twoSum(final int[] nums, final int target) {
        /*
         * Given an array of integers, return indices of the two numbers such that they
         * add up to a specific target.
         * 
         * You may assume that each input would have exactly one solution, and you may
         * not use the same element twice.
         */

        final int[] out = new int[2];

        final Map<Integer, Integer> map = new HashMap<>();

        System.out.println(map.containsValue(1));

        for (int i = 0; i < nums.length; i++) {
            final int complement = target - nums[i];
            if(map.containsKey(complement)){
                out[0] = map.get(complement);
                out[1] = i;
            }
            map.put(nums[i], i);
        }
        
        
        
        return out;
    }
}
