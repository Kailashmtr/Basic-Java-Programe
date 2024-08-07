import java.util.Scanner;

public class ArmStronge {
    public static void main(String[] args) {
        int n, c, r, s = 0;
        System.out.println("Enter Any Number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        c = n;
        while (n > 0) {
            r = n % 10;
            s = (r * r * r) + s;
            n = n / 10;
        }
        if (s == c) {
            System.out.println("Armstronge Number");
        } else {
            System.out.println("Not a Armstronge Number");
        }
    }
}
