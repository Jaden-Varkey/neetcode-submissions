class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder n = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) n.append(Character.toLowerCase(s.charAt(i)));   
        }

        for (int i = 0, j = n.length()-1; i < n.length()/2; i++, j--) {
            if (n.charAt(i) != n.charAt(j)) return false;
        }

        return true;
    }
}
