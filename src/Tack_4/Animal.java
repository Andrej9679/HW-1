package Tack_4;

public abstract class Animal {
    protected String animalTure;
    protected String name;

    Animal(String animalTure, String name) {
        this.name = name;
        this.animalTure = animalTure;

    }

    public String getAnimalTure() {
        return getAnimalTure();

    }

    public void setAnimalTure(String animalTure) {
        this.animalTure = animalTure;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void makeNoise() {

    }

    void eat() {

    }

    void getDescription() {

    }

    public char getAnimalType() {
        return 0;
    }

}


