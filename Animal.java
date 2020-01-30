package ru.geekbrains.lesson_6;

public abstract class Animal {
    protected String name;
    protected float jumpHeight;
    protected int runDistance;
    protected int swimDistance;

    public Animal (String name){
        this.name = name;
    }
    public void run (int runDistance){
        System.out.println(name + " ran " + runDistance + " meters.");
    }
    public void jump (int jumpHeight){
        System.out.println(name + " jumped " + jumpHeight + " meters high.");
    }
    public abstract void swim (float swimDistance);
}
