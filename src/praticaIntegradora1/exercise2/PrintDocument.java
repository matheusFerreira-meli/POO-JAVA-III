package praticaIntegradora1.exercise2;

import praticaIntegradora1.exercise2.interfaces.IPrinter;

public abstract class PrintDocument implements IPrinter {
    @Override
    public void printOut(Document document) {
        System.out.println(document);
    }
}
