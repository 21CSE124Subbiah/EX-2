package electric;

import java.util.Scanner;

public class Electric {
    public static void main(String[] args) {
        
        consumer obj=new consumer();
        obj.getdata();
        obj.dbill();
        obj.cbill();
        System.out.println("Amount="+obj.bill);
    }
}
class consumer
{
    String name;
    int num;
    int pr;
    int cr;
    String type;
    double bill;
    void getdata()
    {
    
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the details");
        System.out.println("Enter the consumer number");
        num=obj.nextInt();
        System.out.println("Enter name");
        name=obj.next();
        System.out.println("Enter previous month reading");
        pr=obj.nextInt();
        System.out.println("Enter current month reading");
        cr=obj.nextInt();
        System.out.println("Enter type if 'C' is consumer or 'd' is domestic");
        type=obj.next();
        if(type.equals('c')||type.equals('C'))
        {
            cbill();
        }
        else 
        {
            dbill();
        }
    
    }    
    void dbill()
    {
        if(cr<=100)
        {
            bill=(1.50*cr);
        }   
        else if(cr>100&&cr<=200)
        {
        
           bill=(100*1.50)+((cr-100)*3); 
        }
        else if(cr>200&&cr<=500)
        {
        
            bill=(100*1.50)+(100*3)+((cr-200)*4.50);
        }
        else 
        {
        
            bill=(100*1.50)+(100*3)+(300*4.50)+((cr-500)*7);
        }
    }
        
    void cbill()
    {
        if(cr<=100)
        {
            bill=2.50*cr;
        }   
        else if(cr>100&&cr<=200)
        {
        
           bill=(100*2.50)+((cr-100)*5); 
        }
        else if(cr>200&&cr<=500)
        {
        
            bill=(100*2.50)+(100*5)+((cr-200)*6.50);
        }
        else 
        {        
            bill=(100*2.50)+(100*5)+(300*6.50)+((cr-500)*9);  
        }
    }
}

    private void cbill() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void bill() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
