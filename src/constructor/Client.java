package constructor;

import collections.Payment;

class Parent {
    public static String name;
//    public static void SetName(String name){
//        name = name;
//    }
}

class Child extends Parent{
    public static String parentName;
    public static String childName;

    public static void setName(String name, String parentName){
        childName = name;
        parentName = parentName;

    }
}
public class Client {
    public static void main(String[] args) {
//        School2 s2 = new School2();
//        System.out.println(School2.permanentLocation);
//        School2.changeLocation("Permanent Address2");
//        System.out.println(School2.permanentLocation);
        Parent p = new Parent();
//        Parent.SetName("Parent1");
        Child c = new Child();
        Child.setName("child1", "P22");
        System.out.println(Child.childName);
        System.out.println(Child.parentName);


    }
}
