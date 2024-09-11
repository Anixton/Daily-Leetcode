class Solution {
    public int minBitFlips(int start, int goal) {
        String binaryStart = Integer.toBinaryString(start);
        String binaryGoal = Integer.toBinaryString(goal);

        return calculateBitFlips(binaryStart, binaryGoal);
    }

    private int calculateBitFlips(String binaryStart, String binaryGoal) {
        int bitFlips = 0;
        int startIndex = binaryStart.length() - 1;
        int goalIndex = binaryGoal.length() - 1;

        while (startIndex >= 0 && goalIndex >= 0) {
            if (binaryStart.charAt(startIndex--) != binaryGoal.charAt(goalIndex--)) {
                bitFlips++;
            }
        }

        bitFlips += countRemainingOnes(binaryStart, startIndex);
        bitFlips += countRemainingOnes(binaryGoal, goalIndex);

        return bitFlips;
    }

    private int countRemainingOnes(String binaryString, int index) {
        int count = 0;
        
        while (index >= 0) {
            if (binaryString.charAt(index--) == '1') {
                count++;
            }
        }
        
        return count;
    }
}
