package sort;

import java.util.Scanner;

public class bubble_sort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        bubble_sort sort = new bubble_sort();
        int size = scan.nextInt();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = scan.nextInt();
        }
        sort.bubbleSort(data);

        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }


    }

    public void bubbleSort(int[] arr) {
            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j - 1] > arr[j]) {
                        //swap elements
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }

                }
        }




    }
}


