package Tack_4;

public class Bear extends Animal {
    Bear(String animalType, String name) {
        super(animalType, name);
    }

    @Override
    void makeNoise() {
        System.out.println("Рычит");
    }

    @Override
    void eat() {
        System.out.println("Кушает: ягоды, мёд, рыбу");

    }

    @Override
    void getDescription() {
        System.out.println("Медведь - дикое животное, проживает в лесу");

    }
}
