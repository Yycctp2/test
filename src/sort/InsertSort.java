package sort;

import java.util.Scanner;

public class InsertSort {

    public void insertion_sort(int[] data) {
        int size = data.length;
        int temp;
        for (int i = 1; i < size; i++) {
            temp = data[i];
            int j;
            for (j = i; j > 0 && data[j-1] >= temp ; j--) {
                data[j] = data[j-1];
            }
            data[j] = temp;
        }

    }

    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = scan.nextInt();
        }

        sort.insertion_sort(data);

        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }
}