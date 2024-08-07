import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int a, b, c, d, e, total;
        System.out.println("Enter Marks");
        Scanner ref = new Scanner(System.in);
        a = ref.nextInt();
        b = ref.nextInt();
        c = ref.nextInt();
        d = ref.nextInt();
        e = ref.nextInt();
        total = a + b + c + d + e;
        System.out.println("result" + " " + total);
        double avr = (a + b + c + d + e) / 5.0;
        System.out.println("Result" + " " + avr);
    }
}
