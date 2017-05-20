/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;
import java.lang.*;
/**
 *
 * @author DEBMALYA
 */
public class JavaApplication29 implements Runnable  {
    
        //int i=0;
        @Override
    public void run()
    {
        
        for (int i=0;i<5;i++)
        {
            try{
            Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                System.out.println("Exception " +e);
            }
                        System.out.println("The " +Thread.currentThread().getName()+ "is running - " +i);

        }
    }
            
    public static void main(String[] args) {
        JavaApplication29 j1 = new JavaApplication29();
        Thread t2 = new Thread(j1);
        //System.out.println("The current thread is :" +t2.toString());
        Thread t1 = new Thread(j1);
        t1.run();
        t2.run();
        
    }
    
}
