package com.example;

import java.util.Date;
import java.util.List;
import java.util.LinkedList;

public class LinkedList4{
    public static void main(String[] args) {
        Store store = new Store("My Store", "123 Main St");

        Customer alice = new Customer("Alice", "456-789-123");
        Customer bob = new Customer("Bob", "789-123-456");
        store.addCustomer(alice);
        store.addCustomer(bob);

        Product product1 = new Product("Widget", 9.99);
        Product product2 = new Product("Gadget", 19.99);
        store.addProduct(product1);
        store.addProduct(product2);

        Order order1 = new Order(alice, new Date());
        OrderItem item1 = new OrderItem(product1, 2);
        OrderItem item2 = new OrderItem(product2, 1);
        order1.addItem(item1);
        order1.addItem(item2);
        store.addOrder(order1);

        Order order2 = new Order(bob, new Date());
        OrderItem item3 = new OrderItem(product1, 3);
        order2.addItem(item3);
        store.addOrder(order2);
    }
}

class Store {
    String name;
    String address;
    List<Customer> customers;
    List<Product> products;
    List<Order> orders;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
        this.customers = new LinkedList<>();
        this.products = new LinkedList<>();
        this.orders = new LinkedList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}

class Customer {
    String name;
    String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    Customer customer;
    Date date;
    List<OrderItem> items;

    public Order(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
        this.items = new LinkedList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }
}

class OrderItem {
    Product product;
    int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
