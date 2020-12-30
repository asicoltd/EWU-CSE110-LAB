import java.util.*;
class Calculator{
    private int value1;
    private int value2;
    Calculator(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public void Add(){
        if(value1 >= 0 && value2 >= 0){
            System.out.println(value1+value2);
      }
      else {
         throw new ArithmeticException("values can't be negative for addition"); 
      }
    }
    public void Subtract(){
        if(value1 >= 0 && value2 >= 0){
            System.out.println(value1-value2);
      }
      else {
         throw new ArithmeticException("values can't be negative for Subtraction"); 
      }
    }
    public void multiply(){
        if(value1 != 0 && value2 != 0){
            System.out.println(value1*value2);
      }
      else {
         throw new ArithmeticException("values can't be zero for multiplication"); 
      }
    }
    public void Division(){
        if(value1 != 0 && value2 != 0){
            System.out.println(value1/value2);
      }
      else {
         throw new ArithmeticException("values can't be zero for Division"); 
      }
    }
}
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Values for Addition:");
        Calculator obj1 = new Calculator(sc.nextInt(),sc.nextInt());
        obj1.Add();
        System.out.println("Values for Subtraction:");
        Calculator obj2 = new Calculator(sc.nextInt(),sc.nextInt());
        obj2.Subtract();
        System.out.println("Values for Multiplication:");
        Calculator obj3 = new Calculator(sc.nextInt(),sc.nextInt());
        obj3.multiply();
        System.out.println("Values for Division:");
        Calculator obj4 = new Calculator(sc.nextInt(),sc.nextInt());
        obj4.Division();
    }
}
