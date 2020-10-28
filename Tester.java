public class Tester {
  public static void main(String[] args) {
    BankAccount bob = new BankAccount(2187, "super secret");
    bob.deposit(-2.0);
    bob.deposit(2000.0);
    bob.withdraw(-2.0);
    bob.withdraw(30.0);
    bob.withdraw(1990.0);
    System.out.println(bob.toString());
    System.out.println(bob.getAccountID());
    System.out.println(bob.getBalance());
  }
}
