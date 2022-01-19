import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private final String s;
    private String a;
    private String b;
    private String c;
    private Paragraph aux;
    private ArrayList<Paragraph> Paragraph = new ArrayList<>();

    public SubChapter(String s){
        this.s = s;
    }

    public void createNewParagraph(String a) {
        aux = new Paragraph(a);
        this.Paragraph.add(aux);
    }

    public void createNewImage(String b) {
        this.b = b;
    }

    public void createNewTable(String c) {
        this.c =c;
    }

   /* public void print() {
        System.out.println("Subchapter: " + s );
        //for (int i=0;i<this.Paragraph.size();i++)
            //System.out.println(this.Paragraph.get(i).getA());
        System.out.println("Imagine with name: " + b);
        System.out.println("Table with Title: " + c);
    }*/
}
