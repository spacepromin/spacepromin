
package project;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
public class menubar {
    public static void main(String[] args) 
    {            
        int c,n,k,search,lenght,array[];   
        int count=0;
        
        calculation m1=new calculation();//"ont",23,43,2,"re","rerw",34,2
        //functions f1=new functions();
        
        File file=new File("abc.txt");
    Scanner in=new Scanner (System.in);
           
    System.out.print("\t\t-------product menu-------");
    System.out.print("\n 1.INSERT INFORMATION");
    System.out.print("\n 2.LIST ALL DATA");
    System.out.print("\n 3.INSERT NEW DATA");
    System.out.print("\n 4.SEARCH FOR RECORD");
    System.out.print("\n 5.SORT ENTRIES");
    System.out.print("\n 6.REVENUE");
    System.out.print("\n 7.TAX");
    System.out.print("\n 8.PROFIT");
    System.out.print("\n 9.EXIT");
    System.out.println("\n\t enter your choice");
        //n=in.nextInt();       
       
      // array=new int[k];
        while((n=in.nextInt())!=9){
           
      if (n==1)
      {     System.out.println("how many?");
            k=in.nextInt();
            for(c=0;c<k;c++)
            //array=new int[k];
          
        {   try{
          if(!file.exists()){
                  file.createNewFile();
          }
          {            
              PrintWriter pw=new PrintWriter(file);
               
          System.out.println ("enter product name");
                m1.product_name=in.next();
                pw.println(m1.product_name);
            System.out.println ("enter product expire date(in year)");
                m1.expire_date=in.nextInt();
                pw.println(m1.expire_date);
            System.out.println ("enter product manufacture date(in year)");
                m1.manufacture_date=in.nextInt();
                pw.println(m1.manufacture_date);
            System.out.println ("enter product serial number");
                m1.serial_number=in.nextDouble();
                pw.println(m1.serial_number);
            System.out.println ("enter product type");
                m1.product_type=in.next();
                pw.println(m1.product_type);
            System.out.println ("enter product counrty");
                m1.made_in=in.next();
                pw.println(m1.made_in);
            System.out.println ("enter product price");
                m1.price=in.nextInt();
                pw.println(m1.price);
            System.out.println ("enter product quantity");
                m1.quantity=in.nextInt();
                pw.println(m1.quantity);
                pw.close();
                
      }}
        catch (IOException e){
              e.printStackTrace();}
        }}
      else if(n==2)  
      {  
          System.out.print("name"+"\t"+"ex_date"+ "\t" +"mn_date"+ "\t" +"s_number"+ "\t" +"p_type"+"\t"+"p_country"
             +"\t"+"price"+"\t"+"quantity"+"\t"+"profit"+"\t"+"tax"+"\t"+"revenue\n");
          //k=in.nextInt();
          
          //for(c=0;c<k;c++) 
         // for(int counter=0;counter<m1.length;counter++){
              
        System.out.println(m1.product_name+ "\t" +m1.expire_date+ "\t" +m1.manufacture_date+ "\t" +m1.serial_number+ "\t" +m1.product_type
         + "\t" +m1.made_in+ "\t" +m1.price+ "\t" +m1.quantity+ "\t" +m1.calc_profit()+ "\t" +m1.calc_tax()+ "\t" +m1.calc_revenue()
         );}
     // }
      else if (n==3){
          
          System.out.println ("---insert product information----");
          
          try{
          if(!file.exists()){
                  file.createNewFile();
          }
          {
              PrintWriter pw=new PrintWriter(file);
            System.out.println ("enter product name");
                m1.product_name=in.next();
                pw.println(m1.product_name);
               
            System.out.println ("enter product expire date(in year)");
                m1.expire_date=in.nextInt();
                pw.println(m1.expire_date);
                
            System.out.println ("enter product manufacture date(in year)");
                m1.manufacture_date=in.nextInt();
                pw.println(m1.manufacture_date);
               
            System.out.println ("enter product serial number");
                m1.serial_number=in.nextDouble();
                pw.println(m1.serial_number);
                
            System.out.println ("enter product type");
                m1.product_type=in.next();
                pw.println(m1.product_type);
                
            System.out.println ("enter product counrty");
                m1.made_in=in.next();
                pw.println(m1.made_in);
                
            System.out.println ("enter product price");
                m1.price=in.nextInt();
                pw.println(m1.price);
                
            System.out.println ("enter product quantity");
                m1.quantity=in.nextInt();
                pw.println(m1.quantity);
                pw.close();
          } }
          catch (IOException e){
           e.printStackTrace();}        
        }
      else if (n==4)
      {
         
       // k=in.nextInt();
       // array=new int[k];
       // for(c=0;c<k;c++)
       // array[c]=in.nextInt();
        System.out.println("enter your searial number to find");
        search=in.nextInt();
        //for(c=0;c<k;c++)
        {
        if( m1.serial_number==search){
            System.out.println("!!!--present--!!!");
            System.out.println(m1.product_name);
            System.out.println(m1.expire_date);
            System.out.println(m1.manufacture_date);
            System.out.println(m1.serial_number);
            System.out.println(m1.product_type);
            System.out.println(m1.made_in);
            System.out.println(m1.price);
            System.out.println(m1.quantity);
        }}
       // if(c==k)
        System.out.println("OOPS!!!--- is not present in array.");           
      }
      else if (n==5)
      {
           System.out.println ("we didn't work!");
       /*for(c=0;c<k;c++)
       {
          for(int i=0; i<m1.product_name.length; i++)
          {  
          System.out.println(m1.product_name);
            System.out.println(m1.expire_date);
          }
       }*/
                
      }
      else if (n==6)
          System.out.println (m1.calc_revenue());
      else if (n==7)
           System.out.println (m1.calc_tax());
      else if (n==8)        
           System.out.println (m1.calc_profit());
      System.out.println("\t enter your choice");
        }     
          System.out.println("\t you have done have a great day2!!!");
    }  
}
