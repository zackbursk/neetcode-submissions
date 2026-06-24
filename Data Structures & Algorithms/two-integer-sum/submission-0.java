class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prev = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int lookingFor = target - nums[i];
            if (prev.containsKey(lookingFor)){
                return new int[] {
                    prev.get(lookingFor), i
                };

            }
            prev.put(nums[i], i);
            // nums[i] == keep
            // 
        }
        return new int[]{};
    }
}
