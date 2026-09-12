class Solution {

    public String minWindow(String s, String t) {
        if(s.length() < t.length()) {
            return "";
        }
        int minStart = 0;
        int minLen = s.length() + 1;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0) + 1);
        }
        int start = 0;
        int end = 0;
        int count = 0;
        while (end < s.length()) {
            map2.put(s.charAt(end), map2.getOrDefault(s.charAt(end), 0) + 1);
            if (map2.getOrDefault(s.charAt(end), 0) <= map1.getOrDefault(s.charAt(end), 0)) {
                count++;
            }

            while (count == t.length()) {

                if ((end - start + 1) < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                map2.put(s.charAt(start), map2.get(s.charAt(start)) - 1);
                if (map1.containsKey(s.charAt(start)) && map2.getOrDefault(s.charAt(start), 0) < map1.getOrDefault(s.charAt(start), 0) ) {
                    count--;
                }
                start++;
            }
            end++;
        }
        
        return (minLen == s.length() + 1) ? "" : s.substring(minStart, minStart + minLen);
    }
}
