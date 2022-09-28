package praticaIntegradora1.exercise2;

public class PDF extends Document {
    String title;

    public PDF(String id, String title) {
        super(id);
        this.title = title;
    }

    public void printOut(PrintDocument printer) {
        printer.printOut(this);
    }

    @Override
    public String toString() {
        return "{ id: " + id + ", title: " + title + " }";
    }


}
