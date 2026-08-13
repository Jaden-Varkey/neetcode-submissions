class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

         // O(nlogn) time, O(1) or 
        /*
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        Arrays.sort(s_arr);
        Arrays.sort(t_arr);

        if (Arrays.equals(s_arr, t_arr)) {
            return true;
        }
        return false;*/

        /* O(n) time with O(k) space
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s_arr.length; i++) {          
            map1.put(s_arr[i], map1.getOrDefault(s_arr[i], 0) + 1);
        }
        for (int i = 0; i < t_arr.length; i++) {    
            map2.put(t_arr[i], map2.getOrDefault(t_arr[i], 0) + 1);
        }
        if (map1.equals(map2)) {
            return true;
        } else {
            return false;
        }*/

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) return false;
        }

        return true;
    }
}
