package org.example;

enum classroomType{
    TECHNICAL, BUSINESS
}

public class Department {
    public String name;
    public int age;
    public String address;
    public String email;
    public departmentType type;

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

    public departmentType setDepartmentType (departmentType newtype){
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

    public String getDepartmentType(){
        return switch (this.type) {
            case TECHNICAL -> "TECHNICAL";
            case BUSINESS -> "BUSINESS";
        };
    }
}
