import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size, temp;

        System.out.print("Please, enter how many numbers you want to enter: ");
        size = scan.nextInt();

        int[] arr1 = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Please, enter the value for number " + (i + 1) + ": ");
            arr1[i] = scan.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted numbers:");
        for (int num : arr1) {
            System.out.println(num);
        }
    }
}
