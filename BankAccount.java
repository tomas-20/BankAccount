public class BankAccount {
  double balance;
  int accountID;
  String password;
  public BankAccount(int a, String p) {
    balance = 0;
    accountID = a;
    password = p;
  }
  public double getBalance() {
    return balance;
  }
  public int getAccountID() {
    return accountID;
  }
  public String toString() {
    return Integer.toString(accountID) + '\t' + Double.toString(balance);
  }
  public boolean changeBalance(double amount, boolean type) {
    boolean bad = false;
    double n = amount;
    if (type) {
      bad = amount > balance;
      n *= -1;
    }
    if (amount < 0 || bad) {
      return false;
    }
    else {
      balance += n;
      return true;
    }
  }
  public boolean deposit(double n) {
    return changeBalance(n, false);
  }
  public boolean withdraw(double n) {
    return changeBalance(n, true);
  }
}
