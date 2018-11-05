package io.zipcoder.interfaces;

public class Person {

            final long id;
            String name;


            Person(long id) {


                this.id = id;

            }

            long getId(){
                return id;

            }

            String getName() {
                return name;
            }

            void setName(String name) {

                this.name = name;
            }

}
