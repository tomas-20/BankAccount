public class BankAccount {
  double balance;
  int accountID;
  String password;
  public BankAccount(int a, String p) {
    balance = 0;
    accountID = a;
    password = p;
  }
  public String toString() {
    return Integer.toString(accountID) + '\t' + Double.toString(balance);
  }
}
