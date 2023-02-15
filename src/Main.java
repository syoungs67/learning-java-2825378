import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        //int inputtedNum = scanner.nextInt();
        String outString = "You";
        if (scanner.nextInt() < 5) {
            outString = String.join(" ", outString, "are a loser man");
            //outString = "Int less than 5";
        } else {
            outString = String.join(" ", outString, "win the big bucks");
        }
        System.out.println(outString);
        scanner.close();
    }
}
