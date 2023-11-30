package factory;

public class Ios implements FlutterI{
    public String platform = "Ios";
    @Override
    public UiFactory createUiFactory() {
        return new IosUiFactory();
    }
}
