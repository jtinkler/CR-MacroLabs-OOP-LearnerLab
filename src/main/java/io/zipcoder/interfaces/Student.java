package io.zipcoder.interfaces;

public class Student extends Person implements Learner  {

    double totalStudyTime;

      public void learn(double numberOfHours){

           totalStudyTime += numberOfHours;
       }

     public double getTotalStudyTime(){

          return totalStudyTime;
        }
}
