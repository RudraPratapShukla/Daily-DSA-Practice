package FunctionOrMethods;

// used the reverse for of converting binToDec() by multiplying with powers of 10

public class decimalToBinary {
    public static void decToBin(int decNum) {
        int pow = 0;
        int binNum = 0;
        int myNum = decNum;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum += (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Decimal to Binary of " + myNum + " is :" + binNum);
    }

    public static void main(String[] args) {
        decToBin(20);
    }
}
