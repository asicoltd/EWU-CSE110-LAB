import java.util.*;

public class Main {

    public static void Grade(int best, int num, int i) {
        char grade = 'A';
        if (num >= best - 10) {
            grade = 'A';
        } else if (best - 10 > num && num >= best - 20) {
            grade = 'B';
        } else if (best - 20 > num && num >= best - 30) {
            grade = 'C';
        } else if (best - 30 > num && num >= best - 40) {
            grade = 'D';
        } else if (best - 40 > num) {
            grade = 'F';
        }
        System.out.println("student " + i + " score is " + num + " and grde is4 " + grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int student;
        int score[];
        int best = 0;
        System.out.println("enter the num of student");
        student = input.nextInt();
        score = new int[student];
        System.out.printf("Enter %d scores\n", student);
        for (int i = 0; i < student; i++) {
            score[i] = input.nextInt();
            if (score[i] > best) {
                best = score[i];
            }
        }
            int num;
            for (int i = 0; i < student; i++) {
                num = score[i];
                Grade(best, num, i);
            }

        
    }
}
