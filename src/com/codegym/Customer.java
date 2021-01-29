package com.codegym;

public class Customer extends Person{
    private int day;

    private String typeOfRoom;

    private double price;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String identity, int day, String typeOfRoom, double price) {
        super(name, dateOfBirth, identity);
        this.day = day;
        this.typeOfRoom = typeOfRoom;
        this.price = price;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
