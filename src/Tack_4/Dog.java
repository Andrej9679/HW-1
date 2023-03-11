package Tack_4;

public class Dog extends Animal {
    Dog(String animalTure, String name) {
        super(animalTure, name);
    }

    @Override
    void makeNoise() {
        System.out.println("Рычит, лает");
    }

    @Override
    void eat() {
        System.out.println("Кушает: мясо, корм, кости");
    }

    @Override
    void getDescription() {
        System.out.println("Пёс сытый и довольный");

    }
}
