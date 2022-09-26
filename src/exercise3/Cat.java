package exercise3;

import exercise3.interfaces.ICarnivorousAnimal;

public class Cat extends Animal implements ICarnivorousAnimal {
    @Override
    public String emitSound() {
        return "Miau !!";
    }

    @Override
    public String eatMeat() {
        return "Comendo carne";
    }
}
