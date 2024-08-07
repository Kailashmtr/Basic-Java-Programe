import java.util.Scanner;

class naturalSum {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(" " + sum);
    }
}
