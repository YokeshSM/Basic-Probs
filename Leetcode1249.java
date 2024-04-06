public class Solution {
    public static void main(String []args) {
      // Given a string s of '(' , ')' and lowercase English characters.
//Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.Formally, 
 // a parentheses string is valid if and only if: It is the empty string, contains only lowercase characters, orIt can be written as AB (A concatenated with B), where A and B are valid strings, or
//It can be written as (A), where A is a valid string.
        String s="lee(t(c)o)de)";
        Stack<Integer> st = new Stack<Integer>();
        String m = "";
        int a[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                a[i] = 99;
            else if (s.charAt(i) == '(') {
                st.push(i);
                a[i] = 99;
            } else if (!st.isEmpty() && s.charAt(i) == ')' && a[st.peek()] == 99) {
                st.pop();
                a[i] = 99;
            } else
                a[i] = -1;
        }
        while (!st.isEmpty()) {
            a[st.pop()] = -1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 99)
                m = m + s.charAt(i);
        }
        System.out.println(m);
    }
}
