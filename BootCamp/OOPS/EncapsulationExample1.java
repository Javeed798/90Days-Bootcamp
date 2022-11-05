package BootCamp.OOPS;

class BankAccount {
    private int balance;

    public void setBalance(int balance) {
        if (balance >= 0) {
        this.balance = balance;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class EncapsulationExample1 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setBalance(10000);
        System.out.println(ba.getBalance());
    }
}
