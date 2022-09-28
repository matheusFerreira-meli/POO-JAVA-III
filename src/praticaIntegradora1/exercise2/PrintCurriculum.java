package praticaIntegradora1.exercise2;

public class PrintCurriculum extends PrintDocument{
    @Override
    public void printOut(Document document) {
        System.out.println("printando curriculo: " + document);
    }
}
