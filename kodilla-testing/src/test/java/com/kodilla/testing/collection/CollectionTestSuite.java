package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create blank List, " +
            "then return blank list")

    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> list = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        // When
        List<Integer> list2 =  oddNumbersExterminator.exterminate(list);
        //Then
        Assertions.assertTrue(list2.isEmpty());
    }

    @DisplayName("when create List with numbers, " +
            "then return List without odd numbers")

    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> list = Arrays.asList(75,108,5,34,52);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> list2 = oddNumbersExterminator.exterminate(list);
        //Then
        boolean checkList = true;
        for (Integer number : list2){
            if(number % 2 != 0){
                checkList = false;
                break;
            }
        }
        Assertions.assertTrue(checkList);

    }

}
