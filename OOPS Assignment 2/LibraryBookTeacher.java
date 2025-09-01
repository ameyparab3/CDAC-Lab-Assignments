class Book{
    String title, author;
    boolean issued;
    static int totalIssuedBooks;

    Book(String title, String author, boolean issued){
        this.title = title;
        this.author = author;
        this.issued = issued;
        if(issued==true){
            totalIssuedBooks++;
        }
    }

    boolean issue(){
        return issued;
    } 

    static void showTotalIssued(){
        System.out.println("Total books issued: "+totalIssuedBooks);
    }

}

public class LibraryBookTeacher {
    public static void main(String argz[]){
        Book b1 = new Book("Harry Potter", "J.K. Rowling", true);
        Book b2 = new Book("Five Point Someone", "JChetan Bhagat", false);
        Book b3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);
        System.out.println(b1.title+" is issued? "+b1.issue());
        System.out.println(b2.title+" is issued? "+b2.issue());
        System.out.println(b3.title+" is issued? "+b3.issue());
    }
}
