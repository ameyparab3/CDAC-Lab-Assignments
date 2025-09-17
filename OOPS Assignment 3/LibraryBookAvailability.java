class Book{
    private int copiesAvailable;
    void addCopies(int n){
        this.copiesAvailable=this.copiesAvailable+n;
    }
    void removeCopies(int n){
        this.copiesAvailable=this.copiesAvailable-n;
    }
    int getCopiesAvailable(){
        return this.copiesAvailable;
    }
}

class LibraryBookAvailability {
    public static void main(String[] args) {
        Book e1 = new Book();
        Book e2 = new Book();
        e1.addCopies(3);
        e1.removeCopies(1);
        System.out.println("Copies available: "+e1.getCopiesAvailable());
    }
}
