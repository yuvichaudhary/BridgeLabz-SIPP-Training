package Inheritence;
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayCommonInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        displayCommonInfo();
        System.out.println("Account Type: Savings");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        displayCommonInfo();
        System.out.println("Account Type: Checking");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int lockInPeriod; // in months

    FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    void displayAccountType() {
        displayCommonInfo();
        System.out.println("Account Type: Fixed Deposit");
        System.out.println("Lock-in Period: " + lockInPeriod + " months");
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA001", 15000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA001", 8000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount("FDA001", 50000, 12);

        savings.displayAccountType();
        System.out.println("---------------");
        checking.displayAccountType();
        System.out.println("---------------");
        fda.displayAccountType();
    }
}