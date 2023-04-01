package builder.teoria;

public class Main {
    public static void main(String[] args) {
        RTFReader reader = new RTFReader(new ASCIIConverter());
        String texto = reader.parserRTF("char font para");
        System.out.println(texto);

        reader.setBuilder(new TeXConverter());
        texto = reader.parserRTF("char font para");
        System.out.println(texto);
    }
}
