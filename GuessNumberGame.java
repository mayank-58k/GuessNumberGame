
import java.util.*;
public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome");
        int gues = (int)(Math.random()*10);
        while (true) {
            System.out.print("Enter the Guess : ");
            int n = sc.nextInt();
            if (n==gues) {
                System.out.println("correct guess ! ");
                System.out.println("congrast ");
                break;
            } 
            else {
                System.out.println("Try Again ");
            }
        }
    }
}
