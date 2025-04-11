
import java.io.Serializable;
import java.time.LocalDate;

public class BlogPost implements Serializable {
    private String title;
    private String content;
    private LocalDate date;

    public BlogPost(String title, String content) {
        this.title = title;
        this.content = content;
        this.date = LocalDate.now();
    }

    public String getTitle() { return title; }
    public String getContent() { return content; }
    public LocalDate getDate() { return date; }

    @Override
    public String toString() {
        return "Title: " + title + "\nDate: " + date + "\nContent:\n" + content + "\n";
    }
}
