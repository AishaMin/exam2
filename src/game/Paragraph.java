package game;

public class Paragraph {
    public String paragraphName;
    private String paragraphText;


    public String getParagraphName() {
        return paragraphName;
    }

    public  void setParagraphName(String paragraphName) {
        this.paragraphName = paragraphName;
    }

    public Paragraph(){}
    public Paragraph(String paragraphName) {
        this.paragraphName = paragraphName;
    }

}
