package builder.teoria;

public class ASCIIConverter extends TextConverter {
    @Override
    public String convertChar(String s) {
        return "CHAR ASCII,";
    }

    @Override
    public String convertFont(String s) {
       return "FONT ASCII,";
    }

    @Override
    public String convertParagraph(String s) {
        return "PARAGRAPH ASCII";
    }
}
