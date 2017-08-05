/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorthreads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author armym
 */
public class ContadorThreads {

    /**
     * @param args the command line arguments
     */
    public static class cont1 implements Runnable
    {     
          
        @Override
        public void run() 
        {
           
            //iniciando cilo de busqueda del valor
            for(int i = 1; i < 11;i++)
            {
                if(i == 5 || i==10)
                {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ContadorThreads.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                System.out.println("el contador del hilo 1 es " + i +".");
            }
            
        }
    }
    
    public static class cont2 extends Thread
    {
        @Override
        public void run() 
        {
           
            for(int i = 1;i<11;i++)
            {
                if (i == 5 )
                    try {
                        Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ContadorThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("el contador del hilo 2 es " + i +".");
            }
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Thread( new cont1()).start();
         new cont2().start();
    }
    
}
