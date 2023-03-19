package factory_method.teoria;

public class WordApplication extends Application{
    @Override
    public Document createDocument(){
        return new WordDocument();
    }
}
