package products;

public class FreshProductFactory implements ProductFactory{

    @Override
    public void almacenar() { 
        System.out.println("Call function to store fresh product");
    }

    @Override
    public void transportar() {
        System.out.println("Call function to transport fresh product"); 
    }
    
}
