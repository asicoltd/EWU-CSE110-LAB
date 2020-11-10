import java.util.*;

class Dcoder
{  
  public static void main(String args[])
  {  
    System.out.println("Enter Exchange rate from USD to BDT");
      Scanner sc = new Scanner(System.in);
  
  double Rate = sc.nextDouble();
  System.out.printf("To convert enter :\n1.USD to BDT\n2.BDT to USD\n");
  int option = sc.nextInt();
  if( option == 1 ){
      System.out.println("Enter USD value:");
      double cash = sc.nextDouble();
      System.out.println("BDT value:" + cash*Rate);
  }
  else{
      System.out.println("Enter BDT value:");
      double cash = sc.nextDouble();
      System.out.println("USD value:" + cash/Rate);
  }
  }
}
