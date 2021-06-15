
package project;

public abstract class main {
    protected  String product_name;
    protected  int expire_date;
    protected  int manufacture_date;
    protected  double serial_number;
    protected  String product_type;
    protected  String made_in;
    protected  double price;
    protected  double quantity;

    public main(String product_name, int expire_date, int manufacture_date, double serial_number, String product_type, String made_in, double price, double quantity)
    {   this.product_name = product_name;
        this.expire_date = expire_date;
        this.manufacture_date = manufacture_date;
        this.serial_number = serial_number;
        this.product_type = product_type;
        this.made_in = made_in;
        this.price = price;
        this.quantity = quantity;
    }
    public main()
    {    }
    abstract public double calc_revenue();
    
    abstract public double calc_tax();
    
    abstract public double calc_profit();
    
   /* abstract public void LIST_ALL_DATA();
      
    abstract public void INSERT_NEW_DATA();   
      
    abstract public void  SEARCH_FOR_RECORD();
     
    abstract public void SORT_ENTRIES();
            */
            
}
