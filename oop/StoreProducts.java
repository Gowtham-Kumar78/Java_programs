

/*
 * 17. Create classes to store details for two different types of Products,
   a) ImportedProducts which have import duty.
   b) DiscountedProducts which have a discount rate.
   All products have name and base_price.
   Create required Constructors and following methods: print(), getNetPrice(), setPrice(), setImportDuty(), setDiscountRate() 
   also experiment with upcasting and downcasting.

 */
class ImportedProducts{
  String name;
  int base_price;

  int impPrice=10;

  

  public ImportedProducts(String name, int base_price) {
    this.name = name;
    this.base_price = base_price;
  }

  public void print(){
    System.out.println("Name : "+this.name + " & Price : "+(this.base_price+impPrice));
  }

  public void setPrice(int price){
    base_price=price;
  }

  public void setImportDuty(int price){
    impPrice=base_price+price;
  }

  public void getNetPrice(){
    System.out.printf("Net price of %s  is %d \n",name,base_price);
  }

}


class DiscountedProducts extends ImportedProducts{

    public DiscountedProducts(String name, int base_price) {
        super(name, base_price);
    }

      
    // public void print(){
    //   System.out.println(" this is child");
    // }

    public void setDiscountRate(int price){
      base_price-=price;
    }

    
  

    
  
}

public class StoreProducts {
    public static void main(String[] args) {

        // ImportedProducts i = new ImportedProducts("mango", 300);
        // i.getNetPrice();
      
        ImportedProducts d =  new DiscountedProducts("apple", 200);  // upcasting
        DiscountedProducts d2 = (DiscountedProducts)d;                               // downcasting
        d.print();
        d.getNetPrice();
        d.setPrice(400);
        d.print();
        d.setImportDuty(50);
        d.print();
        d2.setDiscountRate(100);// accessed through down casting
        d.print();
        
        
    }
}
