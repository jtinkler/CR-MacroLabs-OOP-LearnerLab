package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test

    public void testImplementation(){
         //given
        Student bob = new Student();
        //when/then
        Assert.assertTrue(bob instanceof Learner);
    }
    @Test
    public void testInheritance() {

        //given
        Student bob = new Student();
        //when/then
        Assert.assertTrue(bob instanceof Person);


    }
    @Test
    public void testLearn() {
        //given (written by hand)
        double totalStudyTime = 9;

        Student bob = new Student();
        //when (calling method)
        bob.learn(3);
        bob.learn(6);
       double actual = bob.getTotalStudyTime();

       Assert.assertEquals(totalStudyTime, actual, 0);


    }

}
