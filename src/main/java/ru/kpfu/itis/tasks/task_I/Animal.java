package ru.kpfu.itis.tasks.task_I;

public class Animal extends Entity{
    protected int legs;
    protected int ears;
    protected int eyes;
    protected String texture;
    protected boolean tail;

    public Animal(int legs, int ears, int eyes, 
        String texture, boolean tail){
        super(true);
        setLegs(legs);
        setEars(ears);
        setEyes(eyes);
        setTexture(texture);
        setTail(tail);
    }

    public void setLegs(int legs){
        if(legs >= 0){
            this.legs = legs;
        }
    }

    public int getLegs(){
        return legs;
    }

    public void setEars(int ears){
        if(ears >= 0){
            this.ears = ears;
        }
    }

    public int getEars(){
        return ears;
    }

    public void setEyes(int eyes){
        if(eyes >= 0){
            this.eyes = eyes;
        }
    }

    public int getEyes(){
        return eyes;
    }

    public void setTexture(String texture){
        if(texture.length() >= 2){
            this.texture = texture;
        }
    }

    public String getTexture(){
        return texture;
    }

    public void setTail(boolean tail){
        this.tail = tail;
    }

    public boolean getTail(){
        return tail;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return this.legs == animal.legs &&
            this.ears == animal.ears &&
            this.eyes == animal.eyes &&
            this.texture.equals(animal.texture) &&
            this.tail == animal.tail;
    }

    @Override
    public int hashCode(){
        int result = Objects.hash(legs, ears, eyes, tail);
        result = 31 * result * Objects.hashCode(texture);
        return result;
    }
}