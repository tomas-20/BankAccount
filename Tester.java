public class Tester {
  public static void main(String[] args) {
    int bobNumber = Integer.parseInt(args[0]);
    String bobFirstPassword = args[1];
    double bobDeposit = Double.parseDouble(args[2]);
    double bobWithdraw = Double.parseDouble(args[3]);
    String bobNewPassword = args[4];
    double bobGenerosity = Double.parseDouble(args[5]);
    String bobMemory = args[6];
    BankAccount bob = new BankAccount(bobNumber, bobFirstPassword);
    bob.deposit(bobDeposit);
    bob.withdraw(bobWithdraw);
    bob.setPassword(bobNewPassword);
    System.out.println(bob.getAccountID());
    System.out.println(bob.getBalance());
    System.out.println(bob.toString());
    BankAccount joe = new BankAccount(42, "not important");
    System.out.println(bob.transferTo(joe, bobGenerosity, bobMemory));
    System.out.println(joe.toString());
  }
}
