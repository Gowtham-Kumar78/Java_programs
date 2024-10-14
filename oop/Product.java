/**
 * Product
 * 
 * 12. Create a class(Product) to store details of a product and provide required methods with the details prod_id, prod_name, price,quantity_on_hand
    Methods are:  init(prod_id,prod_name, price)
                 getNetPrice() (returns the price after adding 12% tax)
                 purchase()
                sell()

    13. Introduce multiple constructors in Product class.            
 */
public class Product {
    int productId;
    String productName;
    double price;
    int quantity_on_hand=1;

    Product(){
        System.out.println("Default Constructor");
        productId=0;
        productName=" ";
        price =0.0;

    }
    
    Product(int productId,String productName,double price){
        System.out.println("Parameter Constructor");
        this.productId=productId;
        this.productName=productName;
        this.price=price;

    }

    Product(Product p){
        this.productId=p.productId;
        this.productName=p.productName;
        this.price=p.price;

        System.out.println("Copy Constructor");
    }

    void getNetPrice(){
        double netPrice= quantity_on_hand *(price+(price*0.12));
        System.out.println("net price of "+productName + ": " + netPrice );
    }

    void purchase(int quantity){
        System.out.println("Quantity before purchase: "+quantity_on_hand);
        this.quantity_on_hand+=quantity;
        System.out.println("Quantity after purchase: "+quantity_on_hand);

    }

    void sell(int quantity){

        if(quantity_on_hand-quantity>=0){
            System.out.println("Quantity after selling: "+quantity_on_hand);
            this.quantity_on_hand-=quantity;
            System.out.println("Quantity after selling: "+quantity_on_hand);
        }
        else{
            System.out.println("Products Not Available");
        }
        


    }


    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(1,"Apple",12);
        Product p3 = new Product(p2);
        
        // p1.getNetPrice();

        // p2.getNetPrice();
        // p2.purchase(20);
        // p2.getNetPrice();
        // p2.sell(6);
        // p2.getNetPrice();
        

        p3.getNetPrice();
    }

}