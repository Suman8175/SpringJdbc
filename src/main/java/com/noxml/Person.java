package com.noxml;

public class Person {

    int personId;
    String personName;
    String personAddress;
   int personAge;

    public Person(int personId, String personName, String personAddress, int personAge) {
        this.personId = personId;
        this.personName = personName;
        this.personAddress = personAddress;
        this.personAge = personAge;
    }

    public Person() {
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personAddress='" + personAddress + '\'' +
                ", personAge=" + personAge +
                '}';
    }
}
