public class Main {
    public static void main(String[] args) {
        int age = 15;
        double gpa = 3.45;
        boolean perfectAttendance = true;
        String fName = "Indiana";
        String lName = "Jones";

        System.out.println(age);
        System.out.println(gpa);
        System.out.println(fName.charAt(0));
        System.out.println(lName.charAt(0));
        System.out.println(perfectAttendance);
        System.out.println(String.join(" ", fName, lName));
    }
}
