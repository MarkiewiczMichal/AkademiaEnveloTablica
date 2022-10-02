package com.company;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {11, 10, 9, 8, 3, 2, 1};
        int x = 9;
        SearchNumberInArray searchNumberInArray = new SearchNumberInArray();
        System.out.println(searchNumberInArray.search(numbers, x));
    }
}
