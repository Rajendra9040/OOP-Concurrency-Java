package factory.button;

public class AndroidButton implements Button {
    public String buttonName = "android button";

    @Override
    public String getName() {
        return this.buttonName;
    }
}
