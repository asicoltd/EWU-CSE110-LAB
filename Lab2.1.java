import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
      System.out.println ("Enter Number:");
      int Number = input.nextInt ();
      if( Number % 2 == 0 && Number % 3 == 0){
          System.out.printf ("False\n");
      }
      else if( Number % 2 != 0 && Number % 3 != 0 ){
          System.out.printf ("False\n");
      }
      else System.out.printf ("True\n");
	}
}

