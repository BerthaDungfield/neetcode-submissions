class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indiceI = 0;
        int indiceJ = 0;
        int[] indices = new int[2];
        // So what my code does, is since the output it always going to be 2 indices, and it's going to be the first two ones that make a pair I just selected one point, added it to all the possible values in the array, and then if theres a sum we add them and they can't be equal and then it returns the indices blah blah blah you get it.
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
