package com.codegym;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("Nhập n");
        int n = new Scanner(System.in).nextInt();
        hotel.addMultiCustomer(n);
        hotel.showListCustomer();
        System.out.println("Nhập số chứng minh nhân dân bạn muốn tìm:");
        String identity = new Scanner(System.in).nextLine();
        double totalMoney = hotel.totalMoney(identity);
        System.out.println(totalMoney);
    }
}
