package ru.kpfu.itis.tasks.task_V;

public class App {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(calculateFibNum(n));
    }

    public static int calculateFibNum(int n){
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        return calculateFibNum(n - 1) + calculateFibNum(n - 2);
    }

}
