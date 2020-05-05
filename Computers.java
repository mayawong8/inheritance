public class Computers extends Product{
    private double cpuSpeed;
    private int ram;
    private boolean ssd;
    private int storage;

    public Computers(double p, int stock, double cpu, int r, boolean s, int st) {
        super(p, stock);
        cpuSpeed =cpu;
        ram = r;
        ssd = s;
        storage = st;
    }

    //returns a string that represents SSD or HDD
    public String type(boolean ssd){
        String type;

        if (ssd==true){ type = "SSD"; }
        else { type = "HDD"; }
        return type;
    }

    //calls type method to return SSD or HDD and uses super's toString
    public String toString(){
        return cpuSpeed + "ghz CPU, " + ram + "GB RAM, " + storage + "GB " + type(ssd) + " drive. (" + getPrice() + " dollars each, "+ getStockQuantity() + " in stock, "+ getSoldQuantity() + " sold)";
    }
}

