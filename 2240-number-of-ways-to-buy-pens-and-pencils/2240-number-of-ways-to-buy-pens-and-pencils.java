class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long result = 0;
        int loopLimit1 = total / cost1;

        for (int i = 0; i <= loopLimit1; i++) {
            int remaining = total - (i * cost1);
            result += (remaining / cost2) + 1;
        }

        return result;
    }
}