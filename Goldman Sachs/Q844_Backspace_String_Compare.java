/*
 * Problem Link : https://leetcode.com/problems/backspace-string-compare/
 * Solution Link : https://leetcode.com/problems/backspace-string-compare/solutions/432978/java-stack-and-stringbuilder-solution-huge-different/
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(1);
 */

class Q844_Backspace_String_Compare 
{
    public String createFinalString(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray())
            if(c != '#')
                sb.append(c);
            else if(sb.length() != 0)
                sb.deleteCharAt(sb.length()-1);
        
        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) 
    {
        return createFinalString(s).equals(createFinalString(t));
    }
}
