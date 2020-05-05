public class Laptop extends Computers{
    private double screenSize;

    public Laptop(double p, int stock, double cpu, int r, boolean s, int st, double size){
        super(p, stock, cpu, r, s ,st);
        screenSize = size;
    }

    //calls super class's sellUnit method
    public double sellUnits(int amount) {
       return super.sellUnits(amount);
    }

    //returns unique variable then calls super's toString
    public String toString () {
        return screenSize + " inch Laptop PC with " + super.toString();

        }

    }


