class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Bank Artha Graha");

        bank.addCustomer("Barbara", "Palvin");
        System.out.println(bank.getNumberOfCustomers());

        System.out.println(bank.getCustomer(0).getFirstName());

        Account barbaraAcc = bank.getCustomer(0).getAccount();

        barbaraAcc.deposit(50000);
        barbaraAcc.withdraw(20000);
        System.out.println(barbaraAcc.getBalance());
        System.out.println(barbaraAcc.withdraw(100000000));

    }
}