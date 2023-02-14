import models.Raptor;

public class App {
    public static void main(String[] args) throws Exception {
        Raptor raptor = new Raptor("ralph");
        System.out.println(raptor.getName());
        Raptor raptor2= (Raptor) raptor.cloneBird();
        System.out.println(raptor2.getName());
    }
}
