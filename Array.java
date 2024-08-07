import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Enter Array Element");
        Scanner ref = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ref.nextInt();
        }
        System.out.println("Array Element");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
