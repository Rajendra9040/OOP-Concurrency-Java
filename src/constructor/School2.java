package constructor;

public class School2 {
    protected String location;
    public static String permanentLocation = "Permanent Address";
    public static void changeLocation(String newLocation){
        permanentLocation = newLocation;
//        System.out.println(permanentLocation);
    }

}
