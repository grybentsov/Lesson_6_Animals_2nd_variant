package ru.geekbrains.lesson_6;

public class Horse extends Animal{

    // Пусть лошадь может бегать от 500 до 1500 метров включительно
    // может прыгать от 1 до 3 м включительно, плавать от 50 до 100 вкл.
    public Horse (String name){
        super(name);
        this.jumpHeight = (float) (1 + Math.random() * (3 - 1 + 1));
        this.runDistance = (int) (500 + Math.random() * (1500 - 500 + 1));
        this.swimDistance = (int) (50 + Math.random() * (100 - 50 + 1));
    }
    @Override
    public void run (int runDistance){
        System.out.println(name + " ran " + this.runDistance + " meters.");
    }
    @Override
    public void jump (int jumpHeight){
        System.out.println(name + " jumped " + this.jumpHeight + " meters high.");
    }

    public void swim (float swimDistance){
        System.out.println(name + " swam " + this.swimDistance + " meters.");
    }
}
