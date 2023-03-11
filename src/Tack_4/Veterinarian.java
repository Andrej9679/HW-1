package Tack_4;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.print("К доктору пришел: ");
        System.out.print(animal.getAnimalType());
        System.out.println(animal.getName());
        animal.getDescription();
    }
}
