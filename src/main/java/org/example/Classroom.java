package org.example;


public class Classroom {
    String email;
    int result;
    String name;
    int age;
    String address

    public int add(int age1, int age2){
        result=age1 + age2;
        return result;
    }

    public int subtract(int age1, int age2){
        result=age1-age2;
        return result;
    }

    public int multiply(int num1, int num2){
        result=num1*num2;
        return result;
    }

    public String setEmail(String newEmail){
        this.email = newEmail;
        return this.email;
    }

    public float divide(int num1, int num2){
        result = num1/num2;
        return result;
    }
    
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }

    public String getEmail(){
        return this.email;
    }

    public float mode(int num1, int num2) {
        result = num1 % num2;
        return result;
    }

}
