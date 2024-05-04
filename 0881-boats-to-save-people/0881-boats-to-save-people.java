class Solution {
    private int result = 0;
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        
        while(left <= right) {
            if(left == right) {
                result++;
                return result;
            } else if(people[left] + people[right] > limit) {
                right--;
                result++;
            } else {
                right--;
                left++;
                result++;
            }
        }
        
        return result;
    }
}