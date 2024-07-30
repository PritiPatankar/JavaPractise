public class LibraryBook {
    private String bookTitle;
    private String bookAuthor;
    private int publishYear;
    private boolean isAvailable=true;
 
    public String getBookTitle() {
        return bookTitle;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public int getPublishYear() {
        return publishYear;
    }
    public boolean checkAvailability(){
        return isAvailable;
    }
 
    public void returnBook(){
        isAvailable=true;
    }
   
    public void borrowBook(){
         isAvailable=false;
    }
 
}