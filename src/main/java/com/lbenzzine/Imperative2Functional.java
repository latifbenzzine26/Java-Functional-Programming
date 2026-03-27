package com.lbenzzine;

import java.util.Arrays;
import java.util.List;

public class Imperative2Functional {
    //Using imperative programming
    public static int calculateSum( List<Integer> numbers ) {
        int sum = 0;
        for ( int num : numbers ) {
            if( num % 2 == 0 )
                sum += num;
        }
        return sum;
    }

    //functional programming
    //Using Lambda from Java 8 onward

    public static int calculateSum2( List<Integer> numbers ) {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int result = calculateSum(numbers); // 20
        int result2 = calculateSum2(numbers); // 20
        if (result != result2) throw new AssertionError();
    }
}
