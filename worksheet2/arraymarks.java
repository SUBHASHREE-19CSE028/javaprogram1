/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
import java.util.*;
class student1
{
    int m1,m2,m3;
    String name;
    String dept;
    String Status;
    float ave;
    
    
void getvalue()
{
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the values");
    m1=obj.nextInt();
    m2=obj.nextInt();
    m3=obj.nextInt();
    name=obj.next();
    dept=obj.next();
}
    
    void gradcal()
    {
        
        ave=(m1+m2+m3)/3;
        if (ave>=80)
            Status="First class";
        else if(ave>=70 && ave<80)
            Status="Second class";
        else if(ave>=50 && ave<70)
            Status="Third class";
        else
            Status="fail";
    }
    void display()
    {
        System.out.println("Name;"+name);
        System.out.println("Department:"+dept);
        System.out.println("Maths:"+m1);
        System.out.println("Physics:"+m2);
        System.out.println("Chemistry:"+m3);
        System.out.println("Average:"+ave);
        System.out.println("Status"+Status);
        
    }
    
}
        

/**
 *
 * @author INTEL
 */
public class arraymarks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]=new int[10];
        student1 obj[];
        obj = new student1[100];
        for(int i=0;i<100;i++)
        {
            obj[i]=new student1();
            obj[i].getvalue();
            obj[i].gradcal();
            obj[i].display();
            
        }
    }
    
}
