class Solution {
    
    public int findComplement(int number) {
        String binaryString = toBinaryString(number);
        String complementedBinaryString = complementBinaryString(binaryString);
        return binaryStringToDecimal(complementedBinaryString);
    }
    
    private String toBinaryString(int number) {
        return Integer.toBinaryString(number);
    }
    
    private String complementBinaryString(String binaryString) {
        StringBuilder complement = new StringBuilder();
        for (char bit : binaryString.toCharArray()) {
            complement.append(bit == '1' ? '0' : '1');
        }
        return complement.toString();
    }
    
    private int binaryStringToDecimal(String binaryString) {
        return Integer.parseInt(binaryString, 2);
    }
}