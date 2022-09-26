package exercise3;

public abstract class Animal {
    public abstract String emitSound();

    public String eatAnimal(Animal animal) {
        return "comendo o animal " + animal;
    }

}
