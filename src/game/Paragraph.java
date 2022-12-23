package game;

public class Paragraph {
    private  String paragraphName;
    private String paragraphText;


    public  String getParagraphName() {
        return paragraphName;
    }

    public  void setParagraphName(String paragraphName) {
        this.paragraphName = paragraphName;
    }

    public String getParagraphText() {
        return paragraphText;
    }

    public void setParagraphText(String paragraphText) {
        this.paragraphText = paragraphText;
    }

    public Paragraph(){}
    public Paragraph(String paragraphName) {
        this.paragraphName = paragraphName;
    }

}
