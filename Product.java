package com.example;

import java.util.ArrayList;

public class Product{
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Alice", 12345));
        customers.add(new Customer("Bob", 12346));
        customers.add(new Customer("Charlie", 12347));

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1001));
        orders.add(new Order(1002));
        orders.add(new Order(1003));

        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            Order order = orders.get(i);
            customer.placeOrder(order);
        }
    }
}

class Customer {
    String name;
    int customerId;
    ArrayList<Order> orders;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }
}

class Order {
    int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }
}
