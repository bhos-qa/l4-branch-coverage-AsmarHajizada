package org.example;

enum classroomType{
    MORNING, EVENING
}

public class Classroom {
    public static String name;
    public static int age;
    public static String address;
    public static String email;
    public static classroomType type;

    public String setName(String newName){
        this.name = newName;
        return this.name;
    }

    public int setAge(int newAge){
        this.age = newAge;
        return this.age;
    }

    public String setAddress(String newAddress){
        this.address = newAddress;
        return this.address;
    }

    public String setEmail(String newEmail){
        this.email = newEmail;
        return this.email;
    }

    public classroomType setClassoomType (classroomType newtype){
        this.type = newtype;
        return this.type;
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

    public String getClassroomType(){
        return switch (this.type) {
            case MORNING -> "MORNING";
            case EVENING -> "EVENING";
        };
    }
}
