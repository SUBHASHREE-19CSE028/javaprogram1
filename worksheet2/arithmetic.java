/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
import java.util.*;
class values
{
    int a,b;
 
    

void getvalue()
{
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter the values:");
 a=obj.nextInt();
 b=obj.nextInt();
}
void add()
{
    System.out.println("Addition:"+(a+b));
}
void sub()
{
    System.out.println("Subtraction:"+(a-b));
   
}
void mul()
{
    
    System.out.println("Multiplication:"+(a*b));
}
void div()
{
    System.out.println("Division:"+(a/b));
}
}
public class arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       values obj=new values();
       obj.getvalue();
       obj.add();   //without arguments without return
       obj.sub();
       obj.mul();
       obj.div();
       
    }
}

