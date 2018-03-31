package Archive.src.ThePrintEdition;

public class Book extends PrintedEdition {
    String type = "Книга";
    String tittle;
    String assignment = "Развлечеие, культурное обогащение, изучение языков, истории и любой другой области...";
    String ListOfAuthors;

    public Book(String type, String tittle, String assignment, String listOfAuthors) {
        super(type, tittle, assignment);
        this.type = type;
        this.ListOfAuthors = listOfAuthors;
        this.tittle = tittle;
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

    public String getListOfAuthors() {
        return ListOfAuthors;
    }
}