package Oops.ObjectAndClass;
class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    public BankAccount(String holder, String number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance.");
    }
    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Yuvi Chaudhary", "123456", 5000.0);
        account1.displayBalance();
        account1.deposit(1500.0);
        account1.withdraw(2000.0);
        account1.displayBalance();
    }
}
