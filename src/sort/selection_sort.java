package sort;

import java.util.Scanner;

public class selection_sort {

    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        selection_sort sort = new selection_sort();
        int size = scan.nextInt();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = scan.nextInt();
        }
        sort.selectionSort(data);

        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
            System.out.println("으앵");
        }
    }
}
