public class Book {

    private String title;
    private String author;
    private GenreType genre;

    public Book(String title, String author, GenreType genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public GenreType getGenre() {
        return this.genre;
    }
}
