class Solution {
    private static final int AGE_START_INDEX = 11;
    private static final char SENIOR_AGE_THRESHOLD = '6';
    private static final char SENIOR_AGE_SECOND_DIGIT_THRESHOLD = '0';
    
    private boolean isSenior(String candidate) {
        char ageFirstDigit = candidate.charAt(AGE_START_INDEX);
        char ageSecondDigit = candidate.charAt(AGE_START_INDEX + 1);
        
        if (ageFirstDigit > SENIOR_AGE_THRESHOLD) {
            return true;
        } else if (ageFirstDigit == SENIOR_AGE_THRESHOLD && 
                   ageSecondDigit > SENIOR_AGE_SECOND_DIGIT_THRESHOLD) {
            return true;
        }
        
        return false;
    }
    
    
    public int countSeniors(String[] details) {
        int seniorCount = 0;
        
        for(String detail : details) {
            if(isSenior(detail)) {
                seniorCount++;
            }
        }
        
        return seniorCount;
    }
}