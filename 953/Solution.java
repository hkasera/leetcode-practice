class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if(words.length == 1) {
            return true;
        }
        int[] dictionary = new int[26];
        for(int i = 0; i < order.length(); ++i) {
            char c = order.charAt(i);
            dictionary[c-'a'] = i;
        }
        for(int k = 0; k < words.length - 1; ++k) {
            String word1 = words[k];
            String word2 = words[k+1];
            int i = 0;
            for(i = 0; i < word1.length() && i < word2.length() ; ++i) {
                char c1 = word1.charAt(i);
                char c2 = word2.charAt(i);
                if(dictionary[c1-'a'] > dictionary[c2-'a']) {
                    return false;
                }
                if(dictionary[c1-'a'] < dictionary[c2-'a']) {
                    break;
                }
            }
            if(i != word1.length() && i == word2.length()) {
                return false;
            }
        }
        return true;
    }
}
