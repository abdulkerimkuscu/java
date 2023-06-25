package BookSorter;

public class Book implements Comparable<Book>{
    private String bookName;
    private int totalPage;
    private String authorName;
    private int publishDate;

    public Book(String bookName, int totalPage, String authorName, int publishDate){
        this.bookName = bookName;
        this.totalPage = totalPage;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }
    @Override
    public int compareTo(Book o) {
        return this.getBookName().compareTo(o.getBookName());
    }
    @Override
    public String toString() {
        return this.bookName.toUpperCase() +
                ", " + this.authorName +
                " (" + this.publishDate +
                "), Page Count: " + this.totalPage;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
}
