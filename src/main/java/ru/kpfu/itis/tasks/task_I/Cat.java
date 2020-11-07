package ru.kpfu.itis.tasks.task_I;

public class Cat extends Animal{
    protected String color;

    public Cat(int legs, int ears, int eyes, 
        String texture, boolean tail, String color){
        super(legs, ears, eyes, texture, tail);
        setColor(color);
    }

    public void setColor(String color){
        if(color.length() >= 3){
            this.color = color;
        }
    }

    public String getColor(){
        return color;
    }
}