package models;

public class Bicycle{
    private String brand;
    private boolean shifts;
    private int numberShifts;
    private String color;

    public Bicycle(BicycleBuilder builder){
        this.brand=builder.brand;
        this.shifts=builder.shifts;
        this.numberShifts=builder.numberShifts;
        this.color=builder.color;
    }
    public static BicycleBuilder getBuider(){
        return new BicycleBuilder();
    }
    @Override
    public String toString(){
        return "marca: "+brand+"  have Shifts: "+shifts+" number shifts: "+ numberShifts+" color: "+color; 
    }
    public static class BicycleBuilder{
        private String brand;
        private boolean shifts;
        private int numberShifts;
        private String color;

        public BicycleBuilder(){

        }

        public BicycleBuilder setBrand(String brand){
            this.brand=brand;
            return this;
        }
        public BicycleBuilder haveShifts(boolean shifts){
            this.shifts=shifts;
            return this;
        }
        public BicycleBuilder setNumberShifts(int numberShifts){
            this.numberShifts=numberShifts;
            return this;
        }
        public BicycleBuilder setColor(String color){
            this.color=color;
            return this;
        }
        public Bicycle build(){
            return new Bicycle(this);
        }
    }

}