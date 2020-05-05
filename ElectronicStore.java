import java.util.Scanner;
public class ElectronicStore{
    private final int MAX_PRODUCT = 10;
    private String name;
    private double revenue;
    private Product [] products = new Product[MAX_PRODUCT];


    public ElectronicStore(String n) {
        name = n;
    }

    public String getName(){
        return name;
    }

//add product to array
    public boolean addProduct(Product p){
        boolean check = false;
        //loops until end of array
        for (int i=0;i<products.length;i++){
            //wherever the first null (end of filled elements) is replace with the new product
            if (products[i]==null){
                products[i]=p;
                //check is equal to true if product p was able to be added to the array
                check=true;
                //if product p was successfully added stop looping and return true
                break;
            }
        }
        //if product p was not added the original values of check which is false would be returned
        return check;
    }
//prints out products
    public  void sellProducts(){
        Scanner in = new Scanner(System.in);
        //asks user for index of product in the product array
        System.out.println("Enter the product's index that you would like to sell [0,10]: ");
        String input1 = in.nextLine();
        //convert users input which is a string to an int
        int productIndex = Integer.parseInt(input1);

        //ask user for number of units to sell
        System.out.println("Number of units to sell: ");
        String input2 = in.nextLine();
        //convert users input which is a string to an int
        int numUnits = Integer.parseInt(input2);

        //checking if the # of units that are to be sold is greater than 0 and the array's index less than or equal to the max
        if (numUnits>0 && productIndex<=MAX_PRODUCT){
            //checking if the array at the given index is not empty
            if (products[productIndex]!=null) {
                //checking if the products stock quantity is larger or equal to the number of items being sold
                if (products[productIndex].getStockQuantity() >= numUnits) {
                    //call setStockQuantity to change number of stock left
                    products[productIndex].setStockQuantity(numUnits);
                    //call setSoldQuantity to change number of stock sold
                    products[productIndex].setSoldQuantity(numUnits);
                    //calculate earnings and add to revenue
                    revenue += (products[productIndex].getPrice() * numUnits);
                }
            }
        }
    }

//same as previous method only with parameters instead of user input
    public void sellProducts(int item, int amount) {
        if (amount>0 && (item<=MAX_PRODUCT)) {
            if (products[item] != null) {
                if (products[item].getStockQuantity() >= amount) {
                    products[item].setSoldQuantity(amount);
                    products[item].setStockQuantity(amount);
                    revenue += amount * products[item].getPrice();
                }
            }
        }
        for (int i=0;i<MAX_PRODUCT;i++) {
            //is index is not empty print the toString of array at i
            if (products[i] != null) {
                System.out.println(products[i].toString());
            }
        }
        }


    public double getRevenue() {
        return revenue;
    }

    public void printStock() {
        int count = 0;
//loops through products array
        for (int i=0;i<MAX_PRODUCT;i++) {
            //is index is not empty print the toString of array at i
            if (products[i] != null) {
                System.out.println(products[i].toString());
            }
        }

}}