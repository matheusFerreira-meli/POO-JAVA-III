package praticaIntegradora1.exercise2;

public class PrintPDF extends PrintDocument {
    @Override
    public void printOut(Document document) {
        System.out.println("printando pdf: " + document);
    }
}
