class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        int index = 0;
        
        while(numbers.size() > 1) {
            index += k - 1;
            index %= numbers.size();
            numbers.remove(numbers.get(index));
        }
        
        return numbers.get(0);
    }
}