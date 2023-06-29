package com.kodilla.good.patterns.challenges;

public class UserShop {
    private String name;
    private String surname;
    private String address;

    public UserShop(final String name,final String surname,final String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getUserName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Shop user: " + name + ' ' + surname + ' ' +
                "\nAddress: " + address;
    }
}
