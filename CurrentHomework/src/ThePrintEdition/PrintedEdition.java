package ThePrintEdition;

public abstract class PrintedEdition {
    String type = "";
    String tittle = "";
    String assignment = "";

    public PrintedEdition(String type, String tittle, String assignment) {//зачем вам в абстрактном классе конструктор?
        this.type = type;
        this.tittle = tittle;
        this.assignment = assignment;
    }

    public String getType() {
        return type;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAssignment() {
        return assignment;
    }
}

