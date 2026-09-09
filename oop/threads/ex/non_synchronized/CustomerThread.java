package com.oop.threads.ex.non_synchronized;
public class CustomerThread extends Thread {

    private String customerName;

    public CustomerThread(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void run() {
        MultiThreadDemo.printMessage(customerName);
    }
}