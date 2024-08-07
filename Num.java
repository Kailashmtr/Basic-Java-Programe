import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter Any three Number");
        Scanner ref = new Scanner(System.in);
        a = ref.nextInt();
        b = ref.nextInt();
        c = ref.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }

        }
    }
}
