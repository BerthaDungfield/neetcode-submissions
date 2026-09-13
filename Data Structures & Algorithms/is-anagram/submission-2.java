class Solution {
    public boolean isAnagram(String s, String t) {
    // I could maybe do this with sorting? 
    //maybe I could turn them into characters, and then sort the characters and then see if they have equal length and that the characters are equal?

    char[] charArray =  s.toCharArray();
    char[] charArray2 = t.toCharArray();

    Arrays.sort(charArray);
    Arrays.sort(charArray2);
    if(charArray.length != charArray2.length){
        return false;
    }
    for(int i = 0; i < charArray.length; i++){
        // This returns true if any of them are equal
        if(charArray[i] != charArray2[i]){
            return false;
        }
    } 
    return true;
    
    }
}
