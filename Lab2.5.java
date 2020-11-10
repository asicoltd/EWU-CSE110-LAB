import java.util.*;

class main{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter center(X,Y) and radius:");
    Double Xc = sc.nextDouble();
    Double Yc = sc.nextDouble();
    Double rad = sc.nextDouble();
    System.out.println("Enter point(x,y) to check its position:");
    Double Xi = sc.nextDouble();
    Double Yi = sc.nextDouble();
    Double Distance = Math.sqrt((Xc-Xi)*(Xc-Xi)+(Yc-Yi)*(Yc-Yi));
    if ( rad > Distance ){
        System.out.println("Point is inside the circle");        
    }
    else if ( rad < Distance ){
        System.out.println("Point is outside the circle");        
    }
    else{
        System.out.println("Point is on the circle");
    }
  }
}
