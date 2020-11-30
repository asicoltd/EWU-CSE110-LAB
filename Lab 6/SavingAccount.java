import java.util.*;

public class SavingAccount extends Account {
    private String cardNo = "0";
    private Calendar expireDate = Calendar.getInstance() ;
    private double creditBalance = this.getBalance()*3;
    SavingAccount() {
        genCardNo();
    }
    public void genCardNo(){
        Random rand = new Random();
        for( int i = 0 ; i < 15 ; i++){
            this.cardNo += (char)(rand.nextInt(10)+48);
        }
        expireDate.add(Calendar.YEAR, 2);
    }

    public String getCardNo() {
        return cardNo;
    }
    public Calendar getExpireDate(){
        return expireDate;
    }

    public double getCreditBalance() {

        return creditBalance;
    }
}
