public class Product{
    private double price;
    private int stockQuantity;
    private int soldQuantity;


    public Product(double p, int stock) {
        price = p;
        stockQuantity = stock;
    }

    //gets private variables by returning them
    public double getPrice(){ return this.price; }
    public int getStockQuantity(){
       return stockQuantity;
    }
    public int getSoldQuantity(){
        return soldQuantity;
    }

    //add the number of items being sold
    public void setSoldQuantity(int numberOfStockSold){
        this.soldQuantity += numberOfStockSold;
    }
    //subtract number of items being taken from stock
    public void setStockQuantity (int numberOfStockSold){
        this.stockQuantity -=numberOfStockSold;
    }



    //sellUnits takes a number that represents the amount of an product being bought
    public double sellUnits(int amount) {
        double revenue = 0;
//if the stock quantity is larger than the amount of products being bought
        if (stockQuantity >= amount) {
            //then call the setStockQuantity and setSoldQuantity
            setStockQuantity(amount);
            setSoldQuantity(amount);
            //add profit to revenue
            revenue += (price * amount);
        }
        return revenue ;

    }
}
