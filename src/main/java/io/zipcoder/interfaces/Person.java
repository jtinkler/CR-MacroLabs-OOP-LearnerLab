package io.zipcoder.interfaces;

public class Person {

            final long id;
            String name;


            Person(long id) {


                this.id = id;

            }

            Person(){


                id = 0;
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
