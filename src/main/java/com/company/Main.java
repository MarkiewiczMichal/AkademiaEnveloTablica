package com.company;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {11, 10, 9, 8, 3, 2, 1};
        int x = 9;

        System.out.println(search(numbers, x));
    }

    private static boolean search(int[] numbers, int x) {
        if (numbers == null) return false;
        if (x > numbers[0]) return false;

        //binary search
        int left = 0;
        int right = numbers.length - 1;
        int avg;
        while (left <= right) {
            avg = (left+right)/2;

            if (x == numbers[avg]) return true;
            if (numbers[avg] > x) {
                left = avg + 1;

            } else
                right = avg - 1;
        }
        return false;
    }
}
