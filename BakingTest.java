public class BakingTest {
    public static void main(String[] args) {
        Account acc = new Account(8000);
        System.out.println("Initial balance: ");
        acc.display();
        Sender s = new Sender(acc);
        Receier r = new Receier(acc);

        s.t.start();
        r.t.start();

        System.out.println("Press Control-C to stop");
    }
}
