package ru.sem.testviewpager;

/**
 * Created by Admin on 06.04.2017.
 */

public class Contact {

    private String name, lastname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Contact(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
}
