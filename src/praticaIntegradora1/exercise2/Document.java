package praticaIntegradora1.exercise2;

public abstract class Document {
    String id;

    public Document(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id do documento: " + id;
    }
}
