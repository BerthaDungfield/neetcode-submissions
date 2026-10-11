class Solution {
    public int[] getConcatenation(int[] nums) {
        int idx = 0;
        int n = nums.length*2;
        int[] ans = new int[n];   //Initializes an array two times its length
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < nums.length; j++){
                ans[idx] = nums[j];
                idx++;
            }
        }
        return ans;
    }
}