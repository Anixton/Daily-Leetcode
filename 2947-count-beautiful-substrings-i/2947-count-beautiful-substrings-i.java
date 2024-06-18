class Solution {
    public int beautifulSubstrings(String s, int k) {
        HashSet<Character> HS = new HashSet<>();
        HS.add('a');
        HS.add('e');
        HS.add('i');
        HS.add('o');
        HS.add('u');
        
        int n = s.length();
        int[] vowelArray = new int[n + 1];
        int[] consonantArray = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            vowelArray[i + 1] = vowelArray[i] + (HS.contains(s.charAt(i)) ? 1 : 0);
            consonantArray[i + 1] = consonantArray[i] + (HS.contains(s.charAt(i)) ? 0 : 1);
        }
        
        int result = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                int vowelCount = vowelArray[i] - vowelArray[j];
                int consonantCount = consonantArray[i] - consonantArray[j];
                
                if (consonantCount == vowelCount && (vowelCount * consonantCount) % k == 0) {
                    result++;
                }
            }
        }
        
        return result;
    }
}