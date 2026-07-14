import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {

             System.out.print("Enter name of student " + (i + 1) + ": ");
             names[i] = sc.next();

             System.out.print("Enter marks of " + names[i] + ": ");
             marks[i] = sc.nextInt();
         }

         int total = 0;
         int highest = marks[0];
         int lowest = marks[0];

         for (int i = 0; i < n; i++) {

             total = total + marks[i];

             if (marks[i] > highest) {
             highest = marks[i];
             }

             if (marks[i] < lowest) {
             lowest = marks[i];
             }
        }

        double average = (double) total / n;
        System.out.println("\n===== STUDENT REPORT =====");

        System.out.printf("%-20s %-10s%n", "Student Name", "Marks");

        for (int i = 0; i < n; i++) {
         System.out.printf("%-20s %-10d%n", names[i], marks[i]);
        }

        System.out.println("\n===== SUMMARY =====");

        System.out.printf("Average Marks : %.2f%n", average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();

    }
}