import models.CreationalProduct;
import models.Product;
import models.TypeProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Product pro1 =new Product(TypeProduct.FRESH);
        Product pro2 =new Product(TypeProduct.PACKAGED);
        CreationalProduct creational= new CreationalProduct();
        creational.assignProcess(pro1).almacenar();
        creational.assignProcess(pro2).almacenar(); 
    }
}
