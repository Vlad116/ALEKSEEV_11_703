package Archive.src.ThePrintEdition;

public class Magazine extends PrintedEdition {
    String date;
    int number;
    String assigment = "В зависимости от направленности журнала, например полезные советы в быту...";
    String type = "Журнал";
    String tittle;

    public Magazine(String type, String tittle, String assignment, String date, int number) {
        super(type, tittle, assignment);
        this.tittle = tittle;
        this.date = date;
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }

    public String getAssigment() {
        return assigment;
    }

    public void setAssigment(String assigment) {
        this.assigment = assigment;
    }

}
