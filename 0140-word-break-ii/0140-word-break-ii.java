class Solution {
    private Set<String> wordSet;
    private Map<String, List<List<String>>> memo;

    public List<String> wordBreak(String s, List<String> wordDict) {
        wordSet = new HashSet<>(wordDict);
        memo = new HashMap<>();
        
        List<List<String>> sentences = _wordBreak_topdown(s);
        
        List<String> result = new ArrayList<>();
        for (List<String> words : sentences) {
            result.add(String.join(" ", words));
        }
        
        return result;
    }

    private List<List<String>> _wordBreak_topdown(String s) {
        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        List<List<String>> result = new ArrayList<>();
        if (s.isEmpty()) {
            result.add(new ArrayList<>());
            return result;
        }

        for (int endIndex = 1; endIndex <= s.length(); endIndex++) {
            String word = s.substring(0, endIndex);
            if (wordSet.contains(word)) {
                List<List<String>> subSentences = _wordBreak_topdown(s.substring(endIndex));
                for (List<String> subSentence : subSentences) {
                    List<String> newSentence = new ArrayList<>(subSentence);
                    newSentence.add(0, word);
                    result.add(newSentence);
                }
            }
        }

        memo.put(s, result);
        return result;
    }
}
