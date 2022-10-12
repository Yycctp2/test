package sort;

import java.util.Scanner;

public class ShellSort {

    public void shellSort(int[] data){
        int n = data.length;
        for(int h =  n/ 2; h >0;  h/=2){
            System.out.println(h);
            for (int i = h; i <n ; i++) {
                int j;
                int tmp = data[i];
                for(j=i-h; j >= 0 && data[j] > tmp; j-=h){
                    data[j+h] = data[j];
                }
                data[j+h] = tmp;
            }
        }
    }


    public static void main(String[] args) {
        ShellSort sort = new ShellSort();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = scan.nextInt();
        }

        sort.shellSort(data);

        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }
}
