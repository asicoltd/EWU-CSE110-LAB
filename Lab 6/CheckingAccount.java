
public class CheckingAccount extends Account {
    private double overdraft;

    CheckingAccount(){

    }
    public double getOverdraft(){
        return overdraft;
    }
    public void setOverdraft( double overdraft){
        this.overdraft = overdraft;
    }
    public void withdraw( double money, double overdraft){
        if( money >= overdraft )
        setBalance(money);
        else
            System.out.println("Withdraw doesn't satisfy overdraft");
    }
}
