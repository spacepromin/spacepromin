
package project;

public class calculation extends main 
{    
    
    double t =calc_tax();
    @Override
    public double calc_revenue()   
    {
        return quantity*price;
    }       
    @Override
    public double calc_tax()
    {    
        return calc_revenue()*0.15;
    }
    @Override
    public double calc_profit()
    {
        return calc_revenue()-t;
    } 
    public calculation(String product_name, int expire_date, int manufacture_date, double serial_number, String product_type, String made_in, double price, double quantity) {
       super(product_name, expire_date, manufacture_date, serial_number, product_type, made_in, price, quantity);
    }
          public calculation()
          {       }
    
   
    }
    
    

