class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length*2;

        int[] ans = new int[n];

        int index = 0;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < nums.length; j++){
                ans[index++] = nums[j];
            }
        }
        return ans;
    }
}