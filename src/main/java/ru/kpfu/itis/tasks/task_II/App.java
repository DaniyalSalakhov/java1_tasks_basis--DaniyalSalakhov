package ru.kpfu.itis.tasks.task_II;
import java.util.Random;

public class App {
    public static void main(String[] Args){
        int n = Integer.parseInt(Args[0]);
        if(n < 1)
            System.out.println("Error: your array number is too small");
        int a = Integer.parseInt(Args[1]);
        int b = Integer.parseInt(Args[2]);
        if(a > b)
            System.out.println("Error: your \'a\' number is bigger than \'b\' number");

        int[] arr = new int[n];

        int min = b;
        int max = a;
        double sum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = a + (int) (Math.random() * b);
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
            sum = sum + arr[i];
        }

        System.out.println(min);
        System.out.println(max);
        System.out.format("%.2f", sum / n);
        System.out.println();
    }
}
