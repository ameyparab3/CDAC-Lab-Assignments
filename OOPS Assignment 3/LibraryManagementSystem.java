
interface Notifiable {
    void sendNotification(String message);
}


abstract class LibraryMember {
    protected int memberId;
    protected String name;
    protected int borrowedBooks = 0;

    LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    abstract void borrowBook(int numberOfBooks);
}


class StudentMember extends LibraryMember implements Notifiable {

    StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowBook(int numberOfBooks) {
        if (numberOfBooks <= 3) {
            borrowedBooks = numberOfBooks;
            System.out.println("StudentMember " + name + " borrowed " + borrowedBooks + " books");
        } else {
            System.out.println("StudentMember " + name + " cannot borrow more than 3 books.");
        }
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}


class FacultyMember extends LibraryMember implements Notifiable {

    FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowBook(int numberOfBooks) {
        if (numberOfBooks <= 5) {
            borrowedBooks = numberOfBooks;
            System.out.println("FacultyMember " + name + " borrowed " + borrowedBooks + " books");
        } else {
            System.out.println("FacultyMember " + name + " cannot borrow more than 5 books.");
        }
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create members
        StudentMember student = new StudentMember(101, "Amit");
        FacultyMember faculty = new FacultyMember(201, "Prof. Singh");

        // Borrow books (no book details, just count)
        student.borrowBook(2);
        faculty.borrowBook(4);

        // Send notifications
        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}
