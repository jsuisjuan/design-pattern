package builder.teoria;

public class TeXConverter extends TextConverter {
    @Override
    public String convertChar(String s) {
        return "CHAR TeX,";
    }

    @Override
    public String convertFont(String s) {
       return "FONT TeX,";
    }

    @Override
    public String convertParagraph(String s) {
        return "PARAGRAPH TeX";
    }
}
