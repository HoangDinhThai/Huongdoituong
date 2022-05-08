import java.util.Scanner;

import javax.management.ValueExp;

public class Account {
    int balance;
    int amount;

    String customerName;
    String customerId;
    boolean valueSet = false;

    Account(){
        balance = 6000;
    }

    Account(int b){
        balance = b;
        display();
    }

    public synchronized int deposit (int amount){
        while(valueSet)
        try {
            wait();
        } catch (InterruptedException e) {
            }
            if(balance >= amount){
                System.out.println(Thread.currentThread().getName() + " is going to deposit $ " + amount);
                try {
                    Thread.sleep(1000);
                } 
                catch (InterruptedException ex) {
                }

                this.amount = amount;
                setBalance(balance + amount);
                display();
                System.out.println(Thread.currentThread().getName() + "completer the deposit of $ " + amount);
            }
            else{
                System.out.println("Not enought in account for " + Thread.currentThread().getName() + "to withdraw: " + balance);
            }
            valueSet = true;
            notify();
        return balance;
    }
    public synchronized void setBalance(int b){
        balance = b;
    }

    public synchronized int withdraw(){
        while(!valueSet)
        try {
            wait();
        } 
        catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        if(amount != 0){
            System.out.println("Going to withdraw $: " + amount);
            balance = balance - amount;

            setBalance(balance);
            display();
        }

        valueSet = false;
        notify();
        return amount;
    }
    synchronized void display(){
        System.out.println("So du tai khoan la: " + balance);
    }
}
