package org.example.Service;

import org.junit.jupiter.api.Assertions;

import javax.naming.Name;

public class AssertExample {

    //Assertion-validating actual result with expected result
    //Assertions class

    public void test1(){
        System.out.println("Testing some assertion method");
        int actual=12;
        int expected=12;
        //Overloaded
//        Assertions. assertEquals(expected,actual);
//        int []actualIntArray={1,2,3,4,5};
//        int []expectedIntArray={1,2,3,4,5};
//        Assertions.assertArrayEquals(expectedIntArray,actualIntArray);

        String name=new String("rahul");
        String expectedName=new String("rahul");

        Assertions.assertEquals(expectedName, name);
    }
}
