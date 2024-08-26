package org.example.Service;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;

public class CalculatorJunit5 {

    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic");
    }

    @AfterAll
    public static void cleanup(){
        System.out.println("After all test case logic");
    }

    @BeforeEach
    public void eachTest(){
        System.out.println("Before each");
    }

    @AfterEach
    public void  afterTest(){
        System.out.println("After each");
    }
    @Test
    @DisplayName("This is custom name")
    public void addTwoTest(){
        System.out.println("First Test case");
        int actualResult=Calculator.addTwo(12,12);
        int expectedResult=24;
        AssertionEquals.assertEquals(expectedResult,actualResult,"Test failed");

    }

    @Test
    @Disabled
    public void anyNumTest(){

        System.out.println("Second Test case");
            int result=Calculator.sumNum(12,1,2,3);
            int expectedResult=18;
            Assertions.assertionEquals(expectedResult,result);
        }


//        @Tag()
//    @Nested
//    @TestFactory

    }

