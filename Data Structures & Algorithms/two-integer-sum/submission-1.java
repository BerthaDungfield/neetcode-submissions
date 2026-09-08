class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indiceI = 0;
        int indiceJ = 0;
        int[] indices = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if (nums[i] + nums[j] == target && i!=j){
                     indices[0] = j;
                     indices[1] = i;
                     
                }
            }
        }
        return indices;
    }
}
