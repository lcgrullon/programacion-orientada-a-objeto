/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.treads;

/**
 *
 * @author armym
 */


public class PracticaTreads {

   
    public static class facto implements Runnable
    {
         
          
        @Override
        public void run() 
        {
            //declarando valores del vector
            int valores[] = {10,5,6,8,9};
            double total = 0;
            //iniciando cilo de busqueda del valor
            for(int i = 0; i < valores.length;i++)
            {
                
                double fact = 1;
                for(int j = valores[i]; j > 1; j--)
                {
                    fact = j*fact;
                }
                total += fact;
                System.out.println("el factorial de h1 de " + valores[i] + " es =  " + fact +".");
            }
            System.out.println("el total de h1 es = " + total + ".");
        }
    }
    
    public static class facto2 extends Thread
    {
        @Override
        public void run() 
        {
            //declarando valores del vector
            int valores[] = {10,5,6,8,9};
            double total = 0;
            //iniciando cilo de busqueda del valor
            for(int i = 0; i < valores.length;i++)
            {
                
                double fact = 1;
                for(int j = valores[i]; j > 1; j--)
                {
                    fact = j*fact;
                }
                total += fact;
                System.out.println("el factorial de h2 de " + valores[i] + " es =  " + fact +".");
            }
            System.out.println("el total de h2 es = " + total + ".");
        }
      
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        (new Thread(new facto())).start();
         new facto2().start();
    }
       
}
