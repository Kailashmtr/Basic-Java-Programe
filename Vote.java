
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Any age");
        Scanner ref = new Scanner(System.in);
        age = ref.nextInt();
        if (age >= 18) {
            System.out.println("You are aligivle for vote");
        } else {
            System.out.println("Not eligivle for vote");
        }
    }
}
