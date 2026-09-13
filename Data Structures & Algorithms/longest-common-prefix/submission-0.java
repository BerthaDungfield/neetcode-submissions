class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Ok so hint says I need to inspect the strings directly with charAt();
        if (strs == null || strs.length == 0){
            return "";
        }

        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 0; j < strs.length; j++){
                if (i==strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
        
    }
}