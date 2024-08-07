import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int a, b, sum;
        System.out.println("Enter Two Numbers");
        Scanner ref = new Scanner(System.in);
        a = ref.nextInt();
        b = ref.nextInt();
        sum = a + b;
        System.out.println("sum of two numbers" + " " + sum);
    }
}
