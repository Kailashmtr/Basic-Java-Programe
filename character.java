import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        char ch;
        System.err.println("Enter any charcter");
        Scanner ref = new Scanner(System.in);
        ch = ref.next().charAt(0);
        System.out.println(ch);
    }
}
