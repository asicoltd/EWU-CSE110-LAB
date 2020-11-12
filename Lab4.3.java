import java.util.*;
class Fraction{
    
    private int numerator;
    private int denominator;
    
    public void setnumerator(int numerator){
    this.numerator = numerator;
    }
    public int getnumerator(){
     return numerator;
    }
    
    public void setdenominator(int denominator){
    this.denominator = denominator;
    }
    public int getdenominator(){
     return denominator;
    }
    
    public void Fraction(int numerator, int denominator){
    }
    public void Fraction(){    
    }
    public String toString(){
        return numerator+"/"+denominator;
    }
    public void add( Fraction fraction){
    System.out.println(((this.numerator*fraction.denominator)+ (this.denominator*fraction.numerator))+"/"+(this.denominator*fraction.denominator));    
    }
    public void sub( Fraction fraction){
    System.out.println(((this.numerator*fraction.denominator)-(this.denominator*fraction.numerator))+"/"+(this.denominator*fraction.denominator));    
    }
    public void multi( Fraction fraction){
    System.out.println((this.numerator*fraction.numerator)+"/"+(this.denominator*fraction.denominator));    
    }
    public void div( Fraction fraction){
    System.out.println((this.numerator*fraction.denominator)+"/"+(this.denominator*fraction.numerator));    
    }
}

class main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Fraction[] FractionArray = new Fraction[2];
        y:while(true){
        for( int i = 0 ; i < 2 ; i++ ){
        System.out.println((i+1) + "st fraction Detail");
        FractionArray[i] = new Fraction();
        System.out.printf((i+1) + "st fraction Numerator: ");
        FractionArray[i].setnumerator(sc.nextInt());

        System.out.printf((i+1) + "st fraction Denominator: ");
        FractionArray[i].setdenominator(sc.nextInt());
        }
        x:while(true){
        System.out.println("Press 1 for addition\nPress 2 for subtraction\n");
        System.out.println("Press 3 for multiplication\nPress 4 for division\nPress 5 for data of a fraction\n");
        int option = sc.nextInt();
        
        if( option == 1 ){
          FractionArray[0].add(FractionArray[1]);
        }
        else if( option == 2 ){
          FractionArray[0].sub(FractionArray[1]);  
        }
        else if ( option == 3 ){
          FractionArray[0].multi(FractionArray[1]);
        }
        else if ( option == 4 ){
          FractionArray[0].div(FractionArray[1]);
        }
        else if ( option == 5 ){
          System.out.println("1st Fraction: "+FractionArray[0].toString());
          System.out.println("2nd Fraction: "+FractionArray[1].toString());
        }
        System.out.println("1 for return to option\n2 for new fractions\n3 for exit(0)");
        int option1 = sc.nextInt();
        if( option1 == 1 )
            continue x;
        else if( option1 == 2)
            continue y;
        else break;
        }
        break;
        }
    }
   }
