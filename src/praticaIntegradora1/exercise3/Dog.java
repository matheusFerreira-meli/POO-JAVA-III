package praticaIntegradora1.exercise3;

import praticaIntegradora1.exercise3.interfaces.ICarnivorousAnimal;

public class Dog extends Animal implements ICarnivorousAnimal {
    @Override
    public String emitSound() {
        return "Au au !!";
    }

    @Override
    public String eatMeat() {
        return "Comendo carne";
    }
}
