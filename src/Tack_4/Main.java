package Tack_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Кот", "Барсик");
        Animal dog = new Dog("Пёс ", "Арчи");
        Animal bear = new Bear("Мишка ", "Косолапый");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(bear);

        Veterinarian vet = new Veterinarian();

        for (int i = 0; i < animalList.size(); i++) {
            System.out.print(i + 1 + " ");
            vet.treatAnimal(animalList.get(i));
            System.out.println();
        }

        for (int z = 0; z < animalList.size(); z++) {
            System.out.print(animalList.get(z).getAnimalType());
            System.out.print(animalList.get(z).getName() + " ");
            animalList.get(z).makeNoise();
            animalList.get(z).eat();
            System.out.println();

        }
    }
}

