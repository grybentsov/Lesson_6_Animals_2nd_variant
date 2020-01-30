package ru.geekbrains.lesson_6;

public class Bird extends Animal {

    // Пусть птица может бегать от 1 до 5 метров включительно
    // прыгает от 0,01 до 0,2 м включительно
    public Bird (String name){
        super(name);
        this.jumpHeight = (float) (0.01 + Math.random() * (0.2 - 0.01 + 1));
        this.runDistance = (int) (1 + Math.random() * (5 - 1 + 1));
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
        System.out.println(name + " cannot swim.");
    }
}
