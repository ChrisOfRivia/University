package MainTask;

public class Main {
    public static void main(String[] args) {
        Payable[] bankAccounts = new Payable[2];
        bankAccounts[0] = new DebitAccount(100, 10);
        bankAccounts[1] = new CreditAccount(100, 10, 2);

        for (Payable a : bankAccounts){
            metho(a);
        }
    }

    public static void metho(Payable a){
        System.out.println(a.pay());
    }

}
