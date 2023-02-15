import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRepeating = true;
        while(isRepeating) {
            System.out.println("Playing");
            System.out.println("Take off repeat? (y/n)");
            String next = scanner.next();

            if(next.equals("y")) {
                isRepeating = false;
            }
        }
        scanner.close();
    }
}
