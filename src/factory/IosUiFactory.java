package factory;

import factory.button.Button;
import factory.button.IosButton;

public class IosUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }
}
