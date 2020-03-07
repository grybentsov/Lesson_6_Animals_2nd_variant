package ru.geekbrains.lesson_6;

public class Cat extends Animal{

    // Пусть кот может бегать от 100 до 200 метров включительно
    // прыгает от 0,2 до 2 м включительно
    public Cat (String name){
        super(name);
        this.jumpHeight = (float) (0.2 + Math.random() * (2.0 - 0.2 + 1));
        this.runDistance = (int) (100 + Math.random() * (200 - 100 + 1));
    }
    @Override
    public void run(int runDistance){
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
