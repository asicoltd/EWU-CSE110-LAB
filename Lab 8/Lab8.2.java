import java.lang.Exception;
import java.util.Scanner;
public class product {
    public static int productCheck(int weight) throws MyException {
        if (weight >= 100) {
            return weight;
        } else {
            throw new MyException("Product is invalid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        try {
            System.out.println(productCheck(weight));
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
public class MyException extends Exception{
        public MyException(String message) {
            super(message);
        }
    }


