package models;

import factories.FactoryProduct;
import factories.FreshProductFactory;
import factories.PackagedProductFactory;
import factories.ProductFactory;

public class CreationalProduct {
    public ProductFactory assignProcess( Product product){
        ProductFactory concreteProduct ;
        if(product.getTypeProduct()==TypeProduct.FRESH){
            concreteProduct = new FreshProductFactory() ;
        }else{
            concreteProduct = new PackagedProductFactory() ;
        }
        return concreteProduct;
    }
}
