package factory.button;

public class IosButton implements Button {
    public String buttonName = "ios button";

    @Override
    public String getName() {
        return this.buttonName;
    }
}
