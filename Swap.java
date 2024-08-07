import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a, b, tem;
        System.out.println("Enter any two number");
        Scanner ref = new Scanner(System.in);
        a = ref.nextInt();
        b = ref.nextInt();
        tem = a;
        a = b;
        b = tem;
        System.out.println("After Swapiing");
        System.out.println(a + " " + b);
    }
}
