import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> AccountList = new ArrayList<>();
        while (true) {
            System.out.println("Press (1) for creating a Checking Account");
            System.out.println("Press (2) for creating a Saving Account\n0 for Next");
            int option = sc.nextInt();
            if (option == 1) {
                CheckingAccount CA = new CheckingAccount();

                System.out.println("Enter Account ID:");
                CA.setId(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter Account Balance:");
                CA.setBalance(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter Account Annual Interest Rate(%):");
                CA.setAnnualInterestRate(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter Account Over Draft:");
                CA.setOverdraft(sc.nextDouble());
                sc.nextLine();
                AccountList.add(CA);
                System.out.println("Checking account created Successfully for ID:" + CA.getId() + " at " + CA.getDataCreated().getTime());

            } else if (option == 2) {
                //int id, double balance, double annualInterestRate
                SavingAccount SA = new SavingAccount();

                System.out.println("Enter Account ID:");
                SA.setId(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter Account Balance:");
                SA.setBalance(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter Account Annual Interest Rate(%):");
                SA.setAnnualInterestRate(sc.nextInt());
                sc.nextLine();
                System.out.println("Saving account created Successfully for ID:" + SA.getId() + " at " + SA.getDataCreated().getTime());
                System.out.println("Your card No:" + SA.getCardNo() + " Expire Date:" + SA.getExpireDate().getTime());
                AccountList.add(SA);
            } else if (option == 0)
                break;
        }
        while (true) {
            System.out.println("Press (1) for withdraw");
            System.out.println("Press (2) for deposit\n0 for next");
            int option = sc.nextInt();
            if (option == 1) {
                System.out.println("Account ID:");
                int Aid = sc.nextInt();
                for (Account account : AccountList) {
                    if (account.getId() == Aid) {
                        System.out.println("Withdraw Amount:");
                        if( account instanceof CheckingAccount ) {
                            double x = sc.nextDouble();
                            ((CheckingAccount) account).withdraw(x, ((CheckingAccount) account).getOverdraft());
                        }
                        else
                            account.withdraw(sc.nextDouble());
                    }
                }
            } else if (option == 2) {
                System.out.println("Account ID:");

                int Aid = sc.nextInt();
                for (Account account : AccountList) {
                    if (account.getId() == Aid) {
                        System.out.println("Deposit Amount :");
                        account.deposit(sc.nextDouble());
                    }
                }

            } else if (option == 0) {
                break;
            }
        }
            while(true){
                System.out.println("Press (1) for detail");
                System.out.println("Press (2) for exit");
                int option = sc.nextInt();
                if( option == 1 ){
                    System.out.println("Account ID:");
                    int Aid = sc.nextInt();
                    for (Account account : AccountList) {
                        if (account.getId() == Aid) {
                            System.out.println("Detail for account :" + Aid);
                            System.out.println("Balance :" + account.getBalance() + "$");
                            System.out.println("Account Created :" + account.getDataCreated().getTime());
                            System.out.println("Annually Interest Rate :" + account.getAnnualInterestRate() + "%");
                            System.out.println("Monthly Interest :" + account.getMonthlyInterestAmount() + "$");
                            if (account instanceof SavingAccount) {
                                System.out.println("Account Type : Saving");
                                System.out.println("Card No :" + ((SavingAccount) account).getCardNo());
                                System.out.println("Credit Card Balance : " + ((SavingAccount) account).getCreditBalance() + "$");
                                System.out.println("Expire Date :" + ((SavingAccount) account).getExpireDate().getTime());

                            } else {
                                System.out.println("Account Type : Checking");
                                System.out.println("Over Draft :" + ((CheckingAccount) account).getOverdraft()+"$");
                            }
                        }
                    }
                }
                else if( option == 2 ) break;
            }

        }
}
