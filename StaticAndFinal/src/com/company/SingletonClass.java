package com.company;
class CoffeeMachine{
    private double coffeeQty;
    private double milkQty;
    private double sugarQty;
    private double waterQty;

    static private CoffeeMachine my = null;
    private CoffeeMachine(){
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty =1;
    }

    public void setMilkQty(double milkQty){
        this.milkQty = milkQty;
    }
    public void setWaterQty(double waterQty){
        this.waterQty = waterQty;
    }
    public void setSugarQty(double sugarQty){
        this.sugarQty = sugarQty;
    }
    public double getCoffeeQty(){
        return coffeeQty;
    }

    static public CoffeeMachine getInstance(){
        if(my == null)
            my = new CoffeeMachine();
        return my;
    }
}
public class SingletonClass {
    public static void main(String[] args) {
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();
        CoffeeMachine c3 = CoffeeMachine.getInstance();

        System.out.println(c1.getCoffeeQty());

        System.out.println(c1+" "+c2+" "+c3);
        if(c1==c2 && c1==c3)
            System.out.println("Same");
    }
}
