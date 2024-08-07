import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {
        int ch;
        System.out.println("Enter Ay Choice");
        Scanner ref = new Scanner(System.in);
        ch = ref.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuenday");
                break;
            case 4:
                System.out.println("Wednesnday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Choice");
        }

    }
}
