class Solution {
    private String invert(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c == '0' ? '1' : '0');
        }
        return sb.toString();
    }   

    private String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public char findKthBit(int n, int k) {
        String[] str = new String[n];
        str[0] = "0";
        for (int i = 1; i < n; i++) {
            str[i] = str[i - 1] + "1" + reverse(invert(str[i - 1]));
        }

        return str[n - 1].charAt(k - 1);
    }
}