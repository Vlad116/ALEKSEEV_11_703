package Archive.src.ThePrintEdition;

public class Detective extends Book {
    String type = "Детектив";
    String tittle;
    String assignment = "Развлечение";
    String ListOfAuthors;

    public Detective(String type, String tittle, String assignment, String listOfAuthors) {
        super(type, tittle, assignment, listOfAuthors);
    }
}
