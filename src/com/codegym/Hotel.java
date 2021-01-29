package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    List<Customer> customers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void showCustomerInfo(Customer customer) {
        String showCustomerInfo = "Tên: " + customer.getName();
        showCustomerInfo += "\tNgày sinh: " + customer.getDateOfBirth();
        showCustomerInfo += "\tChứng minh nhân dân: " + customer.getIdentity();
        showCustomerInfo += "\tSố ngày trọ: " + customer.getDay();
        showCustomerInfo += "\tLoại phòng: " + customer.getTypeOfRoom();
        showCustomerInfo += "\tGiá phòng: " + customer.getPrice();
        System.out.println(showCustomerInfo);
    }

    public void inputCustomerInfo() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập CMND:");
        String identity = scanner.nextLine();
        System.out.println("Nhập số ngày trọ:");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập loại phòng:");
        String type = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập giá phòng:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Customer customer = new Customer(name, dateOfBirth, identity, day, type, price);
        customers.add(customer);
    }

    public void deleteCustomerInfo(Customer customer) {
        customers.remove(customer);
    }

    public void addMultiCustomer(int n) {
        for (int i = 0; i < n; i++) {
            inputCustomerInfo();
        }
    }

    public void showListCustomer() {
        for (int i = 0; i < customers.size(); i++) {
            showCustomerInfo(customers.get(i));
        }
    }

    public int findCustomerByIdentity(String identity) {
        int index = -1;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getIdentity().equals(identity)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public double totalMoney(String identity) {
        int index = findCustomerByIdentity(identity);
        if (index == -1) {
            return 0;
        } else {
            double totalMoney = customers.get(index).getDay() * customers.get(index).getPrice();
            return totalMoney;
        }
    }
}
