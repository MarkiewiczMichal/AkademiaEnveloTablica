package com.company;

import junit.framework.TestCase;
import org.junit.Test;

public class MainTest extends TestCase {

    @Test
    public void testSearchEmptyArray() {
        //given
        SearchNumberInArray searchNumberInArray = new SearchNumberInArray();
        int[] numbers = {};

        //when
        int x = 9;

        //then
        assertFalse(searchNumberInArray.search(numbers, x));
    }

    @Test
    public void testSearchArrayIsNull(){
        //given
        SearchNumberInArray searchNumberInArray = new SearchNumberInArray();
        int[] numbers = null;

        //when
        int x = 9;

        //then
        assertFalse(searchNumberInArray.search(numbers, x));
    }

    @Test
    public void testSearchNegativeNumber(){
        //given
        SearchNumberInArray searchNumberInArray = new SearchNumberInArray();
        int[] numbers = {11, 10, 9, 8, 3, 2, 1};

        //when
        int x = -9;

        //then
        assertFalse(searchNumberInArray.search(numbers, x));
    }

    @Test
    public void testSearchNumberIsGreaterThanHighestNumberInArray(){
        //given
        SearchNumberInArray searchNumberInArray = new SearchNumberInArray();
        int[] numbers = {11, 10, 9, 8, 3, 2, 1};

        //when
        int x = 99;

        //then
        assertFalse(searchNumberInArray.search(numbers, x));
    }


}