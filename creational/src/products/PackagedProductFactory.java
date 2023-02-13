package products;

public class PackagedProductFactory implements ProductFactory{

    @Override
    public void almacenar() {
        System.out.println("Call function to store a packaged product");
    }

    @Override
    public void transportar() {
        System.out.println("Call function to transport a packaged product");        
    }
    
}
