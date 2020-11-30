import java.util.Calendar;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Calendar dataCreated = Calendar.getInstance();
    Account(){
    }

    public int getId(){
        return id;
    }
    public void setId( int id ){
        this.id = id;
    }

    public double getBalance(){ return balance;
    }
    public void setBalance( double balance ){
        this.balance = balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate( double annualInterestRate ){
        this.annualInterestRate = annualInterestRate;
    }

    public Calendar getDataCreated(){
        return dataCreated;
    }
    public void setDataCreated( Calendar calendar ){
        this.dataCreated = calendar;
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate/12;
    }

    public double getMonthlyInterestAmount(){
        return balance*getMonthlyInterestRate();
    }
    public void withdraw( double money ){
        if( money <= this.balance )
        this.balance = this.balance-money;
        else
            System.out.println("You don't have enough money to withdraw");
    }
    public void deposit( double money ){
        this.balance = this.balance+money;
    }
}
