//package org.example.Service;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorTest {
//
//    int counter=0;
//    //BeforeClass
//    @BeforeClass //Before all test cases
//    public static void init(){
//        System.out.println("Before all test cases:");
//        System.out.println("Started test:"+new Date());
//    }
//    //test method of addTwo
//
//    @Before //executes the method before each test case
//    public void beforeEach(){
//        System.out.println("Before each test case");
//        counter=0;
//    }
//    @Test
//    public void addTwo(){
//        for (int i=1;i<=20;i++){
//            counter+=i;
//        }
//        System.out.println("Test for addition of two number");
//        int result=Calculator.addTwo(12,45);
//        int expected=57;
//        System.out.println("Counter int first test case:"+counter);
//        Assert.assertEquals(expected,result);
//    }
//
//    @Test
//    public void sumNumTest(){
//        for (int i=1;i<=100;i++){
//            counter+=i;
//        }
//        System.out.println("Test for multiplication of multiple number");
//        int result=Calculator.sumNum(2,7,8,9);
//
//        int expected=26;
//        System.out.println("Counter int second test case:"+counter);
//        Assert.assertEquals(expected,result);
//    }
//
//    @AfterClass //after all test cases
//    public static  void cleanup(){
//        System.out.println("After all test cases");
//        System.out.println("End test cases:"+new Date());
//    }
//}
