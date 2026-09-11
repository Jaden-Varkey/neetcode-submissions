class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq = 0;
        int maxLen = k;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int start = 0, end = 0; end < s.length(); end++) {
        
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(end)));

            int rep = (end - start + 1) - maxFreq;
            if (rep > k) {
                map.put(s.charAt(start), map.get(s.charAt(start)) - 1);
                if (map.get(s.charAt(start)) == 0) {
                    map.remove(s.charAt(start));
                }
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}

// X X Y X Y A Y Y Y
//  5, 