package com.sweety.automation;

/**
 * Created by skumari on 1/19/2018.
 */
public class AEncapsulation {
        private String name;
        private int age;
        private int id;

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public int getId(){
            return id;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }

        public void setId(int id){
            this.id = id;
        }

        public static void main(String args[]){
            AEncapsulation obj = new AEncapsulation();
            obj.setName("Aarti");
            obj.setAge(12);
            obj.setId(1);
            System.out.println("Name is: " + obj.getName() + " Age is: " + obj.getAge() + " Id is: " + obj.getId());

        }
    }
