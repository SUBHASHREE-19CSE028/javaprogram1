/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
import java.util.*;
/**
 *
 * @author INTEL
 */
class box1
{
    double height;
    double depth;
    double width;
   

void getvalue()
{
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter values:");
    depth=obj.nextDouble();
    width=obj.nextDouble();
    height=obj.nextDouble();
}
 void volume()
 {
     double vol=depth*height*width;
     System.out.println("volume"+vol);
  
         
     
    
}

}
public class volume1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        box1 obj=new box1();
        obj.getvalue();
        obj.volume();
        
        box1 obj1=new box1();
        obj1.getvalue();
        obj1.volume();
    }
    
}
