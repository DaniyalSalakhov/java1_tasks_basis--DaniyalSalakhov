package ru.kpfu.itis.tasks.task_III;

public class App {
    public static void main(String[] args){
        int max = Integer.parseInt(args[0]);

        for(int i = 1; i <= max; i++){
            for(int k = 1; k <=max; k++){
                if(i * k / 10 == 0){
                   System.out.print(i * k + "  ");
                }
                else
                    System.out.print(i * k + " ");
            }
            System.out.println();
        }
    }
}
