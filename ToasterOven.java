public class ToasterOven extends KitchenAppliances{

    private int width;
    private boolean convection;

    public ToasterOven(double p, int stock, int w, String c, String b, int wid, boolean convec){
        super(p, stock, w, c, b );
        width = wid;
        convection = convec;
    }
    //calls the super class's sellUnits method
    public double sellUnits(int amount) {
        return super.sellUnits(amount);
    }

    //returns the unique string depending if the boolean is true or false then also returns super class's toString
    public String toString() {
        if (convection == true) {
            return width + " inch " + super.getBrand() + " with convection" + super.toString();
        } else {
            return width + " inch " + super.getBrand() + super.toString();
        }
    }


}
