package praticaIntegradora1.exercise3;

public class Main {
    public static void main(String[] args) {
        Cat bichano = new Cat();
        Dog neguinha = new Dog();
        Cow mumu = new Cow();

        System.out.println(neguinha.eatAnimal(mumu));
        System.out.println(bichano.eatMeat());
        System.out.println(mumu.eatPasture());
    }
}
