package org.interview.livecode;

public class primeNumber {
    public static boolean isPrimeNumber(int number) {
        if (number<=1)
            return false;

        for (int i=2; i<=Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 8;
        boolean isPrimeNum = isPrimeNumber(number);
        System.out.println("\"" + number + "\" " + "isPrimeNum: " + isPrimeNum);

        // find series of prime number up to N index
        int upTo = 10;
        System.out.print("prime number series: ");
        for (int i=2; i<=10;i++) {
            if (isPrimeNumber(i))
                System.out.print(i + "\t");
        }
    }
}
