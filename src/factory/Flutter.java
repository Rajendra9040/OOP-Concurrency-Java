package factory;

public class Flutter {
    public void setThem() {
        System.out.println("Theme set done.");
    }

    public UiFactory createUiFactory(String platform) {

        return UiFactoryFactory.getUiFactory(platform);
    }
}
