class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
// So basically I want this program to get one element in the array and then compare it to all the others in the array. And if that element I chose was equal to the element given it should return true.