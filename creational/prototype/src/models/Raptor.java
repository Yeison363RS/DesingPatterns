package models;

public class Raptor extends Bird{
    private double sizePeak;
    private double sizeClaws;
    public Raptor(Raptor prototype){
        super(prototype.getName());
        this.sizePeak=prototype.getSizePeak();
        this.sizeClaws=prototype.getSizeClaws();
    }

    public Raptor(String name){
        super(name);
    }

    @Override
    public Bird cloneBird() {
        return new Raptor(this);
    }

    public double getSizePeak(){
        return this.sizePeak;
    }

    public double getSizeClaws(){
        return this.sizeClaws;
    }
}
