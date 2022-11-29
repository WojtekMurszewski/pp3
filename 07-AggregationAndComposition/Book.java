public class Book {

    private Autor autor;
    private String title;
    private int numberOfPages;
    private boolean cover;
    private int page;

    public void setAutor(Autor a) {
        this.autor = a;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isCover() {
        return cover;
    }

    public void setCover(boolean cover) {
        this.cover = cover;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Book(String title, int numberOfPages, boolean cover, int page) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.cover = cover;
        this.page = page;
        autor = new Autor("Robert","Maklowcz",55);
    }

    public static void main(String[] args) {
        // Autor a1 = new Autor("Robert","Maklowcz",55);
        Book b1 = new Book();
        // b1.setAutor(a1);
    }
}
