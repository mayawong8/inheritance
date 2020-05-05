public class Fridge extends KitchenAppliances{
    private double cubicFeet;
    private boolean hasFreezer;


    public Fridge(double p, int stock,  int w, String c, String b, double cf, boolean f) {
        super(p, stock, w, c, b );
        cubicFeet = cf;
        hasFreezer = f;
    }

    //super class's sellUnit method is called
    public double sellUnits(int amount){
        return super.sellUnits(amount);}

        //returns the unique string depending if the boolean is true or false then also returns super class's toString
    public String toString() {
        if (hasFreezer == true) {
            return cubicFeet + " cu. ft. " + getBrand() + " with Freezer" + super.toString();
        } else {
            return cubicFeet + " cu. ft. " + getBrand() + super.toString();
        }
    }
}
