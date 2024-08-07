import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int n;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter Array Element");
        for (int i = 0; i <= 5; i++) {
            arr[i] = ref.nextInt();
        }
        System.out.println(" Array Element");
        for (int i = 0; i <= 5; i++) {
            System.out.println(arr[i] + " ");
        }
        n = ref.nextInt();
        if (arr[i] == n) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Does Not Found");
        }
    }
}
