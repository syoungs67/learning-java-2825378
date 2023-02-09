import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 15;
        double gpa = 3.45;
        boolean perfectAttendance = true;
        String fName = "Indiana";
        String lName = "Jones";

        System.out.println(age);
        System.out.println(gpa);
        System.out.println(perfectAttendance);
        System.out.println(fName + ' ' + lName + " has a GPA of " + gpa);

        Scanner input = new Scanner(System.in);
        gpa = input.nextDouble();
        input.close();

        System.out.println(fName + ' ' + lName + " has a GPA of " + gpa);
    }
}
