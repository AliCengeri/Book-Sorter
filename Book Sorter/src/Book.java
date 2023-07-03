import java.util.Comparator;
import java.util.Date;

public class Book implements Comparable<Book>{
    @Override
    public int compareTo(Book a) {
        return this.getName().compareTo(a.getName());
    }

    String name;
    int pageNum;
    String author;
    String date;

    public Book(String name, int pageNum, String author, String date) {
        this.name = name;
        this.pageNum = pageNum;
        this.author = author;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
