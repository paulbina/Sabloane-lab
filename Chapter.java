import java.lang.String;
import java.util.ArrayList;

public class Chapter {
    private ArrayList<SubChapter> subChapters = new ArrayList<>();
    private final String s;
    private SubChapter c;

    public Chapter(String s) {
        this.s = s;
    }

    public int createSubChapter(String s) {
        c = new SubChapter(s);
        this.subChapters.add(c);
        return this.subChapters.indexOf(c);
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return this.subChapters.get(indexSubChapterOneOne);
    }
}
