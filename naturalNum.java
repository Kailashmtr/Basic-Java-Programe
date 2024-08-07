import java.util.Scanner;

class naturalNum {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Any number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " ");
        }
    }
}
