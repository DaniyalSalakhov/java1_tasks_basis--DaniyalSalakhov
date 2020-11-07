package ru.kpfu.itis.tasks.task_IV;

public class App {
    public static void main(String[] args){
        int height = 15;
        int lastLength = findLength(height);
        int spacesBefore = lastLength / 2;

        print(spacesBefore, " ");
        System.out.println(" " + 1);
        spacesBefore = spacesBefore - 1;
        int[] array1 = {1, 1};
        int[] array2 = new int[array1.length + 1];

        for(int i = 1; i < height; i++){
            array2[0] = 0;
            for(int l = 0; l < array1.length; l++){
                array2[l + 1] = array1[l];
                array2[l] = array2[l] + array1[l];
            }
            print(spacesBefore, " ");
            spacesBefore--;
            for(int j = 0; j < array2.length; j++)
                System.out.print(array2[j]+ " ");
            System.out.println();
            array1 = array2;
            array2 = new int[array2.length + 1];
        }
    }

    public static int findLength(int height){
        int length = 1;
        if(height != 1){
            for(int i = 1; i < height; i++){
                length = length + 2;
            }
        }
        return length;
    }

    public static void print(int number, String symbol){
        for(int i = 0; i < number; i++){
            System.out.print(symbol);
        }
    }}
