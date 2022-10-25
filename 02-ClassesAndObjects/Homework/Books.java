
public class Books
                                                                                                                               {
    
    // Class attributes
    String name;
    int publication;
    String author;
    int numberOfPages;
    boolean isCoverHard;
    
    // Class methods
    public void displayName() {
        System.out.println("Book's name is " + name + ".");
    }
    
    public void displayAge() {
        System.out.println("Book was published in " + publication + ".");
    }

    public void displaySemesterNumber() {
        System.out.println("Book has " + numberOfPages + " pages.");
    }
    
    public void displayAverageGrade() {
        System.out.println("Book's author is " + author + ".");
    }
}

