//ToasterOven and Fridge extends KitchenAppliances
public class KitchenAppliances extends Product{
    private int wattage;
    private String colour;
    private String brand;

    public KitchenAppliances(double p, int stock,  int w, String c, String b){
        super(p,stock);
        wattage = w;
        colour = c;
        brand = b;
    }
    //gets private variable brand
    public String getBrand(){
        return brand;
    }

    //common String that is contained in subclasses
    public String toString(){
        return " (" + colour + ", " + wattage + " watts) (" + getPrice() + " dollars each, " + getStockQuantity() + " in stock, " + getSoldQuantity() + " sold)";
    }
}
