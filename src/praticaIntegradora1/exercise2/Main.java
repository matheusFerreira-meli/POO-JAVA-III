package praticaIntegradora1.exercise2;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------imprimindo PDF------------");
        PDF pdf = new PDF("01", "Pdf teste");
        PrintPDF printPDF = new PrintPDF();
        pdf.printOut(printPDF);

        System.out.println("----------imprimindo currículo------------");
        Curriculum curriculum = new Curriculum("01", "curriculo teste");
        PrintCurriculum printCurriculum = new PrintCurriculum();
        curriculum.printOut(printCurriculum);
    }
}
