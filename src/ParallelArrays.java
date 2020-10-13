
import java.util.Scanner;

public class ParallelArrays {

    public static void main(String[] args) {
        String student[]=new String[3];
        int marks[] = new int [3];
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < student.length; i++) {
            System.out.print("Enter name of student " + (i+1) + "> ");
            student[i] = s.nextLine();
            System.out.print("Enter mark of student " + (i+1) + "> ");
            marks[i] = s.nextInt();
            s.nextLine();
        }
        double avg = 0;
        for (int i = 0; i < student.length; i++) {
            System.out.format("%2os%d\n",student[i],marks[i]);
            avg += (double) marks[i];
        }
        avg/=3;
        System.out.println("----------------------");
        System.out.println("average = \t" + avg);
    }
    
}
