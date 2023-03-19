package factory_method.teoria;

public class ExcelDocument extends Document{
    @Override
    public void open() {
        System.out.println("open excel document");
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
