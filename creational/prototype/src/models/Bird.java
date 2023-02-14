package models;

public class Bird implements Prototype{
    private String name;
    public Bird(String name){
        this.name=name;
    }
    
    @Override
    public Prototype cloneBird() {
        return new Bird(this.name);
    }
    
    public String getName(){
        return this.name;
    }
}
