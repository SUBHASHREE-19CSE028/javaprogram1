/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
/**
 *
 * @author INTEL
 */
class box
{
    double height;
    double width;
    double depth;
}
public class volume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        box obj=new box();
        obj.depth=10;
        obj.width=20;
        obj.height=30;
        double vol=obj.depth*obj.width*obj.height;
        System.out.println("volume"+vol);
        
        
    }
    
}
