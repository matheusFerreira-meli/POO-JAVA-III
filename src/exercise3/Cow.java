package exercise3;

import exercise3.interfaces.IHerbivorousAnimal;

public class Cow extends Animal implements IHerbivorousAnimal {
    @Override
    public String emitSound() {
        return "Muuuuuh !!";
    }

    @Override
    public String eatPasture() {
        return "Comendo pasto";
    }
}
