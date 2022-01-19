import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private List<Element> elements;
    private String title;
    private Paragraph name;
    private Section name2;
    private Image name3;

    public Section(String title){
        this.elements = new ArrayList<>();
        this.title = title;
    }

    public void addElement(Element element){
        elements.add(element);
    }

    public void removeElement(Element element){
        elements.remove(element);
    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element e: elements)
            e.print();
    }

    public void add(Paragraph name) {
        this.name = name;
    }

    public void add(Section name2) {
        this.name2 = name2;
    }
    public void add(Image name3) {
        this.name3 = name3;
    }
}
