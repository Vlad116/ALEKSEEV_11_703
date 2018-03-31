package OOP.ThePrintEdition;

public class Tutorial extends Book {
    String type = "Книга";
    String tittle;
    String assignment = "Получение новых знаний";
    String ListOfAuthors;

    public Tutorial(String type, String tittle, String assignment, String listOfAuthors) {
        super(type, tittle, assignment, listOfAuthors);
    }

}
