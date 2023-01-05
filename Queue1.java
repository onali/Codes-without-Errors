package com.example;

import java.util.Date;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue1{
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer alice = new Customer("Alice", 100000);
        Customer bob = new Customer("Bob", 200000);
        bank.addCustomer(alice);
        bank.addCustomer(bob);

        Account account1 = new Account(alice, 1000);
        Account account2 = new Account(bob, 2000);
        Account account3 = new Account(alice, 3000);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        Transaction transaction1 = new Transaction(account1, account2, 500, new Date());
        Transaction transaction2 = new Transaction(account2, account3, 1000, new Date());
        Transaction transaction3 = new Transaction(account3, account1, 2000, new Date());
        bank.addTransaction(transaction1);
        bank.addTransaction(transaction2);
        bank.addTransaction(transaction3);
    }
}

class Bank {
    String name;
    List<Customer> customers;
    List<Account> accounts;
    Queue<Transaction> transactions;

    public Bank(String name) {
        this.name = name;
        this.customers = new LinkedList<>();
        this.accounts = new LinkedList<>();
        this.transactions = new LinkedList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}

class Customer {
    String name;
    long income;

    public Customer(String name, long income) {
        this.name = name;
        this.income = income;
    }
}

class Account {
    Customer customer;
    long balance;

    public Account(Customer customer, long balance) {
        this.customer = customer;
        this.balance = balance;
    }
}

class Transaction {
    Account from;
    Account to;
    long amount;
    Date date;

    public Transaction(Account from, Account to, long amount, Date date) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.date = date;
    }
}
