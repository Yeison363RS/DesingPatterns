import models.Bicycle;

public class App {
    public static void main(String[] args) throws Exception {
        Bicycle bicycle=Bicycle.getBuider().setBrand("massio").haveShifts(false).setColor("Rojo").build();
        Bicycle bicycle2=Bicycle.getBuider().setBrand("Ntel").haveShifts(true).setNumberShifts(3).setColor("Verde").build();
        System.out.println(bicycle.toString());
        System.out.println(bicycle2.toString());
    }
}
