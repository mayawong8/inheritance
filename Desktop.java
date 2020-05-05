public class Desktop extends Computers{
    private String profile;

    public Desktop(double p, int stock, double cpu, int r, boolean ssd, int st, String pro){
        super(p,stock, cpu, r, ssd, st);
        profile = pro;
    }

    //calls supers sellUnits
    public double sellUnits(int amount){
        return super.sellUnits(amount);
    }

    //returns unique variable then calls super's toString
    public String toString(){
        return profile + " Desktop PC with " + super.toString();
    }

}
