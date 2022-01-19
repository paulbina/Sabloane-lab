public class Image implements Element {
    private String imageName;

    public Image(String name){
        this.imageName = name;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    @Override
    public void print() {
        System.out.println("ImageName : " + imageName);
    }
}
