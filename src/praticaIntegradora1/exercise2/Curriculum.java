package praticaIntegradora1.exercise2;

public class Curriculum extends Document{
    String title;

    public Curriculum(String id, String title) {
        super(id);
        this.title = title;
    }

    public void printOut(PrintDocument printer) {
        printer.printOut(this);
    }

    public String toString() {
        return "{ id: " + id + ", title: " + title + " }";
    }

}
