class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        // so we gotta traverse the array and return true if any value appears more than once in the array.

        // Lets create an array of length n

        // ok nevermind my fucking answer is wrong
        // So the simplest answer for me is to:
        // Step 1: get the first value in the array
        // Step 2: Compare the first value to all the other values in the array and if they are equal return true
        // Step 3: increment it by one and then check them all again.

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }
}