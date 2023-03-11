package Tack_4;

public class Cat extends Animal {
    Cat(String animalTure, String name) {
        super(animalTure, name);
    }

    @Override
    void makeNoise() {
        System.out.println("Мяукает" + "Мурлычет");
    }

    @Override
    void eat() {
        System.out.println("Кушает: корм, молоко, мясо");
    }

    @Override
    void getDescription() {
        System.out.println("Кот здоров, сыт и весел");
    }
}
