public class Book {
    private String title;
    private String author;
    private String genre;
    private int totalPages;

    static int numBooks = 0;
    public Book(String title, String author, String genre, int totalPages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.totalPages = totalPages;

        numBooks++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPages=" + totalPages +
                '}';
    }
}
