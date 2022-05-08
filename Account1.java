import java.util.Scanner;

class Sender implements Runnable{
    Account acc;
    Thread t;
    Scanner sc;

    Sender(Account acc){
        this.acc = acc;
        t = new Thread(this, "Sender");
        sc = new Scanner(System.in);
    }

    public void run(){
        while(true){
            int amount = sc.nextInt();
            acc.deposit(amount);
        }
    }
}

class Receier implements Runnable{
    Account acc;
    Thread t;
    Receier(Account acc){
        this.acc = acc;
        t = new Thread(this, "Receier");
    }

    public void run(){
        while(true){
            int i = acc.withdraw();
        }
    }
}

