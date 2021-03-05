package com.javalearn.model;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    private String firstName;
    private String lastName;
    private boolean premiumStatus;
    private int age;

    public Customer(String firstName, String lastName, boolean premiumStatus, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.premiumStatus = premiumStatus;
        this.age = age;
    }

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPremiumStatus() {
        return premiumStatus;
    }

    public void setPremiumStatus(boolean premiumStatus) {
        this.premiumStatus = premiumStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Customer c) {
        return Comparator.comparing(Customer::isPremiumStatus)
                .thenComparing(Customer::getAge).reversed()
                .compare(this, c);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", premiumStatus=" + premiumStatus +
                ", age=" + age +
                '}';
    }
}
