package com.oop.threads.ex.non_synchronized;
public class MultiThreadDemo {
    public static void printMessage(String name) {
        System.out.println(name + " entered");
        System.out.println(name+" food ordering");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(name+" eating");
        System.out.println(name + " exited");
    }

    public static void main(String[] args) throws InterruptedException {

        CustomerThread t1 = new CustomerThread("Customer Rakesh Team(rak,chinna,tarun, sk)");
        CustomerThread t2 = new CustomerThread("Customer Vamsi Team(Food eaters) ");
        CustomerThread t3 = new CustomerThread("Customer Somesh (charger thief)");
        CustomerThread t4 = new CustomerThread("Customer Pullarao(Pshyco killer)");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }
}