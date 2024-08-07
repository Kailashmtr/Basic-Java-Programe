import java.util.Scanner;

public class ArrayPlush {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        System.out.println("Enter Array Element");
        Scanner ref = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = ref.nextInt();
        }
        System.out.println("Array Element");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i] + " ");
            sum = a[i] + sum;
        }
        System.out.println("Addition Of Array Element" + " " + sum);

    }
}
