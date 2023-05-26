package EasyLeetProblems;

//3. Longest Substring Without Repeating Characters
import java.util.HashMap;
import java.util.LinkedList;

/*
    
Given a string s, find the length of the longest substring
without repeating characters.
    
Example 1:
Input: s  = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 */
public class SubStringProb {

    public int length(String s) {
        int lengthOfString = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder currSeq = new StringBuilder();

            for (int k = i; k < s.length(); ++k) {
                if (currSeq.indexOf(String.valueOf(s.charAt(k))) != -1) {
                    break;
                }
                currSeq.append(s.charAt(k));
                lengthOfString = Math.max(lengthOfString, currSeq.length());
            }

        }

        return lengthOfString;
    }

    public int length2(String s) {
        int maxLen = 0;
        HashMap<Character, Integer> setSeq = new HashMap<>();

        for (int right = 0, left = 0; right < s.length(); ++right) {

            if (setSeq.containsKey(s.charAt(right)) && setSeq.get(s.charAt(right)) >= left) {

               
                left = setSeq.get(s.charAt(right)) + 1;

            } 
            
             maxLen = Math.max(maxLen, right - left + 1);
             setSeq.put(s.charAt(right), right);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "qrsvbspk";

        SubStringProb sProb = new SubStringProb();

        int l = sProb.length2(s);

        System.out.println(l);

    }

}
