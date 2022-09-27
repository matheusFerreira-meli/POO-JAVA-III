package praticaIntegradora1.exercise3;

import praticaIntegradora1.exercise3.interfaces.ICarnivorousAnimal;

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
