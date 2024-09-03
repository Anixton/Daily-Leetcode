class Solution {
    private int sum = 0;

    public int getLucky(String s, int k) {
        convertStringToSum(s);
        return applyTransformations(sum, k - 1);
    }

    private void convertStringToSum(String s) {
        for (int i = 0; i < s.length(); i++) {
            int charValue = convertCharToInteger(s.charAt(i));
            addDigitsToSum(charValue);
        }
    }

    private int convertCharToInteger(char c) {
        return c - 'a' + 1;
    }

    private void addDigitsToSum(int number) {
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
    }

    private int applyTransformations(int value, int remainingIterations) {
        if (remainingIterations == 0 || value < 10) {
            return value;
        }

        int transformedValue = sumDigits(value);
        return applyTransformations(transformedValue, remainingIterations - 1);
    }

    private int sumDigits(int number) {
        int total = 0;
        while (number > 0) {
            total += number % 10;
            number /= 10;
        }
        return total;
    }
}
