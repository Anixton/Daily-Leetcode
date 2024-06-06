class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();

        for (int i = 0; i < hand.length; i++) {
            int num = hand[i];

            if (HM.containsKey(num)) {
                HM.put(num, HM.get(num) + 1);
            } else {
                HM.put(num, 1);
            }
        }

        Arrays.sort(hand);

        for (int i = 0; i < hand.length; i++) {
            if (!HM.containsKey(hand[i]) || HM.get(hand[i]) == 0) {
                continue;
            }
            
            int num = hand[i];

            for (int counter = 0; counter < groupSize; counter++) {
                if (HM.containsKey(num) && HM.get(num) >= 1) {
                    HM.put(num, HM.get(num) - 1);
                } else {
                    return false;
                }
                
                num++;
            }
        }

        return true;
    }
}