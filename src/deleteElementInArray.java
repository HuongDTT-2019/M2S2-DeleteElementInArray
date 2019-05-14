import java.util.Scanner;

public class deleteElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size;
        System.out.println("Enter the size of array:");
        size = input.nextInt();
        array = new int[size];
        insertValue(array);
        System.out.println("Array:");
        disPlayArray(array);
        int deleteValue;
        boolean isDelete = array.length >= 1;
        if (isDelete) {
            System.out.println("\nEnter the delete value:");
            deleteValue = input.nextInt();
            delValue(array, deleteValue);
            disPlayArray(array);
        }
    }

    public static void insertValue(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            array[i] = input.nextInt();
        }
    }

    public static void disPlayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void delValue(int[] array, int deleteValue) {
        int index;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == deleteValue) {
                for (index = i; index < array.length - 1; index++) {
                    array[index] = array[index + 1];
                }
                array[array.length - 1] = 0;
            }
        }
    }
}
