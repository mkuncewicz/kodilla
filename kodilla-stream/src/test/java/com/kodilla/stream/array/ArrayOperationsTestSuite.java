package com.kodilla.stream.array;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {


    @Test
    void testGetAverage(){
        //Given
        int[] tab = new int[20];
        for (int i= 0; i < 20; i++){
            tab[i] = i+1;
        }
        //When
        double result = ArrayOperations.getAverage(tab);
        //Then
        assertEquals(10.5,result);
    }

}
