class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the value at nums and its index
        Map<Integer, Integer> indices = new HashMap<>();

        // Iterate through nums and puts the value of nums[i] as the key and the index as the value

        for (int i = 0; i < nums.length; i++){
            indices.put(nums[i], i);
        }
        // Iterate again looking for diff and check if diff is in the hashMap
        // Make sure that they're not the same index as well.

        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(indices.containsKey(diff) && indices.get(diff)!=i){
                // Return the array of indices.
                return new int[]{i, indices.get(diff)};
            }
        }
        // If it iterates without finding the target return an empty array/
        return new int[]{};
    }
}
