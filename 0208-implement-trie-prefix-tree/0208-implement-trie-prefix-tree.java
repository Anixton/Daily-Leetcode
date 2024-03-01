class Trie {
    HashSet<String> storedValues;
    HashSet<String> storedPartitionValues;
    
    public Trie() {
        storedValues = new HashSet<String>();
        storedPartitionValues = new HashSet<String>();
    }
    
    public void insert(String word) {
        storedValues.add(word);
        
        for(int i=1;i<=word.length();i++){
            storedPartitionValues.add(word.substring(0, i));
        }
    }
    
    public boolean search(String word) {
        if(storedValues.contains(word)){
            return true;
        }
        
        return false;
    }
    
    public boolean startsWith(String prefix) {
        if(storedPartitionValues.contains(prefix)){
            return true;
        }
        
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */