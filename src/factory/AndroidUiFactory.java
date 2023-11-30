package factory;

import factory.button.AndroidButton;
import factory.button.Button;

public class AndroidUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
