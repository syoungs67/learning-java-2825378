import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String question = "Which of these ships did Roald Amundsen sail to the south pole ?";
        String w = "a: Gjoa";
        String x = "b: Fram";
        String y = "c: Ross";
        String z = "d: Maud";
        
        System.out.println(String.join("\n", question, w, x, y, z));
        
        if (scanner.next().equals("b")) {
            System.out.println("Correct!");
        } else {
            System.out.println("incorrect");
        }
        
    }
}
