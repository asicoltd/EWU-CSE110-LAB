import java.util.*;
class Dcoder{
    static void isdistrict(int[] num){
      for( int i = 0 ; i < 10 ; i++ ){
          for( int j = i+1 ; j < 10 ; j++ ){
              if( num[i] == num[j] ){
                  num[j] = -1;
              }
          }
      }
    }
    public static void main(String args[]){  
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number:");
      String Num = sc.nextLine();
      int num[] = new int[10];
      for( int i = 0 ; i < 10 ; i++ ){
        num[i] = Num.charAt(i)-48;
      }
        isdistrict(num);
      for( int i = 0 ; i < 10 ; i++ ){
          if( num[i] != -1 )
        System.out.printf("%d ",num[i]);
      }  
  }
}
