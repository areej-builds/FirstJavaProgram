import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountTitle;
    private double balance;

    public void setaccountNumber(int a) {
        this.accountNumber = a;
    }

    public int getaccountNumber() {
        return accountNumber;
    }

    public void setaccountTitle(String title) {
        this.accountTitle = title;
    }

    public String getaccountTitle() {
        return accountTitle;
    }

    public void setaccountBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance must be greater than zero");
            this.balance = 0;
        }
    }

    public double getbalance() {
        return balance;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter your Account Number: ");
        int account_number = scn.nextInt();
        scn.nextLine();

        System.out.print("Enter your Account Title: ");
        String account_title = scn.nextLine();

        System.out.print("Enter your Account Balance: ");
        double account_balance = scn.nextDouble();

        acc.setaccountNumber(account_number);
        acc.setaccountTitle(account_title);
        acc.setaccountBalance(account_balance);

        System.out.println("Your Account Number: " + acc.getaccountNumber());
        System.out.println("Your Account Title: " + acc.getaccountTitle());
        System.out.println("Your Account Balance: " + acc.getbalance());
    }
}

