import java.util.Scanner;

public class vowlCons {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter choice");
        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowle");
        } else {
            System.out.println("Consonant");
        }
    }
}
