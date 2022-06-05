package com.akilesh;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrimeFactor = 0;

        boolean notPrime = false;
        // Dividing the number by all the numbers less than that and also including that.
        for (int i = 2; i <= number; i++) {
            // Checking if the divisor is the factor of our number.
            if ((number % i) == 0) {
                // Checking if the factor is prime with the for loop by dividing with all the numbers less than our num.
                for (int j = 2; j < i; j++) {
                    if ((i % j) == 0) {
                        notPrime = true;
                    }
                }
                if (i > largestPrimeFactor && !notPrime) {
                    largestPrimeFactor = i;
                }
            }
        }
        if (largestPrimeFactor > 1) {
            return largestPrimeFactor;
        } else {
            return -1;
        }
    }
}
