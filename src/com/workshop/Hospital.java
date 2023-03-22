package com.workshop;

public class Hospital {

    String name;
    int age;
    long phone_number;
    String city;
    String state;
    String Department;

    public Hospital(String name, int age, long phone_number, String city, String state, String department) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.city = city;
        this.state = state;
        Department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }


    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone_number=" + phone_number +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}

