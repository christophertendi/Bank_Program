class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Bank Artha Graha");

        bank.addCustomer("Barbara", "Palvin");
        System.out.println(bank.getNumberOfCustomers());

        System.out.println(bank.getCustomer(0).getFirstName());

        Account jasonAcc = bank.getCustomer(0).getAccount();

        jasonAcc.deposit(50000);
        jasonAcc.withdraw(20000);
        System.out.println(jasonAcc.getBalance());
        System.out.println(jasonAcc.withdraw(100000000));

    }
}