package models;

public class Product {
    
    private TypeProduct typeProduct;

    public Product(TypeProduct typeProduct){
        this.typeProduct=typeProduct;
    }

    public TypeProduct getTypeProduct(){
        return this.typeProduct;
    }
}
