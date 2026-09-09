package com.oop.threads.ex.syschronize;


public class CustomerThread extends Thread {

    private String customerName;

    public CustomerThread(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void run() {
        SynchronizationDemo.printMessage(customerName);
    }
}