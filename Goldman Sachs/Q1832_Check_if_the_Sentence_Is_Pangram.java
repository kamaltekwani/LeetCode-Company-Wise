/*
 * Problem Link : https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 * Solution Link : https://leetcode.com/problems/check-if-the-sentence-is-pangram/solutions/1164224/java-simple-and-easy-to-understand-solution-1-ms-faster-than-100-00-clean-code-with-comments/
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


class Q1832_Check_if_the_Sentence_Is_Pangram 
{
    public boolean checkIfPangram(String sentence) 
    {
        boolean alphabet[] = new boolean[26];

        for(char c : sentence.toCharArray())
                alphabet[c-'a'] = true;

        for(boolean isAlphabet : alphabet)
            if(!isAlphabet)
                return false;
        
        return true;
    }
}
