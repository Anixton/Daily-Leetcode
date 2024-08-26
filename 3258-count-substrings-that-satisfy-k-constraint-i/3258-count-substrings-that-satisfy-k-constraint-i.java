class Solution {
    private int resultCount = 0;
    private int constraintValue;

    private int oneCount = 0;
    private int zeroCount = 0;
    
    public int countKConstraintSubstrings(String stringToCountValidSubstrings, int constraintValue) {
        this.constraintValue = constraintValue;

        for(int leftPointer = 0; leftPointer < stringToCountValidSubstrings.length(); leftPointer++) {
            generateSubstrings(stringToCountValidSubstrings, leftPointer);
        }

        return resultCount;
    }

    private void generateSubstrings(String stringToCountValidSubstrings, int leftPointer) {
        oneCount = 0;
        zeroCount = 0;

        for(int rightPointer = leftPointer; rightPointer < stringToCountValidSubstrings.length(); rightPointer++) {
            Character currentChar = stringToCountValidSubstrings.charAt(rightPointer);
            updateCountValues(currentChar);
            
            if(!checkIfSubstringIsValid(oneCount, zeroCount)) {
                break;
            }
        }
    }

    private void updateCountValues(Character value) {
        if(value == '0') {
            zeroCount++;
        } else {
            oneCount++;
        }
    }

    private boolean checkIfSubstringIsValid(int oneCount, int zeroCount) {
        if(oneCount <= constraintValue || zeroCount <= constraintValue) {
            resultCount++;
            return true;
        }

        return false;
    }
}