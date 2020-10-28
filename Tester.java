public class Tester {
  public static void main(String[] args) {
    BankAccount bob = new BankAccount(Integer.parseInt(args[0]), args[1]);
    bob.deposit(Double.parseDouble(args[2]));
    bob.withdraw(Double.parseDouble(args[3]));
    bob.setPassword(args[4]);
    System.out.println(bob.getAccountID());
    System.out.println(bob.getBalance());
    System.out.println(bob.toString());
  }
}
