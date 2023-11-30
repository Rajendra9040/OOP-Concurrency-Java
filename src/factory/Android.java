package factory;

public class Android implements FlutterI{
    public String platform = "Android";
    @Override
    public UiFactory createUiFactory() {
        return new AndroidUiFactory();
    }
}
