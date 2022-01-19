import java.util.ArrayList;
import java.lang.String;

public class Book {
    private String name;
    private ArrayList<Author> Authors = new ArrayList<>();
    private ArrayList<Chapter> Chapters = new ArrayList<>();
    private String s;
    private Chapter c;

    public Book(String name) {
        this.name = name;
    }

    public void addAuthor(Author name) {
        this.Authors.add(name);
    }

    public int createChapter(String s) {
        c = new Chapter(s);
        this.Chapters.add(c);
        //System.out.println(this.Chapters.indexOf(c));
        return this.Chapters.indexOf(c);
    }

    public Chapter getChapter(int indexChapterOne) {
        //System.out.println(this.Chapters.get(indexChapterOne));
        return this.Chapters.get(indexChapterOne);

    }
}
