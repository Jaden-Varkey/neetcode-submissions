class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        int maxLen = 1;
        Set<Character> str = new HashSet<>();
        for (int i = 0, j = 0; j < s.length(); j++) {
            while (str.contains(s.charAt(j))) {
                str.remove(s.charAt(i));
                i++;
            }
            str.add(s.charAt(j));
            if (str.size() > maxLen) {
                maxLen = str.size();
            }
        }
        return maxLen;
    }
}
