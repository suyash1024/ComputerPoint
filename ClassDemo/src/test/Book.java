
package test;

public class Book 
{
    private Integer bookId;
    private String bookName;
    private Float bookPrice;

    public Book() {
    }

    public Book(Integer bookId, String bookName, Float bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public Float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    @Override //Annotation
    public String toString()
    {
        return this.bookId+"-->"+this.bookName;
    }
    public boolean equals(Object obj)
    {
       
        Book other=(Book)obj;
       
        return other.getBookId().equals(this.getBookId());
    }
}
