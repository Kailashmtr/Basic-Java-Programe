import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        System.out.println("Enter Array Element");
        Scanner ref = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = ref.nextInt();
        }
        System.out.println("Array Element");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Copy Element of Array");
        for (int i = 0; i < 5; i++) {
            b[i] = a[i];
            System.out.println(b[i] + " ");
        }

    }
}
