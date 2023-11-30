package factory;

import factory.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.createUiFactory("Android");
        Button button = uiFactory.createButton();
        System.out.println(button.getName());

        FlutterI flutterI = new Android();
        UiFactory uiFactory1 = flutterI.createUiFactory();
        System.out.println("hay");


    }
}
