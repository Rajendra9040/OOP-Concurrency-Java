package factory;

public class UiFactoryFactory {
    public static UiFactory getUiFactory(String platform) {
        if (platform.equals("Android")) {

            return new AndroidUiFactory();
        } else if (platform.equals("Ios")) {

            return new IosUiFactory();
        }

        return null;
    }
}
