package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test

     public void testConstructor() {
        //given
        long expectedId = 2L;
        //when
        Person jen = new Person(expectedId);

        long actualId = jen.getId();
        //then
        Assert.assertEquals(expectedId, actualId);



    }

    @Test

    public void  testSetName() {

        //give
        String expectedName = "Jen";
        //when
        Person jen = new Person(3L);

        jen.setName(expectedName);

        String actualName = jen.getName();
        //then
        Assert.assertEquals(expectedName, actualName);


    }

    

}
