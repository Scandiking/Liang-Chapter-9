public class Section_9_7b {
    public static void main(String[] args) {
        // Creates new instance of object with id 1122 and initial balance 20000
        Section_9_7 account = new Section_9_7(1122, 20000);
        // Calling the setAnnualInterestRate method of the object instance and setting argument to 4.5
        account.setAnnualInterestRate(4.5);

        // Withdraw $2.500 (from instance called account)
        account.withdraw(2500);
        // 20k - 2500 = 17500

        // Deposit $3.000 (from instance called account)
        account.deposit(3000);
        // 17500 + 3000 = 20500

        // Print balance, monthly interest, and date created
        System.out.printf("Balance: $%.2f%n", account.getBalance());
        System.out.printf("Monthly Interest: $%.2f%n", account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}
