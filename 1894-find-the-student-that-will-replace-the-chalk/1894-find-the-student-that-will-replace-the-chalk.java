class Solution {

    public int chalkReplacer(int[] chalkUsage, int chalkPiecesAvailable) {
        long totalChalkRequired = calculateTotalChalkRequired(chalkUsage);
        int remainingChalk = calculateRemainingChalk(chalkPiecesAvailable, totalChalkRequired);

        return findStudentIndex(chalkUsage, remainingChalk);
    }

    private long calculateTotalChalkRequired(int[] chalkUsage) {
        long totalChalk = 0;

        for (int chalk : chalkUsage) {
            totalChalk += chalk;
        }

        return totalChalk;
    }

    private int calculateRemainingChalk(int chalkPiecesAvailable, long totalChalkRequired) {
        return (int) (chalkPiecesAvailable % totalChalkRequired);
    }

    private int findStudentIndex(int[] chalkUsage, int remainingChalk) {
        for (int studentIndex = 0; studentIndex < chalkUsage.length; studentIndex++) {
            if (remainingChalk < chalkUsage[studentIndex]) {
                return studentIndex;
            }

            remainingChalk -= chalkUsage[studentIndex];
        }

        return 0;
    }
}
