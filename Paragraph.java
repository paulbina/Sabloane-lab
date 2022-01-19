import java.util.ArrayList;

public class Paragraph implements Element {
    //private final String a;
    private final String name;
    private String text;
    private ArrayList<Paragraph> Paragraphs = new ArrayList<>();
    private Paragraph aux;
    private String names;
    private String s;


    public void createParagraphs(String names) {
        aux = new Paragraph(names);
        this.Paragraphs.add(aux);
        //return this.Paragraphs.indexOf(aux);
    }
    public Paragraph getParaghraps(int indexParagraph) {
        return this.Paragraphs.get(indexParagraph);
    }

    public Paragraph(String name) {
        this.name = name;
    }

    /*public String getA() {
        return a;
    }*/
    public String getText(){
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public void print(){
        System.out.println("Paragraph text: " + name);

    }
}
