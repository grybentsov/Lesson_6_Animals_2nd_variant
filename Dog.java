package ru.geekbrains.lesson_6;

public class Dog extends Animal{

    // Пусть собака может бегать от 200 до 500 метров включительно
    // может прыгать от 0,1 до 0,5 м включительно, плавать от 5 до 10 вкл.
    public Dog (String name){
        super(name);
        this.jumpHeight = (float) (0.1 + Math.random() * (0.5 - 0.1 + 1));
        this.runDistance = (int) (200 + Math.random() * (500 - 200 + 1));
        this.swimDistance = (int) (5 + Math.random() * (10 - 5 + 1));
    }
    @Override
    public void run (int runDistance){
        System.out.println(name + " ran " + this.runDistance + " meters.");
    }
    @Override
    public void jump (int jumpHeight){
        System.out.println(name + " jumped " + this.jumpHeight + " meters high.");
    }
    @Override
    public void swim (float swimDistance){
        System.out.println(name + " swam " + this.swimDistance + " meters.");
    }
}
