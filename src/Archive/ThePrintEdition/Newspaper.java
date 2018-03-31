package OOP.ThePrintEdition;

public class Newspaper extends PrintedEdition {
    String tittle;
    String assignment = "Позволяют узнать новости , либо прочитать какие-то отвлеченные статьи для развлечения";
    String type = "Газета";
    String sources;
    int date;

    public Newspaper(String type, String tittle, String assignment, String sources, int date) {
        super(type, tittle, assignment);
        this.tittle = tittle;
        this.sources = sources;
        this.date = date;
    }

    public boolean isLatestNews(int today) {
        if (today - date <= 3 && this.date <= today)
            return true;
        else
            return false;
    }

    public String getSources() {
        return sources;
    }

    public int getDate() {
        return date;
    }
}
