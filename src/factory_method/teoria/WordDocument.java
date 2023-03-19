package factory_method.teoria;

public class WordDocument extends Document {
    @Override
    public void open() {
        System.out.println("open word document");
    }

    @Override
    public void close() {

    }

    @Override
    public void save() {

    }

    @Override
    public void revert() {

    }
}
