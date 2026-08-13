class Solution {

    public String encode(List<String> strs) {
        StringBuilder text = new StringBuilder("");
        for (String str : strs) {
            text.append(str.length()).append(" ");
        }
        text.append("#");
        for (String str : strs) {
            text.append(str);
        }
        return text.toString();
    }

    public List<String> decode(String str) {
        List<Integer> lengths = new ArrayList<>();
        for (int end = 1, start = 0; end < str.length(); end++) {
            if (str.charAt(end) == ' ') {
                lengths.add(Integer.parseInt(str.substring(start, end)));
                start = end + 1;
            } else if (str.charAt(end) == '#') {
                str = str.substring(end + 1);
                break;
            }
        }

        List<String> text = new ArrayList<String>();
        for (int len : lengths) {
            text.add(str.substring(0, len));
            str = str.substring(len);
        }
        return text;
    }
}
