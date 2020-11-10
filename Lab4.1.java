import java.util.*;

class Icecream{
    
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    void seticecreamType(String icecreamType){
    
    this.icecreamType = icecreamType;
    }
    String geticecreamType(){
     return icecreamType;
    }
    void seticecreamCompany(String icecreamCompany){
    
    this.icecreamCompany = icecreamCompany;
    }
    String geticecreamCompany(){
    return icecreamCompany;
    }
    void seticecreamPrice(double icecreamPrice){
    
    this.icecreamPrice = icecreamPrice;
    }
    double geticecreamPrice(){
        
    return icecreamPrice;
    }
    public void icecream(){
        System.out.println("Type: "+geticecreamType()+"\n"+"Company: "+geticecreamCompany()+"\n"+"Price: "+geticecreamPrice()+"\n");
    }
    public void icecream(String icecreamType,String icecreamCompany,double icecreamPrice){
        System.out.println("Type: "+icecreamType+"\n"+"Company: "+icecreamCompany+"\n"+"Price: "+icecreamPrice+"\n");
    }
    public boolean equal(Icecream I){
        if( this.icecreamPrice == I.icecreamPrice ){
            return true;
        }
        else return false;
    }
    public int compareTo(Icecream I){
        if( this.icecreamPrice > I.icecreamPrice ){
            return 1;
        }
        else return 0;
    }
}

class main{
    
    public static void main(String args[]){
        System.out.println("How many Icecream:");
        Scanner sc = new Scanner(System.in);
        int numIce = sc.nextInt();
        sc.nextLine();
        Icecream[] IcecreamArray = new Icecream[numIce];
        for( int i = 0 ; i < numIce ; i++ ){
        System.out.println((i+1) + "st Ice cream Detail");
        IcecreamArray[i] = new Icecream();
        System.out.printf("Type: ");
        if(i > 0){sc.nextLine();} 
        IcecreamArray[i].seticecreamType(sc.nextLine());
        System.out.printf("Company: ");
        IcecreamArray[i].seticecreamCompany(sc.nextLine());
        System.out.printf("Price: ");
        IcecreamArray[i].seticecreamPrice(sc.nextDouble());
        }
        System.out.println(numIce+" Ice cream Detail Save Successfully....\n");
        System.out.println("Press 1 to check equal\nPress 2 to compare\npress 3 for detail of a Icecream");
        int option = sc.nextInt();
        if( option == 1 ){
          System.out.printf("Select a company\n");
          for( int i = 0 ; i < numIce ; i++ ){
              System.out.println( i+1 +" "+ IcecreamArray[i].geticecreamCompany());
          }
            int optioncom = sc.nextInt();
                optioncom--;
          System.out.printf("Select another company to check equal\n");
          for( int i = 0 ; i < numIce ; i++ ){
              System.out.println( i+1 +" "+ IcecreamArray[i].geticecreamCompany());
          }
            int optioncom1 = sc.nextInt();
                optioncom1--;
            if(IcecreamArray[optioncom].equal(IcecreamArray[optioncom1]) == true){
                System.out.println(IcecreamArray[optioncom].geticecreamCompany()+" price is equal to "+ IcecreamArray[optioncom1].geticecreamCompany());
            }
            else{
                System.out.println(IcecreamArray[optioncom].geticecreamCompany()+" price is not equal to "+ IcecreamArray[optioncom1].geticecreamCompany());
            }
            
        }
        else if( option == 2 ){
          System.out.printf("Select a company\n");
          for( int i = 0 ; i < numIce ; i++ ){
              System.out.println( i+1 +" "+ IcecreamArray[i].geticecreamCompany());
          }
            int optioncom = sc.nextInt();
                optioncom--;
          System.out.printf("Select another company to compare\n");
          for( int i = 0 ; i < numIce ; i++ ){
              System.out.println( i+1 +" "+ IcecreamArray[i].geticecreamCompany());
          }
            int optioncom1 = sc.nextInt();
                optioncom1--;
            if(IcecreamArray[optioncom].compareTo(IcecreamArray[optioncom1]) == 1){
                System.out.println(IcecreamArray[optioncom].geticecreamCompany()+" price is higher than "+ IcecreamArray[optioncom1].geticecreamCompany());
            }
            else{
                System.out.println(IcecreamArray[optioncom].geticecreamCompany()+" price is less than "+ IcecreamArray[optioncom1].geticecreamCompany());
            }
        }
        
        else if ( option == 3 ){
            System.out.printf("Select a company to check details\n");
          for( int i = 0 ; i < numIce ; i++ ){
              System.out.println( i+1 +" "+ IcecreamArray[i].geticecreamCompany());
          }
            int optioncom = sc.nextInt();
                optioncom--;
             System.out.println("Type:"+IcecreamArray[optioncom].geticecreamType()+"\nCompany:"+IcecreamArray[optioncom].geticecreamCompany()+"\nPrice:"+IcecreamArray[optioncom].geticecreamPrice());
        }
   }
    
}
