package ru.kpfu.itis.tasks.task_I;
/**
 * Task I. Create 3 classes with inheritance in this package.
 * At least one of classes must contain at least 5 fields with getters-setters.
*/

public class Task_I {
    public static void main(String[] Args){
        Cat cat = new Cat(4, 2, 2, "hair", true, "black");
        System.out.println(cat.getTexture());
    }
}
