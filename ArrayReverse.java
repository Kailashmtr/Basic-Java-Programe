import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Enter Array Element");
        Scanner ref = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = ref.nextInt();
        }
        System.out.println("Reverse Element Of Array");
        for (int i = 5 - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }

    }
}
