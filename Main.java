package ru.geekbrains.lesson_6;

public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat ("Matroskin");
	Dog dog = new Dog ("Sharik");
	Horse horse = new Horse("Marusya");
	Bird bird = new Bird ("Alloisiy");

	Animal [] zoo = {cat, dog, horse, bird};
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].run(1);
            zoo[i].jump(2);
            zoo[i].swim(3);
        }
    }
}
